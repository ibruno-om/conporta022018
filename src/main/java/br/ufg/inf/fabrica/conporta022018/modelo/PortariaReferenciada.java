package br.ufg.inf.fabrica.conporta022018.modelo;

public class PortariaReferenciada {
    private Portaria PortariaReferenciada;
    private boolean ehCancelamento;

    /**
     * @return Portaria return the PortariaReferenciada
     */
    public Portaria getPortariaReferenciada() {
        return PortariaReferenciada;
    }

    /**
     * @param PortariaReferenciada the PortariaReferenciada to set
     */
    public void setPortariaReferenciada(Portaria PortariaReferenciada) {
        this.PortariaReferenciada = PortariaReferenciada;
    }

    /**
     * @return boolean return the ehCancelamento
     */
    public boolean isEhCancelamento() {
        return ehCancelamento;
    }

    /**
     * @param ehCancelamento the ehCancelamento to set
     */
    public void setEhCancelamento(boolean ehCancelamento) {
        this.ehCancelamento = ehCancelamento;
    }

}