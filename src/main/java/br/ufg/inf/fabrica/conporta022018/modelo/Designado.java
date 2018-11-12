package br.ufg.inf.fabrica.conporta022018.modelo;

import br.ufg.inf.fabrica.conporta022018.persistencia.DesignadoDAO;

import java.util.Date;
import java.util.List;

public class Designado {

    private Date dtCienciaDesig;
    private String descrFuncDesig;
    private int horasDefFuncDesig;
    private int horasExecFuncDesig;
    private Pessoa pessoa;
    private FuncaoDesig funcaoDesig;
    private Portaria portaria;
    private DesignadoDAO designadoDAO;

    /**
     * @return Date return the dtCienciaDesig
     */
    public Date getDtCienciaDesig() {
        return dtCienciaDesig;
    }

    /**
     * @param dtCienciaDesig the dtCienciaDesig to set
     */
    public void setDtCienciaDesig(Date dtCienciaDesig) {
        this.dtCienciaDesig = dtCienciaDesig;
    }

    /**
     * @return String return the descrFuncDesig
     */
    public String getDescrFuncDesig() {
        return descrFuncDesig;
    }

    /**
     * @param descrFuncDesig the descrFuncDesig to set
     */
    public void setDescrFuncDesig(String descrFuncDesig) {
        this.descrFuncDesig = descrFuncDesig;
    }

    /**
     * @return Integer return the horasDefFuncDesig
     */
    public Integer getHorasDefFuncDesig() {
        return horasDefFuncDesig;
    }

    /**
     * @param horasDefFuncDesig the horasDefFuncDesig to set
     */
    public void setHorasDefFuncDesig(Integer horasDefFuncDesig) {
        this.horasDefFuncDesig = horasDefFuncDesig;
    }

    /**
     * @return Integer return the horasExecFuncDesig
     */
    public Integer getHorasExecFuncDesig() {
        return horasExecFuncDesig;
    }

    /**
     * @param horasExecFuncDesig the horasExecFuncDesig to set
     */
    public void setHorasExecFuncDesig(Integer horasExecFuncDesig) {
        this.horasExecFuncDesig = horasExecFuncDesig;
    }

}