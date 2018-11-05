package br.ufg.inf.fabrica.conporta022018.modelo;

import br.ufg.inf.fabrica.conporta022018.persistencia.MatriculadoDAO;

import java.util.Date;

public class Matriculado {

    private int matrDiscCur;
    private Date dtIniMatrCur;
    private Date dtFimiMatrCur;

    private Pessoa discente;
    private Curso curso;

    private MatriculadoDAO matriculadoDAO;

    public void setMatrDiscCur(int matrDiscCur) {
        this.matrDiscCur = matrDiscCur;
    }

    public void setDtIniMatrCur(Date dtIniMatrCur) {
        this.dtIniMatrCur = dtIniMatrCur;
    }

    public void setDtFimiMatrCur(Date dtFimiMatrCur) {
        this.dtFimiMatrCur = dtFimiMatrCur;
    }

    public void setDiscente(Pessoa discente) {
        this.discente = discente;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
