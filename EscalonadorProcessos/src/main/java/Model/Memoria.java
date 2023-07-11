package Model;

import java.util.ArrayList;
import java.util.Random;

public class Memoria {
    private final int tamMemoria;
// tamanho da memoria e a quantidade de processos que existem nela
        private int quantProcessosProcessados;
    
    // tamanho minimo e máximo dos processos
    private final int tamanhoMinimoProcesso=1;
    private final int tamanhoMaximoProcesso=10;
    
    // intervalo de prioridade dos processos
    private final int minPrioridade=1;
    private final int maxPrioridade=4;
    // lista de processos na memória prontos para irem para a CPU
    public ArrayList<Processo> processos;
    
    public Memoria () {
        this.tamMemoria = 10;
        this.processos = new ArrayList(tamMemoria);
        new Thread() {
            @Override        
            public void run () {
                geraProcessos();
            }
        }.start();
    }
    
    public int getQuantProcessos() {
        return processos.size();
    }
    
    public void geraProcessos() {
        int idProcesso=0;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            if (!isFull())
                processos.add(new Processo(idProcesso++, geraAleatorio(tamanhoMinimoProcesso, tamanhoMaximoProcesso), geraAleatorio(minPrioridade, maxPrioridade)));            
        }
    }
    
    public Processo getProcesso(int id) {
        for(Processo pr : processos )
            if (pr.getId()==id) return pr;
        return null;
    }
    
    public int geraAleatorio(int min, int max){
        Random numeroAleatorio = new Random();
        return numeroAleatorio.nextInt((max - min) + 1) + min;
    }
    
    public void removeProcesso(Processo processo){
        processos.remove(processo);
        quantProcessosProcessados++;
    }
    
    public boolean isFull () {
        return processos.size() == 10;
    }
    
    public int getTamMaxProc() {
        return tamanhoMaximoProcesso;
    }
}
