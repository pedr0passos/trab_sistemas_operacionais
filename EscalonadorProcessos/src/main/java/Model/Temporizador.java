package Model;

import javax.swing.JProgressBar;

public class Temporizador extends Thread {
    
    private JProgressBar jBar;
    private byte id;

    
    public Temporizador (JProgressBar pBar, byte id) {
        jBar = pBar;
        jBar.setValue(100);
        jBar.setOrientation(JProgressBar.VERTICAL);
        this.id=id;
    }
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
