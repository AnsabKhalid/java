
package digitalclock;

import java.util.*;

public class clockThread extends Thread {
    
    DigitalClock dc;
    String time;
    
    public clockThread(DigitalClock dc) {
    
        this.dc = dc;
        start();
        
    }
    
    public void run () {
    
        while(true) {
            time = ""+ new Date();
            dc.jLabClock.setText(time);
        }
        
    }
            
}
