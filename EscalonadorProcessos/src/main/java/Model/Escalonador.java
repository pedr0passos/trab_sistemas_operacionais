package Model;

import Main.*;
import Interface.*;

public class Escalonador {
    
    public void addProcessoCPU (Processo processo, int tempoExecucao, boolean prioridade) {
        Main.cpu.executa(processo, tempoExecucao, prioridade);
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
            addProcessoCPU(processo, processo.getTempoExecucao(), false);
            if ( JFramePrincipal.threadFlag ) break;                
        }
    }
    
    public void tarMaisCurta() {
        while (Main.memoria.processos.size() >= 1) {
            Processo maisCurto = getMaisCurto();
            addProcessoCPU(maisCurto, maisCurto.getTempoExecucao(), false);
            if ( JFramePrincipal.threadFlag ) break;               
        }
    }
    
    public void proxMenosTmpRest() {
        
    }
    
    public void chaveamentoCircular() {
        
    }
    
    public void prioridades() {
        while(Main.memoria.processos.size() >= 1){
            Processo maiorPrioridade = getMaiorPrioridade();
            addProcessoCPU(maiorPrioridade, maiorPrioridade.getTempoExecucao(), true);
            if (JFramePrincipal.threadFlag) break;

        }
    }

    public void garantido() {

    }

    public void loteria() {

    }

    public void fracaoJusta() {
    
    }
}
