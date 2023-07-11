package Model;

import Main.*;
import Enum.*;
import static Interface.JFramePrincipal.atualizaBarras;

public class CPU {
    
    private int tempoSimulacao;
    private EstadoProcesso estado;
    private Processo processoExecucao;
    private int velocidade;
    
    public CPU () {
        velocidade=1000;
        tempoSimulacao=0;
    }
    
    public void executa (Processo processo) {        
        processoExecucao = processo;
        int i=0;
        while ( processoExecucao.getTempoExecucao() > 0 ) {
            try {
                Thread.sleep(velocidade);
            } catch (InterruptedException e) {}
            processoExecucao.setTempoExecucao(processoExecucao.getTempoExecucao()-1);
            processo = processoExecucao;            
            for( Processo pr : Main.memoria.processos )                {
                System.out.print(Integer.toString(pr.getTempoExecucao()) + "\t");
            }
            System.out.print("("+Main.memoria.getQuantProcessos()+")" + "\n");
        }
        Main.memoria.removeProcesso(processo);
    }    
    
    public void setExecutando() {
        estado = EstadoProcesso.EXECUTANDO;
    }
    
    public void setEspera() {
        estado = EstadoProcesso.ESPERA;                
    }
    
    
    
}
