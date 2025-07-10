package aula02;

public class Missao {
    String nome;
    String descricao;
    String nivel;
    String status = "pendente";

    void status() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Nivel: " + this.nivel);
        System.out.println("Status: " + this.status);
    }

    void iniciar() {
        this.status = "em andamento";
    }

    void concluir() {
        this.status = "concluída";
    }

    void verificarMissao() {
        if (this.status.equals("concluída")) {
            System.out.println("A missão está completa!");
        } else {
            System.out.println("A missão não está completa, atualmente está " + this.status);
        }
    }
}
