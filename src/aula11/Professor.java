package aula11;

public class Professor extends Pessoa {
    // Atributos
    private String especialidae;
    private double salario;

    // Métodos Especiais
    public String getEspecialidae() {
        return especialidae;
    }

    public void setEspecialidae(String especialidae) {
        this.especialidae = especialidae;
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
