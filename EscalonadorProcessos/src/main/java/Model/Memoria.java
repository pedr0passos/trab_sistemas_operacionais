package Model;

import java.util.ArrayList;
import java.util.Random;
import Interface.*;

public class Memoria {
    
    private final int tamMemoria;
    private int quantProcessosProcessados;
    
    private final int tamanhoMinimoProcesso=1;
    private final int tamanhoMaximoProcesso=10;
    
    private final int minPrioridade=1;
    private final int maxPrioridade=9;

    public ArrayList<Processo> processos;
    
    public Memoria () {
        this.tamMemoria = 15;
        this.processos = new ArrayList(tamMemoria);
        new Thread() {
            @Override        
            public void run () {
                geraProcessos();
            }
        }.start();
    }
    
    public void geraProcessos() {
        int idProcesso=0;
        while (true) {
            try {
                Thread.sleep(10);
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
        quantProcessosProcessados++;
        JFramePrincipal.atualizaProcessosProcessados(Integer.toString(getProcessados()));
        processos.remove(processo);
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
}
