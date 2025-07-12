package aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.status();

        System.out.println();

        Caneta c2 = new Caneta("NIC", "Amarelo", 0.4);
        c2.status();
    }
}
