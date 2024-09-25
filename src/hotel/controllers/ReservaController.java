package hotel.controllers;

import hotel.models.Hospede;
import hotel.models.Quarto;

import java.time.LocalDate;
import java.util.Scanner;

public class ReservaController {
    private QuartoController quartoController;
    private Scanner scanner = new Scanner(System.in);

    public ReservaController(QuartoController quartoController) {
        this.quartoController = quartoController;
    }

    public void fazerReserva() {
        System.out.print("Nome do hóspede: ");
        String nome = scanner.nextLine();
        System.out.print("CPF do hóspede: ");
        String cpf = scanner.nextLine();
        System.out.print("Data de nascimento (AAAA-MM-DD): ");
        LocalDate dataNascimento = LocalDate.parse(scanner.nextLine());

        System.out.print("Tipo de quarto desejado: ");
        String tipoQuarto = scanner.nextLine();

        Hospede hospede = new Hospede(nome, cpf, dataNascimento);
        if (!hospede.maiorDeIdade()) {
            System.out.println("Hóspede menor de idade. Reserva não permitida.");
            return;
        }

        Quarto quarto = quartoController.buscarQuartoDisponivel(tipoQuarto);
        if (quarto == null) {
            System.out.println("Quarto do tipo desejado não disponível.");
            return;
        }

        quartoController.removerQuarto(quarto);
        System.out.println("Reserva realizada com sucesso!");
        System.out.println("Detalhes da reserva:");
        System.out.println("Hóspede: " + hospede.getNome());
        System.out.println("Quarto: " + quarto.getNumero() + " (" + quarto.getTipo() + ")");
        System.out.println("Preço: " + quarto.getPreco());
    }

    public void cancelarReserva() {
        // pendente a lógica dessa função aqui mo rato kkkk slc
    }
}
