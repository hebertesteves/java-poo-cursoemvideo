package aula06;

public class ControleRemoto implements Controlador {
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos Especiais
    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    private int getVolume() {
        return this.volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return this.ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return this.tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Sobrescrevendo Métodos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()) {
            System.out.println("----- MENU -----");
            System.out.println("Está ligado? " + (this.getLigado() ? "Sim" : "Não"));
            System.out.println("Está tocando? " + (this.getTocando() ? "Sim" : "Não"));
            System.out.print("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
            System.out.println();
        } else {
            System.out.println("Ligue o controle para exibir o menu");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.getLigado()) {
            System.out.println("Fechando Menu...");
        } else {
            System.out.println("Ligue o controle para fechar o menu");
        }
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Ligue o controle primeiro para aumentar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Ligue o controle primeiro para diminuir o volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        } else {
            System.out.println("Ligue o controle primeiro para ligar o mudo");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        } else {
            System.out.println("Ligue o controle primeiro para desligar o mudo");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        } else {
            System.out.println("Não foi possivel reproduzir");
        }
    }

    @Override
    public void pause(){
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("Não foi possivel pausar");
        }
    }
}
