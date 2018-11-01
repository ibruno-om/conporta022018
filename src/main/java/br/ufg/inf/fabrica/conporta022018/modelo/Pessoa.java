package br.ufg.inf.fabrica.conporta022018.modelo;

import br.ufg.inf.fabrica.conporta022018.persistencia.PessoaDAO;

import java.util.List;

public class Pessoa {
    private String nomePes;

    private Integer cpfPes;

    private String emailPes;

    private String senhaUsu;

    private boolean ehUsuAtivo;

    private long ultimoLogin;

    private Designado designado;

    private PessoaDAO pessoaDAO;

}
