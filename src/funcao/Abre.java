/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author TADS
 */
public class Abre {
    public static JFrame sysPrincipal;
    public static JFrame novoUsario;
    public static JInternalFrame novoPaciente;
    public static JInternalFrame adicionalPaciente;
    public static JInternalFrame novoMedico;

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

    //Abre tela para registrar paciente
    public static void cad_paciente() {
        if (novoPaciente == null || novoPaciente.isVisible() == false) {
            novoPaciente = new visual.cadPaciente();
            visual.SysPrincipal.centro.add(novoPaciente);
            novoPaciente.setVisible(true);
        }//cad_paciente
        else {
            novoPaciente.toFront();
        }
    }//cad_paciente
    
    //Abre tela para dados adicionais do pacientes
    public static void adicional_paciente() {
        if (adicionalPaciente == null || adicionalPaciente.isVisible() == false) {
            adicionalPaciente = new visual.dadosPacientes();
            visual.SysPrincipal.centro.add(adicionalPaciente);
            adicionalPaciente.setVisible(true);
        }//cad_paciente
        else {
            adicionalPaciente.toFront();
        }
    }//cad_paciente
    
    //Abre a janela para Cadastro de Medicos
        public static void cad_medico() {
        if (novoMedico == null || novoMedico.isVisible() == false) {
            novoMedico = new visual.cadMedico();
            visual.SysPrincipal.centro.add(novoMedico);
            novoMedico.setVisible(true);
        }//cad_medico
        else {
            novoMedico.toFront();
        }
    }//janela cad_medicos
    
    
}
