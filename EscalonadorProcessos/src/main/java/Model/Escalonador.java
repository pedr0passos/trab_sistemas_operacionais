package Model;

import Main.*;

public class Escalonador {
   
    public void mandaPraCPU (Processo processo) {
        Main.cpu.executa(proceso);

    }
    
    public void fifo(ArrayList<Processo> processos){
        while(processos.size() >= 1){
            Processo menorId = processos.getProcesso(0);

            for (Processo proximo : processos){
                if (proximo.getId() < menorId.getId()){
                    menorId = proximo;
                }
            }
            Escalonador.mandaPraCPU(menorId)
            processos.remove(menorId);
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
