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

    public void setNomePes(String nomePes) {
        this.nomePes = nomePes;
    }

    public void setCpfPes(Integer cpfPes) {
        this.cpfPes = cpfPes;
    }

    public void setEmailPes(String emailPes) {
        this.emailPes = emailPes;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }

    public void setEhUsuAtivo(boolean ehUsuAtivo) {
        this.ehUsuAtivo = ehUsuAtivo;
    }

    public void setUltimoLogin(long ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }



}
