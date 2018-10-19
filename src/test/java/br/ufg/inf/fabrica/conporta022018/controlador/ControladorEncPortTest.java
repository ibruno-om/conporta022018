package br.ufg.inf.fabrica.conporta022018.controlador;

import br.ufg.inf.fabrica.conporta022018.util.Extrator;
import br.ufg.inf.fabrica.conporta022018.util.LerArquivo;
import br.ufg.inf.fabrica.conporta022018.util.csv.ExtratorCSV;
import org.junit.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ControladorEncPortTest {

    private static ControladorEncPort controladorEncPort;

    @BeforeClass
    public static void casoTestPepararCenario() throws IOException {

        String CAMINHO_CSV = "src/test/java/br/ufg/inf/fabrica/conporta022018/controlador/EncPortDadosTest.csv";
        String REGRA = ";";
        List<String> dadosSoftware = new ArrayList<>();
        Extrator extrator = new ExtratorCSV();
        LerArquivo lerArquivo = new LerArquivo();
        String tabelaAtual = " ";
        String dados[];
        String linha;
        //Criar as instâncias de todos os objetos DAO's necessários para preparar o cenario.

        dadosSoftware = lerArquivo.lerArquivo(CAMINHO_CSV);

        for (int index = 0; index < dadosSoftware.size(); index++) {
            linha = dadosSoftware.get(index);

            //Definir as tabelas que serão populadas no Banco de Dados.
            if (linha.equals("pessoa") || linha.equals("portaria") || linha.equals("undAdm") || linha.equals("designado")) {
                tabelaAtual = linha;
                index++;
                continue;
            }

            switch (tabelaAtual) {
                case "pessoa" :
                    extrator.setTexto(linha);
                    dados = extrator.getResultado(REGRA);
                    //Aqui colocar os comandos para popular a tabela pessoa no Banco de Dados.
                    break;
                case "portaria" :
                    extrator.setTexto(linha);
                    dados = extrator.getResultado(REGRA);
                    //Aqui colocar os comandos para popular a tabela portaria no Banco de Dados.
                    break;
                case "undAdm" :
                    extrator.setTexto(linha);
                    dados = extrator.getResultado(REGRA);
                    //Aqui colocar os comandos para popular a tabela Unidade Administrativa no Banco de Dados.
                    break;
                case "designado" :
                    extrator.setTexto(linha);
                    dados = extrator.getResultado(REGRA);
                    //Aqui colocar os comandos para popular a tabela designados no Banco de dados.
                    break;
            }
        }
    }

    @Before
    public void casoTestPrepararExecucao() {

        // Neste Grupo ficará tudo que é necessário para a execução dos cenarios definidos para os testes.

        controladorEncPort = new ControladorEncPort();
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

        controladorEncPort.encPortariaCiencia("INF201802");
        // O cenário acima testa o encaminhamento de uma portaria para a ciência das unidades recebedoras e
        // dos designados uma vez que o sistema fez a requisição.

        controladorEncPort.encPortariaCiencia("INF201802");
        // O cenário acima testa o encaminhamento de uma portaria para a ciência das unidades recebedoras e
        // dos designados quando um usuário solicita o reenvio.

    }

    @Test
    public void casoTestDadosExcecoes() throws IOException {

        // Grupo de teste DadosExcecoes.

        controladorEncPort.encPortariaCiencia("INF201803");
        // O cenario acima testa a exceção do caso de uso, onde um ou mais email's não são validos.

    }

    @AfterClass
    public static void casoTestResultados() throws IOException {

        // Aqui deve ser verificado os resultados da exceção do Grupo G1 e G2, normalmente aqui
        // irá fica as suas pós-condições.

        List emails = new ArrayList();
        emails.add("keslleyls@exemplo.com");
        // Valida se o controlador do serviço de email teve sucesso em enviar o email de ciêcia para todos
        // os recebedores e designados

        // Assert.assertEquals(emails, rodaSQLparaPegarOsEnderecosDeEmailQueDeveriamReceberEmail);
    }

}