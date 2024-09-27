package hotel.views;

import hotel.controllers.QuartoController;
import hotel.controllers.ReservaController;
import hotel.models.Quarto;

import java.util.Scanner;

public class ConsoleView {
    public static void main(String[] args) {
        QuartoController quartoController = new QuartoController();
        ReservaController reservaController = new ReservaController(quartoController);

        quartoController.adicionarQuarto(new Quarto(101, "Standard", 250.0));
        quartoController.adicionarQuarto(new Quarto(102, "Standard", 250.0));
        quartoController.adicionarQuarto(new Quarto(103, "Luxury", 150.0));
        quartoController.adicionarQuarto(new Quarto(104, "Luxury", 150.0));

        quartoController.adicionarQuarto(new Quarto(201, "Standard", 250.0));
        quartoController.adicionarQuarto(new Quarto(202, "Standard", 250.0));
        quartoController.adicionarQuarto(new Quarto(203, "Luxury", 150.0));
        quartoController.adicionarQuarto(new Quarto(204, "Luxury", 150.0));

        quartoController.adicionarQuarto(new Quarto(301, "Standard", 250.0));
        quartoController.adicionarQuarto(new Quarto(302, "Standard", 250.0));
        quartoController.adicionarQuarto(new Quarto(303, "Luxury", 150.0));
        quartoController.adicionarQuarto(new Quarto(304, "Luxury", 150.0));

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nHOTEL");
            System.out.println("1. Fazer Reserva");
            System.out.println("2. Cancelar Reserva");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    reservaController.fazerReserva();
                    break;
                case 2:
                    reservaController.cancelarReserva();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
