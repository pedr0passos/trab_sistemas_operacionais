package Model;

import Main.*;

public class Escalonador {
   
    public Processo getMaisCurto () {
        Processo menor = Main.memoria.getProcesso(0);
        for ( Processo pr : Main.memoria.processos ) {
            if ( pr.getTempoExecucao() < menor.getTempoExecucao() ) 
                menor = pr;
        }
        return menor;
    }
    
    public void fifo(){

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
