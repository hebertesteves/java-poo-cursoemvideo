package aula05;

import java.util.Locale;

public class Aula05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        ContaBanco conta1 = new ContaBanco(1000, "Hebert Esteves");
        conta1.abrirConta("CC");
        conta1.depositar(1500);
        conta1.pagarMensal();
        conta1.sacar(1538);
        conta1.fecharConta();

        System.out.println();
        conta1.exibirConta();

        System.out.println();
        ContaBanco conta2 = new ContaBanco(1001, "Fulano");
        conta2.abrirConta("CP");
        conta2.pagarMensal();
        conta2.depositar(22);
        conta2.sacar(152);
        conta2.fecharConta();
        conta2.exibirConta();
    }
}
