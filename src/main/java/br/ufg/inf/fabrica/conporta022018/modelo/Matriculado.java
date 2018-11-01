package br.ufg.inf.fabrica.conporta022018.modelo;

import br.ufg.inf.fabrica.conporta022018.persistencia.MatriculadoDAO;

import java.util.Date;

public class Matriculado extends Pessoa {
    private int matrDiscCur;

    private Date dtIniMatrCur;

    private Date dtFimiMatrCur;

    private UndAdm undAdm;

    private Pessoa pessoa;

    private Curso curso;

    private MatriculadoDAO matriculadoDAO;
}
