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
     
    public void executa (Processo processo, int tempoExecucao, boolean prioridade) {
        processoExecucao = processo;
        int i=0;
        while ( tempoExecucao > 0 ) {
            if (JFramePrincipal.threadFlag) break;
            try {
                Thread.sleep(velocidade);
            } catch (InterruptedException e) {}
            JFramePrincipal.atualizaBarras();
            JFramePrincipal.atualizaTamProcessos();
            if ( prioridade ) JFramePrincipal.atualizaPrioridades();            
            processoExecucao.setTempoExecucao(processoExecucao.getTempoExecucao()-1);
            tempoExecucao--;
            processo = processoExecucao;            
        }
        Main.memoria.removeProcesso(processo);
    }    
    
    public void aumentaVelocidade () {       
        if (velocidade != 50 && velocidade > 50) 
            velocidade -= 50;
        else if (velocidade <= 50 && velocidade != 20)
            velocidade -= 10;
        System.out.print(velocidade + "\n");
    }
    
    public void diminuiVelocidade () {      
        velocidade += 50;
    }
   
}
