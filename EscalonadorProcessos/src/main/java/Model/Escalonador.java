package Model;

import Main.*;

public class Escalonador {

    public void addProcessoCPU (Processo processo) {
        Main.cpu.executa(processo);
    }

    public Processo getMaisCurto () {
        Processo menor = Main.memoria.processos.get(0);
        for ( Processo pr : Main.memoria.processos ) 
            if (pr.getTempoExecucao() < menor.getTempoExecucao()) 
                menor = pr;
        return menor;

    }
    
    public Processo getPrimeiroProcesso () {
        return Main.memoria.processos.get(0);
    }    
    
    public Processo getMaiorPrioridade () {
        Processo maiorPrioridade = Main.memoria.processos.get(0);
        for ( Processo pr : Main.memoria.processos ) 
            if ( pr.getPrioridade() > maiorPrioridade.getPrioridade() ) 
                maiorPrioridade = pr;
        return maiorPrioridade;
    }
    
    public void fifo(){       
        while ( Main.memoria.getQuantProcessos() > 0) {
            Processo processo = getPrimeiroProcesso();
            addProcessoCPU(processo);
        }
    }
    
    public void tarMaisCurta() {
        while (Main.memoria.processos.size() >= 1) {
            Processo maisCurto = getMaisCurto();
            addProcessoCPU(maisCurto);
        }
    }
    
    public void proxMenosTmpRest() {
        
    }
    
    public void chaveamentoCircular() {
        
    }
    
    public void prioridades() {
        while(Main.memoria.processos.size() >= 1){
            Processo maior_prioridade = getMaiorPrioridade();
            addProcessoCPU(maior_prioridade);
        }
    }

    public void garantido() {

    }

    public void loteria() {

    }

    public void fracaoJusta() {
    
    }
}
