package aula13;

public class Aula13 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();

        m.emitirSom();
        l.emitirSom();
        c.emitirSom();
        System.out.println();

        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(11);
        c.reagir(21);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5);
        c.reagir(17, 4.5);
    }
}
