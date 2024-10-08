public class Gerente extends Funcionario {
    private String projeto;

    public Gerente(String nome, int anoNasc, double salario, String projeto) {
        super(nome, anoNasc, salario);
        this.projeto = projeto;
    }

    public String informarProjeto() {
        return this.projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public String getProjeto() {
        return this.projeto;
    }

}