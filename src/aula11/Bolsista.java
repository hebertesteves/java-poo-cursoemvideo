package aula11;

public class Bolsista extends Aluno {
    // Atributos
    private double bolsa;

    // Métodos Especiais
    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    // Métodos
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do bolsista " + this.getNome());
    }
}
