/*
 * Copyright (c) 2018.
 * Fabrica de Software INF
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.fabrica.conporta022018.controlador.cancPortRef;

import br.ufg.inf.fabrica.conporta022018.controlador.ControladorCancPortRef;
import br.ufg.inf.fabrica.conporta022018.util.Extrator;
import br.ufg.inf.fabrica.conporta022018.util.LerArquivo;
import br.ufg.inf.fabrica.conporta022018.util.csv.ExtratorCSV;
import org.junit.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ControladorCancPortRefTest {

    private static ControladorCancPortRef controladorCancPortRef;

    /*
     * Preparação do ambiente para teste.
     * População do banco de Dados para atendam os pré-requisitos do caso de uso.
     */

    @BeforeClass
    public static void casoTestPepararCenario() throws IOException {

        String CAMINHO_CSV = "src/test/java/br/ufg/inf/fabrica/conporta022018/controlador/cancPortRef/CancPortRefDadosTest.csv";
        String REGRA = ";";
        List<String> dadosSoftware = new ArrayList<>();
        Extrator extrator = new ExtratorCSV();
        LerArquivo lerArquivo = new LerArquivo();
        String tabelaAtual = " ";
        String dados[];
        String linha;
        // Criar as instâncias de todos os objetos DAO's necessários para preparar o cenario.

        dadosSoftware = lerArquivo.lerArquivo(CAMINHO_CSV);

        for (int index = 0; index < dadosSoftware.size(); index++) {
            linha = dadosSoftware.get(index);

            // Definir as tabelas que serão populadas no Banco de Dados.
            if (linha.equals("portaria")) {
                tabelaAtual = linha;
                index++;
                continue;
            }

            switch (tabelaAtual) {
                case "portaria" :
                    extrator.setTexto(linha);
                    dados = extrator.getResultado(REGRA);
                    // Aqui colocar os comandos para popular a tabela portaria no Banco de Dados.
                    break;
                case "portariaReferenciada" :
                    extrator.setTexto(linha);
                    dados = extrator.getResultado(REGRA);
                    // Aqui colocar os comandos para popular a tabela portariaReferenciada no Banco de Dados.
                    break;
            }
        }
    }

    @Before
    public void casoTestPrepararExecucao() {

        // Neste Grupo ficará tudo que é necessário para a execução dos cenarios definidos para os testes.
        controladorCancPortRef = new ControladorCancPortRef();
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

        // Grupo de teste DadosValidos
        controladorCancPortRef.cancelarPortariaReferenciada("INF201810");

    }

    @Test
    public void casoTestDadosExcecoes() throws IOException {

        // Grupo de teste DadosExcecoes

        controladorCancPortRef.cancelarPortariaReferenciada("INF201801");
        // O cenario acima testa a primeira exceção do caso de uso, onde a portaria não é localizada.

        controladorCancPortRef.cancelarPortariaReferenciada("INF201811");
        // O cenario acima testa a segunda exceção do caso de uso, onde uma das portarias referenciadas para
        // cancelamento possui o status "Proposta".

        controladorCancPortRef.cancelarPortariaReferenciada("INF201812");
        // O cenario acima testa a segunda exceção do caso de uso, onde uma das portarias referenciadas para
        // cancelamento possui o status "Cancelada".

        controladorCancPortRef.cancelarPortariaReferenciada("INF201813");
        // O cenario acima testa a "exceção interna" do caso de uso, onde não existem portarias referenciadas.
    }

    @AfterClass
    public static void casoTestResultados() throws IOException {

        // Aqui deve ser verificado os resultados da exceção do Grupo G1 e G2, normalmente aqui
        // irá fica as suas pós-condições. Exemplo:

        String status = "cancelada";
        // Pega no banco de dados os status das portarias referenciadas com indicativo de cancelamento e verifica
        // se são iguais à "cancelada".

        // Assert.assertEquals(status, rodaSQLparaPegarOsStatusDasPortariasReferenciadasParaCancelamentoBancoDeDados);
    }

}
