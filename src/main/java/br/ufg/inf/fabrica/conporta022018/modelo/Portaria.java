package br.ufg.inf.fabrica.conporta022018.modelo;

import java.util.List;

public class Portaria {
    private String idPortaria;
    private List<PortariaExpedida> portariasExpedidas;
    private List<PortariaRecebida> portariasRecebidas;

    public String getIdPortaria() {
        return this.idPortaria;
    }

    public void setIdPortaria(String idPortaria) {
        this.idPortaria = idPortaria;
    }

    public List<PortariaExpedida> getPortariasExpedidas() {
        return portariasExpedidas;
    }

    public void setPortariasExpedidas(List<PortariaExpedida> portariasExpedidas) {
        this.portariasExpedidas = portariasExpedidas;
    }

    public List<PortariaRecebida> getPortariasRecebidas() {
        return portariasRecebidas;
    }

    public void setPortariasRecebidas(List<PortariaRecebida> portariasRecebidas) {
        this.portariasRecebidas = portariasRecebidas;
    }


}