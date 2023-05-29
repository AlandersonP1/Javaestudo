package Gassossiação.classes;

public class Seminario {
    private String titulo;
    private Aluno[] aluno;

    private Professor professor;
    private Local local;

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Seminario() {
    }

    public Aluno[] getAluno() {
        return aluno;
    }



    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }


    public Seminario(Professor professor, Local local) {
        this.professor = professor;
        this.local = local;
    }

    public void print() {
        System.out.println("-------------------Relatorios de seminários------------");
        System.out.println("Titulo:  "+this.titulo);
        System.out.println("Professor palestrante"+this.professor.getNome());
        System.out.println("Local, rua"+this.local.getRua()+"Bairro: "+this.local.getBairro());
        System.out.println("Alunos participantes");
        for(Aluno aluno : aluno) {
            System.out.println(aluno.getNome());
        }

    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
