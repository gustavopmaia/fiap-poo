package br.com.fiapride.model;

public class Passageiro {
    private String nome;
    private String cpf;
    private double saldo;

    public Passageiro(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSaldo(0);
    }

    public void adicionarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: valor da recarga deve ser maior que zero.");
            return;
        }

        saldo += valor;
        System.out.println("Recarga realizada. Novo saldo: " + this.saldo);
    }

    public void pagarViagem(double custo) {
        if(custo <= 0) {
            System.out.println("Erro: valor da viagem deve ser maior que zero.");
            return;
        }
        if(this.saldo < custo) {
            System.out.println("Erro: Saldo insuficiente");
            return;
        }
        this.saldo -= custo;
        System.out.println("Viagem paga com sucesso. Saldo: " + this.saldo);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}