package Model;

import Main.*;
import Interface.*;

public class Escalonador {
    
    private int ticketSorteado;
    
    public void addProcessoCPU (Processo processo, int tempoExecucao, boolean prioridade, boolean ticket) {
        Main.cpu.executa(processo, tempoExecucao, prioridade, ticket);
    }

    /* GETTERS */
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
    
    public Processo getMaiorPrioridadeGarantido(Processo anterior) {        
        int idAnterior;
        if (anterior==null) {
            idAnterior = -1;        
        } else {
            idAnterior = anterior.getId();
        }
        
        Processo maiorPrioridade;
                
        if(anterior != null)
            maiorPrioridade = anterior;
        else
            maiorPrioridade = Main.memoria.processos.get(0);
        
        for (Processo p : Main.memoria.processos) {
            if(p.getId() != idAnterior 
                    && p.getPrioridade() <= maiorPrioridade.getPrioridade() 
                    && (int) (maiorPrioridade.getPrioridade()) == (int)(p.getPrioridade()) )
                maiorPrioridade = p;
        }
        
        
        return maiorPrioridade;
    }
    
    public int sorteiaTicket() {
        return Memoria.geraAleatorio(Memoria.MIN_TICKET, Memoria.MAX_TICKET);
    }
    
    public int getTicketSorteado() {
        return ticketSorteado;
    }
    
    /* ALGORITMOS */
    public void fifo(){       
        while ( Main.memoria.getQuantProcessos() > 0) {
            Processo processo = getPrimeiroProcesso();
            addProcessoCPU(processo, processo.getTempoExecucao(), false, false);
            if ( JFramePrincipal.threadFlag ) break;                
        }
    }
    
    public void tarMaisCurta() {
        while (Main.memoria.processos.size() >= 1) {
            Processo maisCurto = getMaisCurto();
            addProcessoCPU(maisCurto, maisCurto.getTempoExecucao(), false, false);
            if ( JFramePrincipal.threadFlag ) break;               
        }
    }
    
    public void proxMenosTmpRest() {
        while(Main.memoria.processos.size() >= 1 ){
            Processo maisCurto = getMaisCurto();
            Main.cpu.executa(maisCurto, 1, false, false);
        }
        
    }
    
    public void chaveamentoCircular() {
        for(int i = 0; Main.memoria.processos.size() >= 1; i = (i + 1) % Main.memoria.processos.size())
        {
            Main.cpu.executa(Main.memoria.processos.get(i), Main.cpu.getQuantum(), false, false);
            if (JFramePrincipal.threadFlag) break;
        }
    }
    
    public void prioridades() {
        while(Main.memoria.processos.size() >= 1){
            Processo maiorPrioridade = getMaiorPrioridade();
            addProcessoCPU(maiorPrioridade, maiorPrioridade.getTempoExecucao(), true, false);
            if (JFramePrincipal.threadFlag) break;
        }
    }

    public void garantido() {
        Processo processoAnterior = null;        
        while (Main.memoria.processos.size() >= 1) {  
            Processo maiorPrioridade = getMaiorPrioridadeGarantido(processoAnterior);         
            Main.cpu.executa(maiorPrioridade, Main.cpu.getQuantum(), false, false);           
            processoAnterior = maiorPrioridade;
            if (JFramePrincipal.threadFlag) break;         
        }
    }

    public void loteria() {
        while(Main.memoria.processos.size() >= 1){
            Processo sorteado = new Processo();
            int tSort = sorteiaTicket();
            this.ticketSorteado = tSort;
            boolean achou=false;
            for (Processo p : Main.memoria.processos )
                if (p.getTicket() == tSort) {
                    sorteado = p;
                    achou = true;
                    break;
                }
            if (achou)
                addProcessoCPU(sorteado, sorteado.getTempoExecucao(), true, true);
            if (JFramePrincipal.threadFlag) break;
        }        
    }

    public void fracaoJusta() {
        for(int i = 0; Main.memoria.processos.size() >= 1; i = (i + 1) % Main.memoria.processos.size()) {
            double fracaoPorUsuario = 1.0 / (double)JFramePrincipal.maximoUsuarios;
            int quantumPorFracaoDeUsuario = (int)Math.ceil(fracaoPorUsuario * Main.cpu.getQuantum());
            Main.cpu.executa(Main.memoria.processos.get(i), quantumPorFracaoDeUsuario, false, false);
            if (JFramePrincipal.threadFlag) break;
        }
    }
}
