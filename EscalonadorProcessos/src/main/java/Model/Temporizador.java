package Model;
import javax.swing.JProgressBar;

public class Temporizador extends Thread {
    JProgressBar jBar;
    public Temporizador (JProgressBar pBar) {
        jBar = pBar;
        jBar.setValue(100);
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
