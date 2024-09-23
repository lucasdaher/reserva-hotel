package hotel.models;

public class Hospede {
    private String nome;
    private String data_nascimento;
    private Integer cpf;

    public Hospede() {
        this.nome = "Indefinido";
        this.data_nascimento = "Indefinido";
        this.cpf = 0;
    }

    public Hospede(String nome) {
        this.nome = nome;
        this.data_nascimento = "Indefinido";
        this.cpf = 0;
    }

    public Hospede(String nome, String data_nascimento) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.cpf = 0;
    }

    public Hospede(String nome, String data_nascimento, Integer cpf) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }
}
