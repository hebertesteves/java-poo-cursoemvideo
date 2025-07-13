package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(int numConta, String dono) {
        this.setNumConta(numConta);
        this.setDono(dono);
        this.setStatus(false);
        this.setSaldo(0.0);
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo) {
        if (!this.getStatus()) {
            if (tipo.equals("CC")) {
                this.setSaldo(50);
                this.setTipo(tipo);
                this.setStatus(true);
                System.out.println("Abrindo a conta corrente");
            } else if (tipo.equals("CP")) {
                this.setSaldo(150);
                this.setTipo(tipo);
                this.setStatus(true);
                System.out.println("Abrindo a conta poupança");
            } else {
                System.out.println("Tipo de conta inválido");
            }
        } else {
            System.out.println("A conta ja está aberta");
        }
    }

    public void fecharConta() {
        if (this.getStatus()) {
            if (this.getSaldo() > 0) {
                System.out.println("Não pode fechar a conta, retire seu dinheiro");
            } else if (this.getSaldo() < 0) {
                System.out.println("Não pode fechar a conta, está em débito com o banco");
            } else {
                System.out.println("Fechando a conta");
                this.setStatus(false);
            }
        } else {
            System.out.println("A conta ja está fechada");
        }
    }

    public void depositar(double deposito) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("Foi realizado o deposito no valor de R$ " + deposito);
        } else {
            System.out.println("Não foi possível depositar, abra sua conta primeiro");
        }
    }

    public void sacar(double saque) {
        if (this.getStatus()) {
            if (saque <= this.getSaldo()) {
                this.setSaldo(this.getSaldo() - saque);
                System.out.println("Foi realizado o saque no valor de R$ " + saque);
            } else {
                System.out.println("ERRO! Você não possui esse valor para sacar");
            }
        } else {
            System.out.println("Não foi possível sacar, abra sua conta primeiro");
        }
    }

    public void pagarMensal() {
        int mensalidade;
        if (this.getStatus()) {
            if (this.getTipo().equals("CC")) {
                mensalidade = 12;
                if (this.getSaldo() >= mensalidade) {
                    this.setSaldo(this.getSaldo() - mensalidade);
                    System.out.println("Foi pago a mensalidade no valor de R$ " + mensalidade);
                } else {
                    System.out.println("Você não possui saldo suficiente para pagar a mensalidade");
                }
            } else if (this.getTipo().equals("CP")) {
                mensalidade = 20;
                if (this.getSaldo() >= mensalidade) {
                    this.setSaldo(this.getSaldo() - mensalidade);
                    System.out.println("Foi pago a mensalidade no valor de R$ " + mensalidade);
                } else {
                    System.out.println("Você não possui saldo suficiente para pagar a mensalidade");
                }
            }
        } else {
            System.out.println("Não foi possível pagar a mensalidade, abra sua conta primeiro");
        }
    }

    public void exibirConta() {
        System.out.println("Sobre a Conta: ");
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.printf("Saldo: R$ %.2f%n", this.getSaldo());
        System.out.println("Status da conta: " + (this.status ? "Aberta" : "Fechada"));
    }

}
