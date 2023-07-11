package Model;

import Main.*;
import Enum.*;
import Interface.*;

public class CPU extends Thread{
    
    private int tempoSimulacao;
    private EstadoProcesso estado;
    private Processo processoExecucao;
    private int velocidade;
    
    public CPU () {
        velocidade=500;
        tempoSimulacao=0;
    }
    
    
    // thread responsavel por executar o processo em si 
    public void executa (Processo processo, int tempoExecucao) {
        processoExecucao = processo;
        int i=0;
        while ( tempoExecucao > 0 ) {
            try {
                Thread.sleep(velocidade);
            } catch (InterruptedException e) {}
            processoExecucao.setTempoExecucao(processoExecucao.getTempoExecucao()-1);
            JFramePrincipal.atualizaBarras();
            tempoExecucao--;
            processo = processoExecucao;            
            for( Processo pr : Main.memoria.processos )                {
                System.out.print(Integer.toString(pr.getTempoExecucao()) + "\t");
            }
            System.out.print("("+Main.memoria.getQuantProcessos()+")" + "\n");
        }
        Main.memoria.removeProcesso(processo);
    }    
    
    public void aumentaVelocidade () {       
        if (velocidade != 20)          
            velocidade -= 20;
    }
    public void diminuiVelocidade () {      
        velocidade += 20;
    }
}
