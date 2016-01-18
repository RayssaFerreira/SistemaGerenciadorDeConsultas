/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.SistemaGerenciadordeConsultas.negocio;

import br.com.SistemaGerenciadordeConsultas.entidade.Especialidade;
import br.com.SistemaGerenciadordeConsultas.excecao.CampoObrigatorioException;
import br.com.SistemaGerenciadordeConsultas.excecao.DadosInvalidoException;
import br.com.SistemaGerenciadordeConsultas.persistencia.EspecialidadeDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Rayssa
 */
public class EspecialidadeBO {

    public List<Especialidade> buscarTodos() throws SQLException {
        EspecialidadeDAO especialidadeDAO = new EspecialidadeDAO();
        return especialidadeDAO.buscarTodos();
    }

    public void salvar(Especialidade especialidade) throws SQLException, CampoObrigatorioException, DadosInvalidoException {
        EspecialidadeDAO especialidadeDAO = new EspecialidadeDAO();
        if (especialidade.getNome().isEmpty()) {
            throw new CampoObrigatorioException();
        }
        if (!especialidadeDAO.validar(especialidade)) {
            throw new DadosInvalidoException();
        }
        especialidadeDAO.criar(especialidade);
    }

    public void editar(Especialidade especialidade) throws SQLException, CampoObrigatorioException {
        EspecialidadeDAO especialidadeDAO = new EspecialidadeDAO();
        if (especialidade.getNome().isEmpty()) {
            throw new CampoObrigatorioException();
        }
        especialidadeDAO.alterar(especialidade);
    }

}
