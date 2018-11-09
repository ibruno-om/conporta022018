
package br.ufg.inf.fabrica.conporta022018.persistencia;

import br.ufg.inf.fabrica.conporta022018.modelo.Portaria;
import br.ufg.inf.fabrica.conporta022018.modelo.PortariaExpedida;
import br.ufg.inf.fabrica.conporta022018.modelo.PortariaRecebida;
import java.util.List;


public class PortariaDAO {
      private PortariaExpedidaDAO portariaExpedidaDAO = new PortariaExpedidaDAO();
      private PortariaRecebidaDAO portariaRecebidaDAO = new PortariaRecebidaDAO();
      private Portaria portaria = new Portaria();
   
      public int atualizar(Portaria portaria) {
        return 0;
    }

    public Portaria buscarPort(String id) {
        String idPortariaRecebida = id;
        String idPortariaExpedida = id;

        List<PortariaRecebida> portariasRecebidas = portariaRecebidaDAO
                .buscarPortaria("Identificador da Portaria Recebida:" + idPortariaRecebida);

        List<PortariaExpedida> portariasExpedidas = portariaExpedidaDAO
                .buscarPortaria("Identificador da Portaria Expedida:" + idPortariaExpedida);

        if(portaria == null){        
          
            Portaria port = new Portaria();
            port.setPortariasRecebidas(portariasRecebidas);
       
           Portaria port1 = new Portaria();
            port1.setPortariasExpedidas(portariasExpedidas);
      
        }

        return portaria;
    }
}
