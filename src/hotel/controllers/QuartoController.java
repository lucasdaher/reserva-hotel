package hotel.controllers;

import hotel.models.Quarto;

import java.util.ArrayList;

public class QuartoController {
    private ArrayList<Quarto> quartosDisponiveis = new ArrayList<Quarto>();

    public ArrayList<Quarto> getQuartosDisponiveis() {
        return quartosDisponiveis;
    }

    public void cadastrarQuartos(QuartoController quartoController) {
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

