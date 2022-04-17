import java.util.ArrayList;

public class Aluno {
    private String nomeAluno;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Professor> professores;

    public Aluno(String nomeAluno, ArrayList<Disciplina> disciplinas, ArrayList<Professor> professores) {
        this.nomeAluno = nomeAluno;
        this.disciplinas = disciplinas;
        this.professores = professores;
    }

    public Aluno() {
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }
}
