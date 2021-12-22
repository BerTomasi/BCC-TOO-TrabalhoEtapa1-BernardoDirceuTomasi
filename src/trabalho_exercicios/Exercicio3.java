package trabalho_exercicios;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Bernardo Dirceu Tomasi
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dataUsuario = JOptionPane.showInputDialog("Informe a data de pagamento no formato dd/mm/aaaa");

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate data = LocalDate.now();

        try {
            data = LocalDate.parse(dataUsuario, formato);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO");
            JOptionPane.showMessageDialog(null, "Classe do Erro: " + e.getClass());
            return;
        }

        System.out.println("Data informada: " + formato.format(data));
        for (int i = 0; i < 5; i++) {
            data = data.plusDays(7);
            System.out.println("Data de pagamento: " + formato.format(data));

        }
    }

}
