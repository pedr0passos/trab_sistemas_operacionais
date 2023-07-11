package Model;

import javax.swing.JProgressBar;

public class Temporizador extends Thread {
    
    private final JProgressBar jBar;
    
    public Temporizador (JProgressBar pBar) {
        jBar = pBar;
    }
    
    @Override
    public void run () {
        while(jBar.getValue() > 0 ) {
            try {
                sleep(1000);
                jBar.setValue(jBar.getValue()-1);                   
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
