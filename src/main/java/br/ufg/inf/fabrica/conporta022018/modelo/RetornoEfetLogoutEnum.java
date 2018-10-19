/*
 * Copyright (c) 2018.
 * Fabrica de Software INF
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.fabrica.conporta022018.modelo;

public enum RetornoEfetLogoutEnum {

    OK("Sessão encerrada com sucesso!"),
    ERRO_EXECUCAO("Houve um erro de execução e a sessão não pode ser terminada."),
    ERRO_JA_ENCERRADA("Não há uma sessão ativa para o usuário solicitado."),
    ERRO_CONEXAO_BD("Não foi possível terminar a sessão devido a um erro de conexão com a base de dados."),
    ERRO_INESPERADO("Houve um erro inesperado e não foi possível encerrar a sessão.");

    private final String retorno;

    RetornoEfetLogoutEnum(final String retorno) {
        this.retorno = retorno;
    }

    /**
     * @return a mensagem de erro a ser usada pelo sistema.
     */
    public String getRetorno() {
        return retorno;
    }

}