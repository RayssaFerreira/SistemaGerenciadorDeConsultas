/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.SistemaGerenciadordeConsultas.negocio;

import br.com.SistemaGerenciadordeConsultas.entidade.Paciente;
import br.com.SistemaGerenciadordeConsultas.excecao.CampoObrigatorioException;
import br.com.SistemaGerenciadordeConsultas.persistencia.PacienteDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Rayssa
 */
public class PacienteBO {

    public List<Paciente> buscarTodos() throws SQLException {
        PacienteDAO pacienteDAO = new PacienteDAO();
        return pacienteDAO.buscarTodos();
    }

    public List<Paciente> buscarTodosCpf(Paciente filtro) throws SQLException {
        PacienteDAO pacienteDAO = new PacienteDAO();
        return pacienteDAO.buscarTodosCpf(filtro);
    }

    public void salvar(Paciente paciente) throws SQLException, CampoObrigatorioException {
        PacienteDAO pacinteDAO = new PacienteDAO();
        if (paciente.getNome().isEmpty() || paciente.getCpf().length() == 9 || paciente.getTelefone().length() == 9 || paciente.getEndereco().isEmpty() || paciente.getSexo().isEmpty()) {
            throw new CampoObrigatorioException();
        }
        pacinteDAO.criar(paciente);
    }

    public void editar(Paciente paciente) throws SQLException, CampoObrigatorioException {
        PacienteDAO pacienteDAO = new PacienteDAO();
        if (paciente.getNome().isEmpty()) {
            throw new CampoObrigatorioException();
        }
        pacienteDAO.alterar(paciente);
    }
}
