package hotel.models;

public class Quarto {
    private Integer numero;
    private String tipo;
    private Double preco;

    public Quarto(Integer numero, String tipo, Double preco) {
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
    }

    public Quarto(Integer numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.preco = 0.0;
    }

    public Quarto(Integer numero) {
        this.numero = numero;
        this.tipo = "Básico";
        this.preco = 0.0;
    }

    public Quarto() {
        this.numero = 0;
        this.tipo = "Básico";
        this.preco = 0.0;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
