package aula10;

public class Funcionario extends Pessoa {
    // Atributos
    private String setor;
    private boolean trabalhando;

    // Métodos Especiais
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    // Métodos
    public void mudarTrabalho() {
        this.setTrabalhando(!this.getTrabalhando());
    }
}
