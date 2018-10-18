/*
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira.
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.fabrica.conporta022018.controlador.idSoft;

    import br.ufg.inf.fabrica.conporta022018.controlador.ControladorIdSoft;
    import br.ufg.inf.fabrica.conporta022018.util.Extrator;
    import br.ufg.inf.fabrica.conporta022018.util.LerArquivo;
    import br.ufg.inf.fabrica.conporta022018.util.csv.ExtratorCSV;
    import org.junit.*;
    import java.io.IOException;
    import java.text.SimpleDateFormat;
    import java.util.ArrayList;
    import java.util.Date;
    import java.util.List;

public class ControladorIdSoftTest {

    private static ControladorIdSoft controladorIdSoft;

    /*
     * Preparação do ambiente para teste.
     * População do banco de Dados para atendam os pré-requisitos do caso de uso.
     */

    @BeforeClass
    public static void casoTestPepararCenario() throws IOException {

        String CAMINHO_CSV = "src/test/java/br/ufg/inf/fabrica/conporta022018/controlador/idSoft/IdSoftTest.csv";
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

        //Neste Grupo ficará tudo que é necessário para a execução dos cenarios definidos para os testes.
        controladorIdSoft = new ControladorIdSoft();
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
        controladorIdSoft.idSoft("123.456.789-12", "123456");
        //Logando com o CPF.

        controladorIdSoft.idSoft("jose@exemplo.com", "123456");
        //Logando com o e-mail.

        controladorIdSoft.recuperarSenha("123.456.789-12");
        //Recuperar senha utilizando CPF.

        controladorIdSoft.recuperarSenha("jose@exemplo.com");
        //Recuperar senha utilizando e-mail.
    }

    @Test
    public void casoTestDadosExcecoes() throws IOException {

        //Grupo de teste DadosExcecoes, exemplo:
        controladorIdSoft.idSoft("123.456.789-12", "000000");
        //O cenario acima testa a primeira exceção do caso de uso, senha incorreta.

        controladorIdSoft.idSoft("123.123.789-12", "123456");
        //O cenario acima testa a primeira exceção do caso de uso, identificador CPF inválido.

        controladorIdSoft.idSoft("josew@exemplo.com", "123456");
        //O cenario acima testa a primeira exceção do caso de uso, identificador email inválido.

        controladorIdSoft.idSoft("123.321.123-32", "456123");
        //O cenario acima testa a segunda exceção do caso de uso, usuário inativo.


        controladorIdSoft.recuperarSenha("123.000.789-12");
        //O cenario acima testa a primeira exceção do fluxo alternativo, recuperar senha utilizando CPF inválido.

        controladorIdSoft.recuperarSenha("josew@exemplo.com");
        //O cenario acima testa a primeira exceção do fluxo alternativo, recuperar senha utilizando e-mail inválido.

        controladorIdSoft.recuperarSenha("123.321.123-32");
        //O cenario acima testa a segunda exceção do fluxo alternativo, recuperar senha utilizando o CPF de um usuário inativo.

        controladorIdSoft.recuperarSenha("maria@exemplo.com");
        //O cenario acima testa a segunda exceção do fluxo alternativo, recuperar senha utilizando o e-mail de um usuário inativo.
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
