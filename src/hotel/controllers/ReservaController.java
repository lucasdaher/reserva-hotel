package hotel.controllers;

import hotel.models.Hospede;

public class ReservaController {
    public boolean criarReserva(String numQuarto, String nomeHospede) {
        Hospede hospede = new Hospede();
        hospede.setNome(nomeHospede);
        return false;
    }

}
