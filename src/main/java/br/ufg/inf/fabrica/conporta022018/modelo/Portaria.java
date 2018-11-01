package br.ufg.inf.fabrica.conporta022018.modelo;

import br.ufg.inf.fabrica.conporta022018.persistencia.PortariaDAO;

import java.sql.Blob;
import java.util.Date;

public class Portaria {
    private String idPortaria;

    private Integer anoId;

    private Integer segId;

    private String assunto;

    private Date dtExped;

    private String periodVig;

    private Date dtIniVig;

    private Date dtFimVig;

    private Date dPublicDou;

    private Integer horasDesig;

    private String resumo;

    private String textoCompleto;

    private Blob arqPdf;

    private String assinatura;

    private PortariaStatus portariaStatus;

    private PortariaReferenciada[] portariaReferenciada;

    private Recebedora recebedora;

    private Adm adm;


    private Pessoa pessoa;


    private UndAdm undAdm;

    private PortariaDAO portariaDAO;
}
