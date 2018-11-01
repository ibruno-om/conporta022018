package br.ufg.inf.fabrica.conporta022018.persistencia;

import br.ufg.inf.fabrica.conporta022018.modelo.Matriculado;

import java.util.Date;

public class MatriculadoDAO extends GenericoDAO<Matriculado>{


    public void novoMatriculado(String nomePes,
                                Integer cpfPes,
                                String emailPes,
                                int matrDiscCur,
                                Date dtIniMatrCur,
                                Date dtFimiMatrCur) {

        Matriculado matriculado = new Matriculado();
        matriculado.setNomePes(nomePes);
        matriculado.setCpfPes(cpfPes);
        matriculado.setEmailPes(emailPes);
        
        salvar(matriculado);
    }

}
