package aula12;

public class Aula12 {
    public static void main(String[] args) {
        // Animal n = new Animal();
        Mamifero m = new Mamifero(35.3, 10, 4, "Marrom");
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();

        m.alimentar();
        m.locomover();
        m.emitirSom();

        a.locomover();
        p.locomover();
        r.locomover();
        System.out.println();

        c.locomover();
        k.locomover();
        c.emitirSom();
        k.emitirSom();
        j.emitirSom();
        t.locomover();
        g.alimentar();
        e.fazerNinho();
    }
}
