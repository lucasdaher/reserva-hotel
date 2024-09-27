package hotel.views;

import hotel.controllers.QuartoController;
import hotel.controllers.ReservaController;

import java.util.Scanner;

public class ConsoleView {
    public static void main(String[] args) {
        QuartoController quartoController = new QuartoController();
        ReservaController reservaController = new ReservaController(quartoController);

        quartoController.cadastrarQuartos(quartoController);

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
