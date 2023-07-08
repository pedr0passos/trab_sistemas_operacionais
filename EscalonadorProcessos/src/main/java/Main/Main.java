package Main;

import Interface.*;
import Model.*;

public class Main {
    

    public static Escalonador esc;
    
    public static void main(String[] args) {
        esc = new Escalonador();
        JFramePrincipal jFramePrincipal = new JFramePrincipal();
        jFramePrincipal.setLocationRelativeTo(null);
        jFramePrincipal.setVisible(true);
    }
}
