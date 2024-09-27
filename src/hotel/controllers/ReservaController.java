package hotel.controllers;

import hotel.models.Hospede;
import hotel.models.Quarto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ReservaController {
    private QuartoController quartoController;
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Quarto> quartosReservados = new ArrayList<Quarto>();

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

        System.out.print("Tipo de quarto desejado (Luxury ou Standard): ");
        String tipoQuarto = scanner.nextLine();

        Hospede hospede = new Hospede(nome, cpf, dataNascimento);
        if (!hospede.maiorDeIdade()) {
            System.out.println("O hóspede deve ser maior de idade para realizar uma reserva.");
            return;
        }

        Quarto quarto = quartoController.buscarQuartoDisponivel(tipoQuarto);
        if (quarto == null) {
            System.out.println("Quarto do tipo desejado não disponível.");
            return;
        }

        quartoController.removerQuarto(quarto);
        quartosReservados.add(quarto);
        System.out.println("Reserva realizada com sucesso!\n");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Detalhes da reserva:");
        System.out.println("Hóspede: " + hospede.getNome());
        System.out.println("Quarto: " + quarto.getNumero() + " (" + quarto.getTipo() + ")");
        System.out.println("Preço: R$" + quarto.getPreco());
        System.out.println("-------------------------------------------------------------------");
    }

    public void cancelarReserva() {
        System.out.print("Nome do hóspede que fez a reserva: ");
        String nome = scanner.nextLine();
        System.out.print("CPF do hóspede que fez a reserva: ");
        String cpf = scanner.nextLine();
        System.out.print("Número do quarto reservado: ");
        int numeroQuarto = Integer.parseInt(scanner.nextLine());

        Hospede hospede = new Hospede(nome, cpf, null);
        Quarto quarto = null;
        for (Quarto q : quartosReservados) {
            if (q.getNumero() == numeroQuarto) {
                quarto = q;
                break;
            }
        }

        if (quarto == null) {
            System.out.println("Quarto não encontrado.");
            return;
        }
        quartoController.adicionarQuarto(quarto);
        quartosReservados.remove(quarto);
        System.out.println("Reserva cancelada com sucesso!\n");
    }
}
