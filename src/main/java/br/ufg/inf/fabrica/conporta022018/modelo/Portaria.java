package br.ufg.inf.fabrica.conporta022018.modelo;

import java.util.List;

public class Portaria {
    private String idPortaria;
    private Enum<PortariaStatus> status;
    private List<PortariaReferenciada> portariasReferenciadas;

    public String getIdPortaria() {
        return this.idPortaria;
    }

    public void setIdPortaria(String idPortaria) {
        this.idPortaria = idPortaria;
    }

    public Enum<PortariaStatus> getStatus() {
        return status;
    }

    public void setStatus(Enum<PortariaStatus> status) {
        this.status = status;
    }

    public List<PortariaReferenciada> getPortariasReferenciadas() {
        return portariasReferenciadas;
    }

    public void setPortariaReferenciadas(List<PortariaReferenciada> portariaReferenciadas) {
        this.portariasReferenciadas = portariaReferenciadas;
    }


}
