package Model;

import Main.*;

public class Escalonador {

    public void mandaPraCPU (Processo processo) {
        Main.cpu.executa(processo);
    }

    public Processo getMaisCurto () {
        Processo menor = Main.memoria.getProcesso(0);
        for ( Processo pr : Main.memoria.processos ) {
            if (pr.getTempoExecucao() < menor.getTempoExecucao()) 
                menor = pr;
        }
        return menor;
    }
    
    public void fifo(){
        while(Main.memoria.processos.size() >= 1){
            Processo menorId = Main.memoria.getProcesso(0);
            for ( Processo pr : Main.memoria.processos )
                if (pr.getId() < menorId.getId() )
                    menorId = pr;
            mandaPraCPU(menorId);
            Main.memoria.removeProcesso(menorId.getId());
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
