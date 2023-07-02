package Model;

import Interface.*;
import javax.swing.JProgressBar;

public class Escalonador {
    
    // intervalo das mostragens de processos (seg)
    private int minProcessos;
    private int maxProcessos;
    // intervalo de tempo de execução dos processos (seg)
    private int minTempProcessos;
    private int maxTempProcessos;
    // temporizadores que cuidarão de todas as barras
    
    // getters
    public int getMinProcessos() {
        return minProcessos;
    }

    public int getMaxProcessos() {
        return maxProcessos;
    }

    public int getMinTempProcessos() {
        return minTempProcessos;
    }

    public int getMaxTempProcessos() {
        return maxTempProcessos;
    }
    
    public void fifo(){
        for(JProgressBar barra : JFramePrincipal.barrasProcessos)
            if(!barra.isVisible()) {
                barra.setVisible(true);
            }
    }
    
    public void tarMaisCurta() {
        
    }
    
    public void proxMenosTmpRest() {
        
    }
    
    public void chaveamentoCircular() {
        
    }
    
    public void prioridades() {
        
    }
    
    public void garantido() {
        
    }
    
    public void loteria() {
        
    }
    
    public void fracaoJusta() {
    
    }
}
