/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.SistemaGerenciadordeConsultas.excecao;

/**
 *
 * @author Rayssa
 */
public class CampoObrigatorioException extends Exception {

    /**
     * Creates a new instance of <code>CampoObrigatorioException</code> without
     * detail message.
     */
    public CampoObrigatorioException() {
        super("Favor informar o(s) campo(s) obrigatório(s).");
    }

    /**
     * Constructs an instance of <code>CampoObrigatorioException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CampoObrigatorioException(String msg) {
        super(msg);
    }
}
