package br.ufg.inf.fabrica.conporta022018.persistencia;

import br.ufg.inf.fabrica.conporta022018.modelo.Portaria;
import br.ufg.inf.fabrica.conporta022018.modelo.PortariaReferenciada;

import java.util.List;

public class PortariaDAO {
    private PortariaReferenciadaDAO portariaReferenciadaDAO = new PortariaReferenciadaDAO();

    public int atualizar(Portaria portaria) {
        return 0;
    }

    public Portaria buscarUm(String condicao) {
        String idPortaria = condicao;

        List<PortariaReferenciada> portariasReferenciadas = portariaReferenciadaDAO
                .buscarTodos("idPortariaReferencia = " + idPortaria);

        Portaria portaria = new Portaria();
        portaria.setPortariaReferenciadas(portariasReferenciadas);

        return portaria;
    }
}
