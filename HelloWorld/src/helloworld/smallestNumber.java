import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
 
class Main
{
    
    public static int smallestMissing(int[] nums)
    {
        
        Set<Integer> number = Arrays.stream(nums).boxed().collect(Collectors.toSet());
 
    
        int index = 1;
        while (true)
        {
            if (!number.contains(index)) {
                return index;
            }
            index++;
        }
    }
 
    public static void main(String[] args)
    {
        int[] nums = { 1, 4, 2, 6, 5 };
 
        System.out.println("The smallest missing number from the array is "
                + smallestMissing(nums));
    }
}