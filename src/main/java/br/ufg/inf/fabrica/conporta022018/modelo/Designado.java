package br.ufg.inf.fabrica.conporta022018.modelo;

import br.ufg.inf.fabrica.conporta022018.persistencia.DesignadoDAO;

import java.util.Date;

public class Designado {

    private Date dtCienciaDesig;

    private String descrFuncDesig;

    private Integer horasDefFuncDesig;

    private Integer horasExecFuncDesig;

    private FuncaoDesig funcaoDesig;

    private Pessoa pessoa;

    private Portaria portaria;

    private DesignadoDAO designadoDAO;
}
