/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.SistemaGerenciadordeConsultas.negocio;

import br.com.SistemaGerenciadordeConsultas.entidade.Medico;
import br.com.SistemaGerenciadordeConsultas.excecao.CampoObrigatorioException;
import br.com.SistemaGerenciadordeConsultas.persistencia.MedicoDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Rayssa
 */
public class MedicoBO {

    public List<Medico> buscarTodosFiltro(Medico medico) throws SQLException {
        MedicoDAO medicoDAO = new MedicoDAO();
        if (medico.getCpf().length() == 9) {
            medico.setCpf("");
        }
        return medicoDAO.buscarTodosFiltro(medico);
    }

    public List<Medico> buscarTodos() throws SQLException {
        MedicoDAO medicoDAO = new MedicoDAO();
        return medicoDAO.buscarTodos();
    }

    public void salvar(Medico medico) throws SQLException, CampoObrigatorioException {
        MedicoDAO medicoDAO = new MedicoDAO();
        if (medico.getNome().isEmpty() || medico.getCpf().length() == 9 || medico.getCrm().length() == 1 || medico.getTelefone().length() == 9
                || medico.getEndereco().isEmpty() || medico.getSexo().isEmpty()) {
            throw new CampoObrigatorioException();
        }
        medicoDAO.criar(medico);
    }

    public void editar(Medico medico) throws SQLException, CampoObrigatorioException {
        MedicoDAO medicoDAO = new MedicoDAO();
        if (medico.getNome().isEmpty()) {
            throw new CampoObrigatorioException();
        }
        medicoDAO.alterar(medico);
    }

}
