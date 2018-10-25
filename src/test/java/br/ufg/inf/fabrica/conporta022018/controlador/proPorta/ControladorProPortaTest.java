package br.ufg.inf.fabrica.conporta022018.controlador.proPorta;

import br.ufg.inf.fabrica.conporta022018.controlador.ControladorProPorta;
import br.ufg.inf.fabrica.conporta022018.util.Extrator;
import br.ufg.inf.fabrica.conporta022018.util.LerArquivo;
import br.ufg.inf.fabrica.conporta022018.util.csv.ExtratorCSV;
import org.junit.*;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ControladorProPortaTest{
    private static ControladorProPorta controladorProPorta;

    @BeforeClass
    public static void casoTestPrepararCenario() throws IOException{
        final String CAMINHO_CSV = "src/test/java/br/ufg/inf/fabrica/conporta022018/controlador/regCiencDesig/ProPortaTest.csv";
        final String REGRA = ";";
        List<String> dadosSoftware = new ArrayList<>();
        Extrator extrator = new ExtratorCSV();
        LerArquivo lerArquivo = new LerArquivo();
        String tabelaAtual = " ";
        String dados[];
        String linha;

        dadosSoftware = lerArquivo.lerArquivo(CAMINHO_CSV);

        for (int index = 0; index < dadosSoftware.size(); index++) {

            linha = dadosSoftware.get(index);

            if (linha.equals("pessoa")||linha.equals("portaria")||linha.equals("undAdm")||linha.equals("designado")){
                tabelaAtual = linha;
                index++;
                continue;
            }

            switch (tabelaAtual){
                case "pessoa" :
                    extrator.setTexto(linha);
                    dados = extrator.getResultado(REGRA);
                    break;
                case "portaria" :
                    extrator.setTexto(linha);
                    dados = extrator.getResultado(REGRA);
                    break;
                case "undAdm" :
                    extrator.setTexto(linha);
                    dados = extrator.getResultado(REGRA);
                    break;
                case "designado" :
                    extrator.setTexto(linha);
                    dados = extrator.getResultado(REGRA);
                    break;
            }
        }
    }

    @Before
    public void casoTestPrepararExecucao(){
        controladorProPorta = new ControladorProPorta();
    }

    @Test
    public void casoTestDadosValidos()throws ParseException {
        DateFormat f = DateFormat.getDateInstance();
        Date dtIniVig = f.parse("12/01/2010");
        Date dtFimVig = f.parse("30/10/2019");
        controladorProPorta.ProPorta("Controle de estagio", dtIniVig, dtFimVig, 8, "" +
                "Portaria que cuida dos estagiarios na UFG", "Portaria com a responsabilidade de cuidar" +
                "dos estagiarios e manter o funcionamento dos processos de estagio");
    }

    @Test
    public void casoTestDadosInvalidos () throws ParseException{
        DateFormat f = DateFormat.getDateInstance();
        Date dtIniVig = f.parse("12/05/2019");
        Date dtFimVig = f.parse("30/10/2019");
        controladorProPorta.ProPorta("Controle de estagio", dtIniVig, dtFimVig, 28, "" +
                "Portaria que cuida dos estagiarios na UFG", "Portaria com a responsabilidade de cuidar" +
                "dos estagiarios e manter o funcionamento dos processos de estagio");
    }


}



