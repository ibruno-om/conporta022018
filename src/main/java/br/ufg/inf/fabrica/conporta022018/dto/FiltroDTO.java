
package br.ufg.inf.fabrica.conporta022018.dto;

import java.util.Date;


public class FiltroDTO {

    private Long codigoDesignado;

    private Long codigoUnidadeAdm;

    private Integer anoPortaria;

    private Date inicioVigencia;

    private Date fimVigencia;

    public FiltroDTO() {

    }

    public FiltroDTO(Long codigoDesignado, Long codigoUnidadeAdm, Integer anoPortaria, Date inicioVigencia, Date fimVigencia) {
        this.codigoDesignado = codigoDesignado;
        this.codigoUnidadeAdm = codigoUnidadeAdm;
        this.anoPortaria = anoPortaria;
        this.inicioVigencia = inicioVigencia;
        this.fimVigencia = fimVigencia;
    }


    public Long getCodigoDesignado() {
        return codigoDesignado;
    }

    public void setCodigoDesignado(Long codigoDesignado) {
        this.codigoDesignado = codigoDesignado;
    }

    public Long getCodigoUnidadeAdm() {
        return codigoUnidadeAdm;
    }

    public void setCodigoUnidadeAdm(Long codigoUnidadeAdm) {
        this.codigoUnidadeAdm = codigoUnidadeAdm;
    }

    public Integer getAnoPortaria() {
        return anoPortaria;
    }

    public void setAnoPortaria(Integer anoPortaria) {
        this.anoPortaria = anoPortaria;
    }

    public Date getInicioVigencia() {
        return inicioVigencia;
    }

    public void setInicioVigencia(Date inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public Date getFimVigencia() {
        return fimVigencia;
    }

    public void setFimVigencia(Date fimVigencia) {
        this.fimVigencia = fimVigencia;
    }
}
