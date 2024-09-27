package hotel.controllers;

import hotel.models.Quarto;

import java.util.ArrayList;

public class QuartoController {
    private ArrayList<Quarto> quartosDisponiveis = new ArrayList<Quarto>();

    public ArrayList<Quarto> getQuartosDisponiveis() {
        return quartosDisponiveis;
    }

    public void cadastrarQuartos(QuartoController quartoController) {
        quartoController.adicionarQuarto(new Quarto(101, "Luxury", 250.0));
        quartoController.adicionarQuarto(new Quarto(102, "Luxury", 250.0));
        quartoController.adicionarQuarto(new Quarto(103, "Deluxe", 150.0));
        quartoController.adicionarQuarto(new Quarto(104, "Deluxe", 150.0));
        quartoController.adicionarQuarto(new Quarto(105, "Standard", 50.0));
        quartoController.adicionarQuarto(new Quarto(106, "Standard", 50.0));

        quartoController.adicionarQuarto(new Quarto(201, "Luxury", 250.0));
        quartoController.adicionarQuarto(new Quarto(202, "Luxury", 250.0));
        quartoController.adicionarQuarto(new Quarto(203, "Deluxe", 150.0));
        quartoController.adicionarQuarto(new Quarto(204, "Deluxe", 150.0));
        quartoController.adicionarQuarto(new Quarto(205, "Standard", 50.0));
        quartoController.adicionarQuarto(new Quarto(206, "Standard", 50.0));

        quartoController.adicionarQuarto(new Quarto(301, "Luxury", 250.0));
        quartoController.adicionarQuarto(new Quarto(302, "Luxury", 250.0));
        quartoController.adicionarQuarto(new Quarto(303, "Deluxe", 150.0));
        quartoController.adicionarQuarto(new Quarto(304, "Deluxe", 150.0));
        quartoController.adicionarQuarto(new Quarto(305, "Standard", 50.0));
        quartoController.adicionarQuarto(new Quarto(306, "Standard", 50.0));
    }

    public void adicionarQuarto(Quarto quarto) {
        quartosDisponiveis.add(quarto);
    }

    public Quarto buscarQuartoDisponivel(String tipo) {
        for (Quarto quarto : quartosDisponiveis) {
            if (quarto.getTipo().equalsIgnoreCase(tipo)) {
                return quarto;
            }
        }
        return null;
    }

    public void removerQuarto(Quarto quarto) {
        quartosDisponiveis.remove(quarto);
    }
}

