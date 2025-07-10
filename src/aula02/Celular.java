package aula02;

public class Celular {
    String marca;
    String cor;
    double tamanhoTela;
    int bateria;
    String sistemaOperacional;
    Boolean ligado;

    void status() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamanho da Tela: " + tamanhoTela + " polegadas");
        System.out.println("Bateria: " + this.bateria + "%");
        System.out.println("Sistema Operacional: " + this.sistemaOperacional);
        if (ligado) {
            System.out.println("Celular está ligado");
        } else {
            System.out.println("Celular está desligado");
        }
    }

    void ligar() {
        if (bateria > 0) {
            System.out.println("Ligando celular");
            ligado = true;
        } else {
            System.out.println("Celular está descarregado, não é possivel ligar");
        }
    }

    void desligar() {
        if (this.ligado) {
            System.out.println("Desligando celular");
            this.ligado = false;
        } else {
            System.out.println("O celular já está desligado");
        }
    }
}
