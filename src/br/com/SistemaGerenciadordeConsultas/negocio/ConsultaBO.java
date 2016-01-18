/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.SistemaGerenciadordeConsultas.negocio;

import br.com.SistemaGerenciadordeConsultas.entidade.Consulta;
import br.com.SistemaGerenciadordeConsultas.entidade.Medico;
import br.com.SistemaGerenciadordeConsultas.entidade.Paciente;
import br.com.SistemaGerenciadordeConsultas.entidade.QuantidadeConsultaPorDia;
import br.com.SistemaGerenciadordeConsultas.persistencia.ConsultaDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Rayssa
 */
public class ConsultaBO {

    public List<Consulta> buscarTodosPorPaciente(Paciente paciente) throws SQLException {
        ConsultaDAO consultaDAO = new ConsultaDAO();
        return consultaDAO.buscarPorPaciente(paciente);
    }
    public List<Consulta> buscarTodosPorMedico(Medico medico) throws SQLException {
        ConsultaDAO consultaDAO = new ConsultaDAO();
        return consultaDAO.buscarPorMedico(medico);
    }
    public List<Consulta> buscarTodos() throws SQLException {
        ConsultaDAO consultaDAO = new ConsultaDAO();
        return consultaDAO.buscarTodos();
    }

    public void salvar(Consulta consulta) throws SQLException {
        ConsultaDAO consultaDAO = new ConsultaDAO();
        consultaDAO.criar(consulta);
    }

    public void editar(Consulta consulta) throws SQLException {
        ConsultaDAO consultaDAO = new ConsultaDAO();
        consultaDAO.alterar(consulta);
    }
    
    public List<QuantidadeConsultaPorDia> buscarConsultasPorDia() throws SQLException {
        ConsultaDAO consultaDAO = new ConsultaDAO();
        return consultaDAO.buscarConsultasPorDia();
    }
}
