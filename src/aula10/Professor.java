package aula10;

public class Professor extends Pessoa {
    // Atributos
    private String especialidade;
    private double salario;

    // Métodos Especiais
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Métodos
    public void receberAumento(double aum) {
        this.setSalario(this.getSalario() + aum);
    }
}
