public class Professor {
    private String nomeProf;
    private Disciplina disciplina;

    public Professor(String nomeProf, Disciplina disciplina) {
        this.nomeProf = nomeProf;
        this.disciplina = disciplina;
    }

    public Professor() {
    }

    public String getNomeProf() {
        return nomeProf;
    }

    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
