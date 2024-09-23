package hotel.views;

import hotel.controllers.ReservaController;

import javax.swing.*;
import java.awt.*;

public class GUIView extends JFrame {
    private JTextField txtRoomNumber;
    private JTextField txtGuestName;
    private JButton btnMakeReservation;
    private JButton btnCancelReservation;
    private JLabel lblStatus;

    public GUIView() {
        // Configuração da janela
        setTitle("Sistema de Reserva de Hotel");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Criação dos componentes
        txtRoomNumber = new JTextField(10);
        txtGuestName = new JTextField(10);
        btnMakeReservation = new JButton("Fazer Reserva");
        btnCancelReservation = new JButton("Cancelar Reserva");
        lblStatus = new JLabel("Status: ");

        // Adiciona os componentes ao painel
        JPanel panel = new JPanel();
        panel.add(new JLabel("Número do Quarto:"));
        panel.add(txtRoomNumber);
        panel.add(new JLabel("Nome do Hóspede:"));
        panel.add(txtGuestName);
        panel.add(btnMakeReservation);
        panel.add(btnCancelReservation);
        panel.add(lblStatus);

        // Adiciona o painel à janela
        add(panel, BorderLayout.CENTER);

        // Adiciona listeners aos botões
//        btnMakeReservation.addActionListener(e -> makeReservation());
//        btnCancelReservation.addActionListener(e -> cancelReservation());
    }

    private void makeReservation() {
        // Chama o método do controlador para fazer a reserva
        ReservaController controller = new ReservaController();
        String roomNumber = txtRoomNumber.getText();
        String guestName = txtGuestName.getText();
        boolean success = controller.makeReservation(roomNumber, guestName);
        if (success) {
            lblStatus.setText("Reserva feita com sucesso!");
        } else {
            lblStatus.setText("Erro ao fazer reserva.");
        }
    }

//    private void cancelReservation() {
//        // Chama o método do controlador para cancelar a reserva
//        ReservaController controller = new ReservaController();
//        String roomNumber = txtRoomNumber.getText();
//        boolean success = controller.cancelReservation(roomNumber);
//        if (success) {
//            lblStatus.setText("Reserva cancelada com sucesso!");
//        } else {
//            lblStatus.setText("Erro ao cancelar reserva.");
//        }
//    }

    public static void main(String[] args) {
        GUIView view = new GUIView();
        view.setVisible(true);
    }
}