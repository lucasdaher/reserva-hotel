package hotel.controllers;

import hotel.models.Quarto;

import java.util.ArrayList;

public class QuartoController {
    private ArrayList<Quarto> quartosDisponiveis = new ArrayList<>();

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

