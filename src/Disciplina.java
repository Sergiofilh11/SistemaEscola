import java.util.ArrayList;

public class Disciplina {
    private String nomeDisciplina;
    private ArrayList<Aluno> alunos;

    public Disciplina(String nomeDisciplina, ArrayList<Aluno> alunos) {
        this.nomeDisciplina = nomeDisciplina;
        this.alunos = alunos;
    }

    public Disciplina() {
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}
