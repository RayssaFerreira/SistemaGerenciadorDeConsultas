/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.SistemaGerenciadordeConsultas.negocio;

import br.com.SistemaGerenciadordeConsultas.entidade.Usuario;
import br.com.SistemaGerenciadordeConsultas.excecao.CampoObrigatorioException;
import br.com.SistemaGerenciadordeConsultas.excecao.LoginInvalidoException;
import br.com.SistemaGerenciadordeConsultas.persistencia.UsuarioDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Rayssa
 */
public class UsuarioBO {
   
    public List<Usuario> buscarTodos() throws SQLException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        return usuarioDAO.buscarTodos();
    }

    public void salvar(Usuario usuario) throws SQLException, CampoObrigatorioException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        if (usuario.getLogin().isEmpty() || usuario.getSenha().isEmpty()) {
            throw new CampoObrigatorioException();
        }
        usuarioDAO.criar(usuario);
    }

    public void editar(Usuario usuario) throws SQLException, CampoObrigatorioException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        if (usuario.getLogin().isEmpty() || usuario.getSenha().isEmpty()) {
            throw new CampoObrigatorioException();
        }
        usuarioDAO.alterar(usuario);
    }

    public void login(Usuario usuario) throws CampoObrigatorioException, LoginInvalidoException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        if (usuario.getLogin().isEmpty() || usuario.getSenha().isEmpty()) {
            throw new CampoObrigatorioException();
        }
        if (!usuarioDAO.login(usuario)) {
            throw new LoginInvalidoException();
        }
    }

    public void removerUsuario(int id) throws SQLException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.removerUsuario(id);
    }

}
