package br.ufg.inf.fabrica.conporta022018.controlador.proPorta;

import br.ufg.inf.fabrica.conporta022018.controlador.ControladorProPorta;
import br.ufg.inf.fabrica.conporta022018.util.Extrator;
import br.ufg.inf.fabrica.conporta022018.util.LerArquivo;
import br.ufg.inf.fabrica.conporta022018.util.csv.ExtratorCSV;
import org.junit.*;

import java.io.IOException;
import java.util.ArrayList;
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

            if (){
                tabelaAtual = linha;
                index++;
                continue;
            }

            switch (tabelaAtual){

            }
        }
    }


}



