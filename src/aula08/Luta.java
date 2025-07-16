package aula08;

import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos Especiais
    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    // Métodos
    public void marcarLuta(Lutador l1, Lutador l2, int rounds) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2 && rounds > 0) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            this.setRounds(rounds);
            System.out.println("Luta marcada entre " + l1.getNome() + " e " + l2.getNome() + " na categoria " + l1.getCategoria());
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            System.out.println("A luta não foi marcada!");
        }
    }

    public void lutar() {
        if (this.getAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();

            System.out.println();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            System.out.println();

            Random random = new Random();
            int ganhouDesafiado = 0;
            int ganhouDesafiante = 0;


            for (int i = 0; i < this.getRounds(); i++) {
                int vencedor = random.nextInt(3); // 0 1 2
                System.out.println("Round " + (i + 1));
                switch (vencedor) {
                    case 0: // Empate
                        System.out.println("Empate!");
                        break;
                    case 1: // Desafiado vence
                        System.out.println("Vitória de " + this.desafiado.getNome() + "!");
                        ganhouDesafiado++;
                        break;
                    case 2: // Desafiante vence
                        System.out.println("Vitória de " + this.desafiante.getNome() + "!");
                        ganhouDesafiante++;
                        break;
                }
                System.out.println();
            }

            System.out.println("===== RESULTADO DA LUTA ======");
            System.out.println("Placar final: " + ganhouDesafiado + " vs "+ ganhouDesafiante);
            if (ganhouDesafiado > ganhouDesafiante) {
                System.out.println("Vitória do " + this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
            } else if (ganhouDesafiante > ganhouDesafiado) {
                System.out.println("Vitória do " + this.desafiante.getNome());
                this.desafiado.perderLuta();
                this.desafiante.ganharLuta();
            } else {
                System.out.println("Empatou a luta!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
            }
            System.out.println("===============================");
        } else {
            System.out.println("A luta não pode acontecer, pois ela não foi aprovada!");
        }
    }
}
