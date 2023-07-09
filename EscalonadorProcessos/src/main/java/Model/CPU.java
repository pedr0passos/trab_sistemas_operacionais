package Model;

import java.util.ArrayList;

public class CPU {
    
    private int tempoSimulacao;
    private Escalonador escalonador;
    
    private ArrayList<Processo> processosExecucao = new ArrayList();
    
    public void executa (Processo processo) {
        processosExecucao.add(processo);
    }
    
}
