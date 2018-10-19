/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.fabrica.conporta022018.modelo;

/**
 *
 * @author Breno de Melo Gomes
 */
public class UndAdm {
    private String siglaUndAdm;
    private int minInat;
    
    public UndAdm(String siglaUndAdm, int minInat){
        this.siglaUndAdm = siglaUndAdm;
        this.minInat = minInat;
    }
    
    
    public String getSiglaUndAdm() {
        return siglaUndAdm;
    }

    public void setSiglaUndAdm(String siglaUndAdm) {
        this.siglaUndAdm = siglaUndAdm;
    }

    public int getMinInat() {
        return minInat;
    }

    public void setMinInat(int minInat) {
        this.minInat = minInat;
    }
    
    
   
}
