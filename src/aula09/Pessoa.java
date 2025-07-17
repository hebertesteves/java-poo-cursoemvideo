package aula09;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String sexo;

    // Métodos Especiais
    public Pessoa(String nome, int idade, String sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            throw new IllegalArgumentException("Idade inválida.");
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // Métodos
    public void fazerAniver() {
        this.setIdade(this.getIdade() + 1);
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade() + " anos");
        System.out.println("Sexo: " + this.getSexo());
    }
}
