package br.ufg.inf.fabrica.conporta022018.modelo;

public class Pessoa {

    private String cpfPess;
    private String nomePes;
    private String emailPes;
    private String senhaUsu;
    private Boolean ehUsuAtivo;
    private Long ultimoLogin;

    public String getCpfPess() {
        return this.cpfPess;
    }

    public void setCpfPess(String cpfPess) {
        this.cpfPess = cpfPess;
    }

    public String getNomePes() {
        return this.nomePes;
    }

    public void setNomePes(String nomePes) {
        this.nomePes = nomePes;
    }

    public String getEmailPes() {
        return this.emailPes;
    }

    public void setEmailPes(String emailPes) {
        this.emailPes = emailPes;
    }

    public String getSenhaUsu() {
        return this.senhaUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }

    public Boolean isEhUsuAtivo() {
        return this.ehUsuAtivo;
    }

    public void setEhUsuAtivo(Boolean ehUsuAtivo) {
        this.ehUsuAtivo = ehUsuAtivo;
    }

    public Long getUltimoLogin() {
        return this.ultimoLogin;
    }

    public void setUltimoLogin(Long ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

}