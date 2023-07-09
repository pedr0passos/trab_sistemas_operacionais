package Model;

import Main.*;

public class Escalonador {
   
    public void mandaPraCPU (ArrayList<Processo> processo) {
        Main.cpu.executa(processo);

    }
    
    public void fifo(ArrayList<Processo> processos){
        while(processos.size() >= 1){
            Processo menorId = processos.getProcesso(0);

            for (Processo proximo : processos){
                if (proximo.getId() < menorId.getId()){
                    menorId = proximo;
                }
            }
            Escalonador.mandaPraCPU(menorId);
            processos.remove(menorId);
        }
    }
    
    public void tarMaisCurta() {
        
    }
    
    public void proxMenosTmpRest() {
        
    }
    
    public void chaveamentoCircular() {
        
    }
    
    public void prioridades(ArrayList<Processo> processos) {

       while(processos.size() >= 1){
           Processo maior_prioridade = processos.getProcesso(0);

           for (Processo proximo : processos){
               if (proximo.getPrioridade() > maior_prioridade.getPrioridade()){
                   maior_prioridade = proximo;
               }
           }
           Escalonador.mandaPraCPU(maior_prioridade);
           processos.remove(maior_prioridade);
       }

    }

    public void garantido() {

    }

    public void loteria() {

    }

    public void fracaoJusta() {
    
    }
}
