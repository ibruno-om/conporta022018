package br.ufg.inf.fabrica.conporta022018.modelo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Perfil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String descricao;
    @ManyToMany
    private List<Permissao> permissoes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean getPermicao(String urlFuncionalidade, String operacao) {
        for (Permissao obj : permissoes) {
            if((urlFuncionalidade.equalsIgnoreCase(obj.getUrlFuncionalidade())) && (operacao.equalsIgnoreCase(obj.getOperacao()))) {
                return true;
            }
        }
        return false;
    }

    public void Acesso(){

    }
}