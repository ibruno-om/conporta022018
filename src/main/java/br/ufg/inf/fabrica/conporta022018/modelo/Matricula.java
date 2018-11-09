package br.ufg.inf.fabrica.conporta022018.modelo;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Matricula {
    int matrDiscCur;
    Date dtFimMatrCur;
    Date cdIniMatrCur;


    public int getMatrDiscCur() {
        return matrDiscCur;
    }

    public void setMatrDiscCur(int matrDiscCur) {
        this.matrDiscCur = matrDiscCur;
    }

    public Date getDtFimMatrCur() {
        return dtFimMatrCur;
    }

    public void setDtFimMatrCur(Date dtFimMatrCur) {
        this.dtFimMatrCur = dtFimMatrCur;
    }

    public Date getCdIniMatrCur() {
        return cdIniMatrCur;
    }

    public void setCdIniMatrCur(Date cdIniMatrCur) {
        this.cdIniMatrCur = cdIniMatrCur;
    }
}
