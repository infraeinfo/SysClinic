/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao;

import javax.swing.JFrame;

/**
 *
 * @author TADS
 */
public class Abre {
    public static JFrame sysPrincipal;
    public static JFrame novoUsario;

    public static void sysPrincipal() {
        if (sysPrincipal == null || sysPrincipal.isVisible() == false) {
            sysPrincipal = new visual.SysPrincipal();
            sysPrincipal.setVisible(true);
        } else {
            sysPrincipal.toFront();
        }
    }//telaPrincipal

    public static void cad_usuario() {
        if (novoUsario == null || novoUsario.isVisible() == false) {
            novoUsario = new visual.cadUsuario();
            novoUsario.setVisible(true);
        }//reg_usuario
        else {
            novoUsario.toFront();
        }
    }//reg_usuario

}
