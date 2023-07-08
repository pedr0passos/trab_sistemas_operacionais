package Model;

import java.util.ArrayList;
import java.util.Random;

public class Memoria {
    
    // lista de processos na memória prontos para irem para a CPU 
    public ArrayList<Processo> processos;
    
    // intervalo das gerações dos processos
    private final int minProcessos=3000;
    private final int maxProcessos=7000;    
    
    // tamanho minimo e máximo dos processos
    private final int tamanhoMinimoProcesso=1;
    private final int tamanhoMaximoProcesso=10;
    
    // intervalo de prioridade dos processos
    private final int minPrioridade=1;
    private final int maxPrioridade=4;
    
    public void geraProcessos() {
        byte idProcesso=0;
        while (true) {
            try {
                Thread.sleep(geraAleatorio(minProcessos, maxProcessos));
            } catch (Exception e) {
                e.printStackTrace();
            }
            processos.add(new Processo(idProcesso++, geraAleatorio(tamanhoMinimoProcesso, tamanhoMaximoProcesso), geraAleatorio(minPrioridade, maxPrioridade)));
        }
    }
    
    public Processo getProcesso(byte id) {
        for(Processo pr : processos )
            if (pr.getId()==id) return pr;
        return null;
    }
    
    public int geraAleatorio(int min, int max){
        Random numeroAleatorio = new Random();
        return numeroAleatorio.nextInt((max - min) + 1) + max;
    }
}
