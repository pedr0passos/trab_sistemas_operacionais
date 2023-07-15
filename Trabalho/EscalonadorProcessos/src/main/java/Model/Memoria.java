package Model;

import java.util.ArrayList;
import java.util.Random;
import Interface.JFramePrincipal;
import Main.Main;

public class Memoria {
    
    private final int tamMemoria;
    private int quantProcessosProcessados;
    
    private int tamanhoMinimoProcesso;
    private int tamanhoMaximoProcesso;
    
    private int minPrioridade;
    private int maxPrioridade;

    public static final int MIN_TICKET=1;
    public static final int MAX_TICKET=30;
    
    public static int intervaloGeracaoProcessos=10;
    
    public ArrayList<Processo> processos;
    
    public Memoria () {
        
        this.tamanhoMaximoProcesso=10;
        this.tamanhoMinimoProcesso=1;
        this.minPrioridade=1;
        this.maxPrioridade=9;
        this.tamMemoria=15;
        this.processos = new ArrayList(tamMemoria);
        
        new Thread() {
            @Override        
            public void run () {
                geraProcessos();
            }
        }.start();
        
    }
    
    public void setTamanhoMinProcesso (int tam) {
        tamanhoMinimoProcesso = tam;
    }
    
    public void setTamanhoMaxProcesso (int tam) {
        tamanhoMaximoProcesso = tam;
    }
    
    public void setPrioridadeMin (int prioridadeMinima ) {
        minPrioridade = prioridadeMinima;
    }
    
    public void setPrioridadeMax (int prioridadeMaxima ) {
        maxPrioridade = prioridadeMaxima;
    }
    
    public void geraProcessos() {
        int idProcesso=0;
        while (true) {
            try {
                Thread.sleep(intervaloGeracaoProcessos);
            } catch (InterruptedException e) {}
            if (!isFull()) {
                processos.add(new Processo( idProcesso++, 
                                geraAleatorio(tamanhoMinimoProcesso, tamanhoMaximoProcesso), 
                                  geraAleatorio(minPrioridade, maxPrioridade),
                                geraAleatorio(1, JFramePrincipal.maximoUsuarios),
                                            geraAleatorio(MIN_TICKET, MAX_TICKET)));
            }
                            
        }
    }
    
    public Processo getProcesso(int id) {
        for(Processo pr : processos )
            if (pr.getId()==id) return pr;
        return null;
    }
    
    public static int geraAleatorio(int min, int max){
        Random numeroAleatorio = new Random();
        return numeroAleatorio.nextInt((max - min) + 1) + min;
    }
    
    public void removeProcesso(Processo processo){
        quantProcessosProcessados++;
        JFramePrincipal.atualizaProcessosProcessados(Integer.toString(getProcessados()));
        processos.remove(processo);
        
        JFramePrincipal.mutex.lock();
        try {
            Main.calculadorTempo.adicionarProcessoFinalizado();
            Main.calculadorTempo.adicionarTempoDeFilaDeProcessoSegundos(processo);
        } finally {
            JFramePrincipal.mutex.unlock();
        }
    }
    
    public boolean isFull () {
        return processos.size() == tamMemoria;
    }
    
    public int getTamMaxProc() {
        return tamanhoMaximoProcesso;
    }
    
    public int getQuantProcessos() {
        return processos.size();
    }
    
    public int getTamMemoria() {
        return tamMemoria;
    }
    
    public int getProcessados() {
        return quantProcessosProcessados;
    }
    
    public int getMaxPrioridade() {
        return maxPrioridade;
    }

    public void clearMemoria() {
        processos.clear();
    }
}
