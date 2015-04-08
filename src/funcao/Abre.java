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
    public static JFrame logoffloguin;
    public static JFrame novoUsario;
    public static JInternalFrame novoPaciente;
    public static JInternalFrame adicionalPaciente;
    public static JInternalFrame novoMedico;
    public static JInternalFrame novaConsulta;
    public static JInternalFrame statusConsulta;
    public static JInternalFrame historicoConsultas;

    public static void logoffLoguin() {
        if (logoffloguin == null || logoffloguin.isVisible() == false) {
            logoffloguin = new visual.loguin();
            logoffloguin.setVisible(true);
        } else {
            logoffloguin.toFront();
        }
    }//telaPrincipal
    
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

    //Abre a janela para Cadastro de Consultas
    public static void cad_consulta() {
        if (novaConsulta == null || novaConsulta.isVisible() == false) {
            novaConsulta = new visual.cadConsulta();
            visual.SysPrincipal.centro.add(novaConsulta);
            novaConsulta.setVisible(true);
        }//cad_consulta
        else {
            novaConsulta.toFront();
        }
    }//janela Cadastro de Consultas

    //Abre a janela para Status de Consultas - Aguradando Consultas
    public static void statusConsulta() {
        if (statusConsulta == null || statusConsulta.isVisible() == false) {
            statusConsulta = new visual.statusConsulta();
            visual.SysPrincipal.centro.add(statusConsulta);
            statusConsulta.setVisible(true);
        }//statusConsulta
        else {
            statusConsulta.toFront();
        }
    }//janela Status de Consultas - Aguradando Consultas

    //Abre a janela para Historico de Consultas - ja Realizadas e com Alta Medica
    public static void historicoConsulta() {
        if (historicoConsultas == null || historicoConsultas.isVisible() == false) {
            historicoConsultas = new visual.historicoConsultas();
            visual.SysPrincipal.centro.add(historicoConsultas);
            historicoConsultas.setVisible(true);
        }//historicoCosulta
        else {
            historicoConsultas.toFront();
        }
    }//janela Historico de Consultas - ja Realizadas e com Alta Medica

}
