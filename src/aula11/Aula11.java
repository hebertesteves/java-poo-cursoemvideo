package aula11;

public class Aula11 {
    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("Masculino");
        v1.fazerAniversario();
        System.out.println(v1);

        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("Masculino");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5);
        b1.setSexo("Masculino");
        b1.pagarMensalidade();

        Professor p3 = new Professor();
        p3.setNome("Claudio");
        p3.setSexo("Masculino");
        p3.setIdade(30);
        p3.setSalario(2500.75);
        p3.receberAumento(1500.20);
        System.out.println(p3.getSalario());

        Tecnico t1 = new Tecnico();
        t1.setNome("Pedro");
        t1.setIdade(18);
        t1.setSexo("Masculino");
        t1.setMatricula(1113);
        t1.praticar();
        t1.pagarMensalidade();
    }
}
