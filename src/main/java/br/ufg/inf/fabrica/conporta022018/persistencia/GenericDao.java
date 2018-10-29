package br.ufg.inf.fabrica.conporta022018.persistencia;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

public abstract class GenericDao<T> {

    private Class<T> classType = ((Class<T>) ((ParameterizedType) getClass()
            .getGenericSuperclass()).getActualTypeArguments()[0]);

    public void salvar(T entidade) {

    }

    public T buscar(Long id) {
        return null;
    }

    public List<T> pesquisarJPQLCustomizada(String jpql, Map<String, Object> parametros) {
        return null;
    }

    public T pesquisarUmJPQLCustomizada(String jpql, Map<String, Object> parametros){
        return  null;
    }

}