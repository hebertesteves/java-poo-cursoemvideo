package aula09;

public class Livro implements Publicacao {
    // Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // Métodos Especiais
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.setPagAtual(1);
        this.setAberto(false);
        this.setLeitor(leitor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        if (totPaginas > 0) {
            this.totPaginas = totPaginas;
        } else {
            throw new IllegalArgumentException("O total de páginas deve ser maior que zero.");
        }
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // Métodos
    public void detalhes() {
        System.out.println("Detalhes do livro:");
        System.out.println("------------------------");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotPaginas());
        System.out.println("Página atual: " + this.getPagAtual());
        System.out.println("Aberto: " + (this.getAberto() ? "Sim" : "Não"));
        System.out.println("Leitor: " + this.getLeitor().getNome());
    }

    @Override
    public void abrir() {
        if (!this.getAberto()) {
            System.out.println("Abrindo o livro");
            this.setAberto(true);
        } else {
            System.out.println("Não é possível abrir o livro, pois ele já está aberto");
        }
    }

    @Override
    public void fechar() {
        if (this.getAberto()) {
            System.out.println("Fechando o livro");
            this.setAberto(false);
        } else {
            System.out.println("Não é possível fechar o livro, pois ele já está fechado");
        }
    }

    @Override
    public void folhear(int p) {
        if (this.getAberto()) {
            if (p <= this.getTotPaginas() && p > 0) {
                System.out.println("Folheando o livro até a página " + p);
                this.setPagAtual(p);
            } else {
                System.out.println("Não é possível folhear o livro até essa página");
            }
        } else {
            System.out.println("Não é possível folhear o livro até a página " + p + ", pois o livro está fechado");
        }
    }

    @Override
    public void avancarPag() {
        if (this.getAberto()) {
            if (this.getPagAtual() == this.getTotPaginas()) {
                System.out.println("Não é possível avançar uma página, pois o livro já chegou no final");
            } else {
                System.out.println("Avançando uma página");
                this.setPagAtual(this.getPagAtual() + 1);
            }
        } else {
            System.out.println("Não é possível avançar uma página, pois o livro está fechado");
        }
    }

    @Override
    public void voltarPag() {
        if (this.getAberto()) {
            if (this.getPagAtual() > 1) {
                System.out.println("Voltando uma página");
                this.setPagAtual(this.getPagAtual() - 1);
            } else {
                System.out.println("Não é possível voltar uma página, pois o livro está no começo");
            }

        } else {
            System.out.println("Não é possível voltar uma página, pois o livro está fechado");
        }
    }
}
