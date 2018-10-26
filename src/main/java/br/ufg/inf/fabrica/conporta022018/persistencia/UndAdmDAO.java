/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.fabrica.conporta022018.persistencia;

import br.ufg.inf.fabrica.conporta022018.modelo.UndAdm;

/**
 *
 * @author Breno Gomes
 */
public class UndAdmDAO extends GenericoDAO<UndAdm> {

    public UndAdmDAO() {
        super(UndAdm.class);
    }         
    
    public void teste() {
        UndAdm undAdm = new UndAdm();
        undAdm.getMinInat();
    }
}
