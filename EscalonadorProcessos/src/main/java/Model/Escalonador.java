package Model;

import Main.*;

public class Escalonador {
   
    public void mandaPraCPU () {
        Main.cpu.executa(Main.memoria.getProcesso(0));
        Main.memoria.removeProcesso(0);
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
