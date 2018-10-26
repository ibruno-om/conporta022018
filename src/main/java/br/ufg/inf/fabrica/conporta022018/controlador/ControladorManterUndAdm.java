/*
 * Copyright (c) 2018.
 * Fabrica de Software INF
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.fabrica.conporta022018.controlador;
import br.ufg.inf.fabrica.conporta022018.modelo.UndAdm;

public class ControladorManterUndAdm {
    
    public void editarTimeOut(int timeOut, String sigla){
        if(timeOut < 1 || timeOut >60){
            System.out.println("Esse intervalo de tempo não é permitido");
        }
        
    }
    

}
