package hotel.models;

public class Quarto {
    private int numero;
    private String tipo;
    private double preco;
    private boolean ocupado;

    public Quarto() {
        this.numero = 0;
        this.tipo = "Indefinido";
        this.preco = 0.0;
        this.ocupado = false;
    }

    public Quarto(int numero) {
        this.numero = numero;
        this.tipo = "Indefinido";
        this.preco = 0.0;
        this.ocupado = false;
    }

    public Quarto(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.preco = 0.0;
        this.ocupado = false;
    }

    public Quarto(int numero, String tipo, Double preco) {
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
        this.ocupado = false;
    }

    public Quarto(int numero, String tipo, Double preco, boolean ocupado) {
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
        this.ocupado = ocupado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean reservar(Hospede hospede) {
        if (ocupado) {
            System.out.println("Este quarto está ocupado.");
            return false;
        }

        if (!hospede.maiorDeIdade()) {
            System.out.println("O hóspede deve ser maior de idade para reservar um quarto.");
            return false;
        }

        ocupado = true;
        System.out.println("O quarto foi reservado com sucesso!");
        return true;
    }

    public void cancelarReserva() {
        ocupado = false;
        System.out.println("A reserva do quarto foi cancelada.");
    }
}
