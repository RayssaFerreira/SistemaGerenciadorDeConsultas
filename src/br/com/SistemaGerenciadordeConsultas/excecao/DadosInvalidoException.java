/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.SistemaGerenciadordeConsultas.excecao;

/**
 *
 * @author André Fellype
 */
public class DadosInvalidoException extends Exception {

    /**
     * Creates a new instance of <code>DadosInvalidoException</code> without
     * detail message.
     */
    public DadosInvalidoException() {
    }

    /**
     * Constructs an instance of <code>DadosInvalidoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DadosInvalidoException(String msg) {
        super(msg);
    }
}
