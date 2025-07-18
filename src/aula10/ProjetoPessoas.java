package aula10;

public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        p1.setSexo("Masculino");
        p2.setSexo("Feminino");
        p3.setSexo("Masculino");
        p4.setSexo("Feminino");

        p1.setIdade(15);
        p2.setIdade(20);
        p3.setIdade(31);
        p4.setIdade(40);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        p2.setCurso("ADS");
        p3.setSalario(2500.75);
        p4.setSetor("Estoque");

        p3.receberAumento(559.20);
        p4.mudarTrabalho();
        p2.cancelarMatricula();
    }
}
