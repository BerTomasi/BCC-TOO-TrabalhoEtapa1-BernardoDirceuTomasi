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
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double valor = 0.0;
        int parcelas = 0;

        try {
            valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da compra:"));

            parcelas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de parcelas:"));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO");
            JOptionPane.showMessageDialog(null, "Classe do Erro: " + e.getClass());
            return;
        }

        LocalDate[] data = new LocalDate[parcelas];
        Double[] vParcela = new Double[parcelas];

        for (int i = 0; i < parcelas; i++) {
            if (i == 0) {
                data[i] = LocalDate.now();
            } else {
                data[i] = data[i - 1].plusDays(30);
            }
            vParcela[i] = valor / parcelas;
        }

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Valor da compra: " + valor);
        System.out.println("Tota de parcelas: " + parcelas);
        for (int i = 0; i < (parcelas); i++) {
            System.out.println("Valor da parcela: " + vParcela[i] + " Data do " + (i + 1) + "º vencimento: " + formato.format(data[i]));
        }

    }

}
