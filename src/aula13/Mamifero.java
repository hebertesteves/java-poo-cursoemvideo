package aula13;

public class Mamifero extends Animal {
    protected String corPeso;

    public String getCorPeso() {
        return corPeso;
    }

    public void setCorPeso(String corPeso) {
        this.corPeso = corPeso;
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }
}
