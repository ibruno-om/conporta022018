package br.ufg.inf.fabrica.conporta022018.controlador;

import java.util.Date;


class Filtro {
   private String nomeUnd;
   private Date dtInExped;
   private Date dtFimExped;
   private Date dtInVig;
   private Date dtFimVig;
   private boolean isServidor;
   private String cargoServ;
   private boolean isDiscente;


    public Filtro(nomeUnd, dtInExped, dtFimExped, dtInVig, dtFimVig, isServidor, cargoServ, isDiscente) {
        this.nomeUnd = nomeUnd;
        this.dtInExped = dtInExped;
        this.dtFimExped = dtFimExped;
        this.dtInVig = dtInVig;
        this.dtFimVig = dtFimVig;
        this.isServidor = isServidor;
        this.cargoServ = cargoServ;
        this.isDiscente = isDiscente;
    }
}
