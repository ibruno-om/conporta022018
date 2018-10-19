/*
 * Copyright (c) 2018.
 * Fabrica de Software INF
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.fabrica.conporta022018.controlador.ediTemTim;

import br.ufg.inf.fabrica.conporta022018.controlador.ControladorEdiTemTim;
import br.ufg.inf.fabrica.conporta022018.util.Extrator;
import br.ufg.inf.fabrica.conporta022018.util.LerArquivo;
import br.ufg.inf.fabrica.conporta022018.util.csv.ExtratorCSV;
import org.junit.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import br.ufg.inf.fabrica.conporta022018.modelo.Acesso
import br.ufg.inf.fabrica.conporta022018.modelo.UndAdm        

public class ControladorEdiTemTimTest {

    private static ControladorEdiTemTim controladorEdiTemTim;
    private dadosAcesso[]
    /*
     * Preparação do ambiente para teste.
     * População do banco de Dados para atendam os pré-requisitos do caso de uso.
     */

    @BeforeClass
    public static void casoTestPepararCenario() throws IOException {

        String CAMINHO_CSV = "src/test/java/br/ufg/inf/fabrica/conporta022018/controlador/editTemTim/ControladorEdiTemTim.csv";
        String REGRA = ";";
        List<String> dadosSoftware = new ArrayList<>();
        Extrator extrator = new ExtratorCSV();
        LerArquivo lerArquivo = new LerArquivo();
        String tabelaAtual = " ";
        String dadosAcesso[];
        String dadosUndAdm[];
        String linha;        

        dadosSoftware = lerArquivo.lerArquivo(CAMINHO_CSV);

        for (int index = 0; index < dadosSoftware.size(); index++) {
            linha = dadosSoftware.get(index);

            //Definir as tabelas que serão populadas no Banco de Dados.
            if (linha.equals("acesso") || linha.equals("undAdm")) {
                tabelaAtual = linha;
                index++;
                continue;
            }

            switch (tabelaAtual) {
                case "acesso" :
                    extrator.setTexto(linha);
                    dadosAcesso = extrator.getResultado(REGRA);  
                    //Aqui colocar comandos para envia ao BD
                    break;               
                case "undAdm" :
                    extrator.setTexto(linha);
                    dadosUndAdm = extrator.getResultado(REGRA);  
                    //Aqui colocar comandos para envia ao BD
                    break;         
            }
        }
    }

    @Before
    public void casoTestPrepararExecucao() {

        //Neste Grupo ficará tudo que é necessário para a execução dos cenarios definidos para os testes.
        controladorEdiTemTim = new ControladorEdiTemTim();
    }

    /*
     * Criar os cenários de testes para a aplicação:
     * Os cenarios de testes devem obrigatóriamente ser divididos em dois grupos.
     * DadosValidos : Grupo destinado ao cenatio típico e aos cenarios alternativos do caso de uso.
     * DadosExcecoes : Grupo destinado as exceções do cenario típico e dos cenarios alternativos.
     * Cada cenário e cada exceção deve necessáriamente ser testado no minimo uma vez, cada entrada e/ou combinação
     * de entrada deve ser testadas pelo menos os seus limites quando houver para o G1 e para o G2.
     */

    @Test
    public void casoTestDadosValidos() throws IOException {

        //Grupo de teste DadosValidos, exemplo:   
        //caso 1
        UndAdm undAdm = new UndAdm("INF",15);
        Acesso acesso = new Acesso("chefe");        
        controladorEdiTemTim.alterarTempoDeSessaoDeUnidadeAdministrativa(undAdm, acesso);
        //caso 2
        UndAdm undAdm2 = new UndAdm("INF",30);
        Acesso acesso2 = new Acesso("chefe");        
        controladorEdiTemTim.alterarTempoDeSessaoDeUnidadeAdministrativa(undAdm2, acesso2);

    }

    @Test
    public void casoTestDadosExcecoes() throws IOException {

        //Grupo de teste DadosExcecoes, exemplo:
        UndAdm undAdm = new UndAdm("INF",15);
        Acesso acesso = new Acesso("coordenador");        
        controladorEdiTemTim.alterarTempoDeSessaoDeUnidadeAdministrativa(undAdm, acesso);
        //O cenario acima testa que o acesso como coordenador não permite o uso da funcionalidade
        UndAdm undAdm2 = new UndAdm("INF",15);
        Acesso acesso2 = new Acesso("designado");        
        controladorEdiTemTim.alterarTempoDeSessaoDeUnidadeAdministrativa(undAdm2, acesso2);
        //O cenario acima testa que o acesso como designado não permite o uso da funcionalidade
        UndAdm undAdm3 = new UndAdm("INF", 6);
        Acesso acesso3 = new Acesso("chefe");                
    }

    @AfterClass
    public static void casoTestResultados() throws IOException {

        //Aqui deve ser verificado os resultados da exceção do Grupo G1 e G2, normalmente aqui
        // irá fica as suas pós-condições. Exemplo:

        //Busca a data atual.
        Date hoje = new Date();
        SimpleDateFormat df;
        df = new SimpleDateFormat("dd/MM/yyyy");
        String dataHoje = df.format(hoje);

        //pega a data que foi armazenada no banco de dados e verifica com a data de execução do teste, ou seja,
        // a data de hoje.

        //Assert.assertEquals(dataHoje, rodaSQLparaPegarADataGravadaNoBancoDeDados);
    }

}
