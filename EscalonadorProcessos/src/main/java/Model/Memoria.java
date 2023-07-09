package Model;

import java.util.ArrayList;
import java.util.Random;

public class Memoria {
    
    // tamanho da memoria e a quantidade de processos que existem nela
    private final int tamMemoria=10;
    private int quantProcessos;
    // intervalo das gerações dos processos
    private final int minProcessos=3000;
    private final int maxProcessos=7000;    
    
    // tamanho minimo e máximo dos processos
    private final int tamanhoMinimoProcesso=1;
    private final int tamanhoMaximoProcesso=10;
    
    // intervalo de prioridade dos processos
    private final int minPrioridade=1;
    private final int maxPrioridade=4;
    
    // lista de processos na memória prontos para irem para a CPU 
    public ArrayList<Processo> processos = new ArrayList(tamMemoria);
    
    
    public Memoria () {
        // thread feira para gerar processos 
        Thread thread = new Thread(this::geraProcessos);
    }
    
    public int getQuantProcessos() {
        return quantProcessos;
    }
    
    public void geraProcessos() {
        int idProcesso=0;
        while (quantProcessos <= tamMemoria) {
            try {
                Thread.sleep(geraAleatorio(minProcessos, maxProcessos));
            } catch (Exception e) {
                e.printStackTrace();
            }
            processos.add(new Processo(idProcesso++, geraAleatorio(tamanhoMinimoProcesso, tamanhoMaximoProcesso), geraAleatorio(minPrioridade, maxPrioridade)));
            quantProcessos++;
        }
    }
    
    public Processo getProcesso(int id) {
        for(Processo pr : processos )
            if (pr.getId()==id) return pr;
        return null;
    }
    
    public int geraAleatorio(int min, int max){
        Random numeroAleatorio = new Random();
        return numeroAleatorio.nextInt((max - min) + 1) + max;
    }
    
    public void removeProcesso(int id){
        processos.get(id);
        quantProcessos--;
    }
}
