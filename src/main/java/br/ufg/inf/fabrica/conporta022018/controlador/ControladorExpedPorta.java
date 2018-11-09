package br.ufg.inf.fabrica.conporta022018.controlador;

import br.ufg.inf.fabrica.conporta022018.persistencia.PortariaDAO;

/**
 * @author RafaelBP
 * @since 19/10/2018
 */
public class ControladorExpedPorta {

    private Portaria portaria;
    private Pessoa expedidor = new Pessoa();
    private PortariaDAO dao = new PortariaDAO();
    private UnidAdm unidAdm = new UnidAdm();

    /**
     * Faz a expedição de uma portaria com status "Proposta" <br>
     * Caso a expedição seja bem sucedida, o código retornado será 1; <br>
     * Caso contrário, os códigos de erros são os seguintes: <br>
     *  <ul>
     *      <li> 2 - Portaria inválida - Cancelada, Expirada ou Expedida </li>
     *      <li> 3 - Portaria inválida - Período de vigência expirado </li>
     *      <li> 4 - Designado inválido - Inexistente </li>
     *      <li> 5 - Portaria inexistente </li>
     *  </ul>
     *
     * @param idPortaria identificador da portaria a ser expedida
     * @return código referente ao resultado do processo
     * */
    public int expedPorta(int idPortaria) {


        /* se o acesso for válido (servidor com acesso de chefe ou substituto de chefe)*/

        portaria = dao.buscar(idPortaria);

        if (portaria.getIdPortaria().isEmpty()) return 5;

        // consegue os identificadores do expedidor e da unidade expedidora, para busca dos dados restantes
        expedidor = portaria.getExpedidor();
        unidAdm = portaria.getUnidadeExpedidora();

        if (portaria.getStatus().valor != 0) {
            return 2;
        } else {
            /*
             * Busca os dados das entidades relacionadas à portaria a ser expedida. Estes incluem:
             *
             *   Portarias referenciadas
             *   Designados (Pessoa(s) relacionada(s) com a portaria a ser expedida na tabela Designado)
             *   Unidades Recebedoras (Unidade Administrativa que está relacionada com a portaria a ser expedida na tabela
             *                           Unidade Administrativa)
             *   Unidade Expedidora
             *   Expedidor (Pessoa)
             * */

            // assinar portaria
            assinarPortaria(portaria);

            // persistir portaria
            if(dao.salvar(portaria)){

                // encaminhar portaria
                // cancelar portarias
                return 1;
            } else {
                // jogar exceção?
            }
        }
        return 0;
    }

    private String assinarPortaria(Portaria portaria){
        return null;
    }
}
