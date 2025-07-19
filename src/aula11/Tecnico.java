package aula11;

public class Tecnico extends Aluno {
    // Atributos
    private int registroProfissional;

    // Métodos Especiais
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    // Métodos
    public void praticar() {
        System.out.println("Praticando...");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do técnico " + this.getNome());
    }
}
