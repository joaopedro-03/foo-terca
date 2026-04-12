package aula7;

public class Cliente {
    public String nome;
    public String cpf;
    public Float saldo;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, Float saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }


    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(Float saldo, String cpf) {
        this.saldo = saldo;
        this.cpf = cpf;
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

