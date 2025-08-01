package aula15;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML");

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 18, "F", "creuzita");

        System.out.println(v[0]);
        System.out.println(g[0]);

        Visualizacao[] vis = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]); // Jubileu assiste HTML
        vis[0].avaliar();
        System.out.println(vis[0]);
        vis[1] = new Visualizacao(g[0], v[1]); // Jubileu assiste PHP
        vis[1].avaliar(87.0);
        System.out.println(vis[1]);
    }
}
