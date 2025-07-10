package aula02;

public class Aula02_Exercicio {
    public static void main(String[] args) {
        Missao missao01 = new Missao();
        missao01.nome = "Missão 01";
        missao01.descricao = "Buscar as ferramentas no galpão do mago";
        missao01.nivel = "Fácil";

        missao01.iniciar();
        missao01.status();
        missao01.verificarMissao();

        missao01.concluir();
        missao01.verificarMissao();

        System.out.println();

        Celular s23 = new Celular();
        s23.marca = "Samsung";
        s23.cor = "Preto";
        s23.bateria = 0;
        s23.tamanhoTela = 6.3;
        s23.sistemaOperacional = "Android 20";
        s23.ligado = false;
        s23.ligar();
        s23.status();
    }
}
