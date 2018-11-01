package br.ufg.inf.fabrica.conporta022018.modelo;

import br.ufg.inf.fabrica.conporta022018.persistencia.LotacaoDAO;

import java.util.Date;

public class Lotacao {
    private Date dtIniLotServ;

    private Date dtFimLotServ;

    private String descrCargoServ;

    private Cargo cargo;

    private Pessoa pessoa;

    private UndAdm undAdm;

    private LotacaoDAO lotacaoDAO;
}
