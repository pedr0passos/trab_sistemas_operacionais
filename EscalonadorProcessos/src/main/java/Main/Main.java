package Main;

import Interface.*;
import Model.*;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Processo> processos;
    public static Escalonador esc;
    public static void main(String[] args) {
        processos = new ArrayList();
        esc = new Escalonador();
        JFramePrincipal jFramePrincipal = new JFramePrincipal();
        jFramePrincipal.setLocationRelativeTo(null);
        jFramePrincipal.setVisible(true);
    }
}
