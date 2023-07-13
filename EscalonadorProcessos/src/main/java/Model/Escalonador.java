package Model;

import Main.*;
import Interface.*;
import java.util.LinkedList;

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
        for(int i = 0; Main.memoria.processos.size() >= 1; i = (i + 1) % Main.memoria.processos.size())
        {
            Main.cpu.executa(Main.memoria.processos.get(i), Main.cpu.getQuantum(), false);
            if (JFramePrincipal.threadFlag) break;
        }
    }
    
    public void prioridades() {
        while(Main.memoria.processos.size() >= 1){
            Processo maiorPrioridade = getMaiorPrioridade();
            addProcessoCPU(maiorPrioridade, maiorPrioridade.getTempoExecucao(), true);
            if (JFramePrincipal.threadFlag) break;

        }
    }

    public void garantido() {
        while (Main.memoria.processos.size() >= 1) {
            Processo maiorPrioridade = getMaiorPrioridade();
            
        }
    }

    public void loteria() {

    }

    public void fracaoJusta() {
        for(int i = 0; Main.memoria.processos.size() >= 1; i = (i + 1) % Main.memoria.processos.size())
        {
            double fracaoPorUsuario = 1.0 / (double)JFramePrincipal.maximoUsuarios;
            
            int quantumPorFracaoDeUsuario = (int)Math.ceil(fracaoPorUsuario * Main.cpu.getQuantum());
            
            System.out.println("Quantum por usuario: " + quantumPorFracaoDeUsuario + "\n");
            
            Main.cpu.executa(Main.memoria.processos.get(i), quantumPorFracaoDeUsuario, false);
            if (JFramePrincipal.threadFlag) break;
        }
    }
}
