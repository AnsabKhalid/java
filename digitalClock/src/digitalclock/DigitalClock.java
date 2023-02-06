
package digitalclock;

import java.awt.*;
import javax.swing.*;

public class DigitalClock extends JFrame {
    
    JLabel jLabClock;
    
    
    public DigitalClock() {
    
        jLabClock = new JLabel("");
        clockThread ct;
        
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jLabClock.setFont(new Font("Arial",Font.CENTER_BASELINE,80));
        jLabClock.setOpaque(true);
        jLabClock.setBackground(Color.BLACK);
        jLabClock.setForeground(Color.WHITE);
        add(jLabClock);
        setSize(1175, 130);
        setLocationRelativeTo(null);
        ct = new clockThread(this);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
    
        new DigitalClock();
        
    }
    
}
