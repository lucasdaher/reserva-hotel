package hotel.controllers;

import hotel.models.Hospede;

public class ReservaController {
    public void criarReserva(int numQuarto, String nomeHospede) {
        Hospede hospede = new Hospede();
        hospede.setNome(nomeHospede);
    }

}
