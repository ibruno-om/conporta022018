package br.ufg.inf.fabrica.conporta022018.controlador;

import java.util.Date;


class Filtro {
   private String nomeUnd;
   private Date dtExped;
   private Date dtInVig;
   private Date dtFimVig;
   private boolean isServidor;
   private String cargoServ;
   private boolean isDiscente;

    public Filtro(nomeUnd, dtExped, dtInVig, dtFimVig, isServidor, cargoServ, isDiscente;) {
        this.nomeUnd = nomeUnd;
        this.dtExped = dtExped;
        this.dtInVig = dtInVig;
        this.dtFimVig = dtFimVig;
        this.isServidor = isServidor;
        this.cargoServ = cargoServ;
        this.isDiscente = isDiscente;
    }
}
