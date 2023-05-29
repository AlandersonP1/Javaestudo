package Gassossiação.classes;

public class Professor {
    private String nome;
    private String especialidade;
    private Professor professor;
    private Seminario[] seminarios;
    private Local local;



    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public void print() {
        System.out.println("-------------------Relatorios de professor------------");
        System.out.println("Nome do Professor" +this.nome);
        System.out.println("Especialidade" +this.especialidade);
        System.out.println("Seminarios participantes ");
        for(Seminario sem : seminarios) {
            System.out.println(sem.getTitulo() + "   ");
        }


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
