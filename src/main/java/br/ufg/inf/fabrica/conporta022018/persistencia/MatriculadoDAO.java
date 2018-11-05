package br.ufg.inf.fabrica.conporta022018.persistencia;

import br.ufg.inf.fabrica.conporta022018.modelo.Matriculado;
import br.ufg.inf.fabrica.conporta022018.modelo.Pessoa;

import java.util.Date;

public class MatriculadoDAO extends GenericoDAO<Matriculado>{

    Matriculado matriculado = new Matriculado();


    public void novoMatriculado(String nomePes,
                                Integer cpfPes,
                                String emailPes,
                                int matrDiscCur,
                                Date dtIniMatrCur,
                                Date dtFimiMatrCur) {

        PessoaDAO pessoaDAO = new PessoaDAO();
        Pessoa discente = pessoaDAO.buscar(cpfPes);

        if (discente == null) {

            discente = new Pessoa();
            discente.setNomePes(nomePes);
            discente.setCpfPes(cpfPes);
            discente.setEmailPes(emailPes);

        }

        matriculado.setDiscente(discente);
        matriculado.setDtIniMatrCur(dtIniMatrCur);
        matriculado.setDtFimiMatrCur(dtFimiMatrCur);

        CursoDAO cursoDAO = new CursoDAO();
        matriculado.setCurso(cursoDAO.buscar());

        salvar(matriculado);
    }

}
