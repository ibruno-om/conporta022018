package br.ufg.inf.fabrica.conporta022018.modelo;

public class Recebedora {
     
    private Date dtCienciaReeb;
    private Portaria portariaRecebida;
    private UndAdm unidadeRecebedora;

    public void setDtCienciaReeb(Date dtCienciaReeb){
        this.dtCienciaReeb = dtCienciaReeb;
    }  

    public Date getDtCienciaReeb(){
        return this.dtCienciaReeb;
    }

    public void setPortariaRecebida(Portaria portariaRecebida){
        this.portariaRecebida = portariaRecebida;
    }  

    public Date getPortariaRecebida(){
        return this.portariaRecebida;
    }

    public void setUnidadeRecebedora(UndAdm unidadeRecebedora){
        this.unidadeRecebedora = unidadeRecebedora;
    }  

    public Date getUnidadeRecebedora(){
        return this.unidadeRecebedora;
    }
}