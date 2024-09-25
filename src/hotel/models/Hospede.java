package hotel.models;

import java.time.LocalDate;
import java.time.Period;

public class Hospede {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;

    public Hospede(String nome, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public Hospede(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = LocalDate.now();
    }

    public Hospede(String nome) {
        this.nome = nome;
        this.cpf = "Não informado";
        this.dataNascimento = LocalDate.now();
    }

    public Hospede() {
        this.nome = "Não informado";
        this.cpf = "Não informado";
        this.dataNascimento = LocalDate.now();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean maiorDeIdade() {
        LocalDate hoje = LocalDate.now();
        return Period.between(dataNascimento, hoje).getYears() > 18;
    }
}