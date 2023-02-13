import java.util.*;


class ServerDetail {
int currMax = 0;
PriorityQueue<String> priorityQueue = new PriorityQueue<>();
}

class Server {

Map<String, ServerDetail> prefixMap = new HashMap<>();



public Server() {

}

public String allocate(String prefix) {
if(!prefixMap.containsKey(prefix)) {
prefixMap.put(prefix, new ServerDetail());
}

ServerDetail detail = prefixMap.get(prefix);

if(detail.priorityQueue.size() > 0) {
return detail.priorityQueue.poll();
} else {

return prefix + ++detail.currMax;
}

}

public void deallocate(String server) {
String prefix = "";
for(int i = server.length()-1; i > 0 ; i--) {
if(!Character.isDigit(server.charAt(i))) {
prefix = server.substring(0, i+1);
break;
}
}

ServerDetail detail = prefixMap.get(prefix);
detail.priorityQueue.add(server);


}

public static void main(String[] args) {
Server server = new Server();
System.out.println(server.allocate("south"));
System.out.println(server.allocate("south"));

server.deallocate("south1");
System.out.println(server.allocate("south"));

System.out.println(server.allocate("south"));
System.out.println(server.allocate("north"));
System.out.println(server.allocate("north"));
System.out.println(server.allocate("north"));

server.deallocate("north2");

System.out.println(server.allocate("north"));
}
}