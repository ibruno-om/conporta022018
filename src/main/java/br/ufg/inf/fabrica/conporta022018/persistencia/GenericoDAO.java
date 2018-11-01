package br.ufg.inf.fabrica.conporta022018.persistencia;

import java.util.List;
import java.util.Map;

public abstract class GenericoDAO<T> {

    private ConexaoSGBD[] conexaoSGBD;

    private ConnectionFactory connectionFactory;

    public T salvar(T entidade) {
        return null;
    }

    public void remover(T entidade) {

    }

    public T buscar(Long id) {
        return null;
    }

    public List buscarTodos() {
        return null;
    }

    public T pesquisarUmJPQLCustomizada(String jpql, Map<String,Object> parametros) {
        return null;
    }

    public List pesquisarJPQLCustomizada(String jpql, Map<String,Object> parametros) {
        return null;
    }

    public void abrirTransacao() {

    }

    public void commitarTransacao() {

    }

    public void rollBackTransacao() {

    }
}
