package trabalho_exercicios;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Bernardo Dirceu Tomasi
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double valorTotal = 0.0;
        Double diaria = 0.0;
        String usuarioLoc;
        String usuarioDev;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        Calendar dataLoc = Calendar.getInstance();
        Calendar dataDev = Calendar.getInstance();

        try {
            diaria = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da diaria:"));
            
            usuarioLoc = JOptionPane.showInputDialog("Informe a data de LOCAÇÃO no formato dd/mm/aaaa");
            dataLoc.setTime(sdf.parse(usuarioLoc));
            
            usuarioDev = JOptionPane.showInputDialog("Informe a data de DEVOLUÇÃO no formato dd/mm/aaaa");
            dataDev.setTime(sdf.parse(usuarioDev));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO");
            JOptionPane.showMessageDialog(null, "Classe do Erro: " + e.getClass());
            return;
        }

        Long diferenca = dataDev.getTimeInMillis() - dataLoc.getTimeInMillis();
        int milisDia = (24 * 60 * 60 * 1000);
        Long dias = diferenca / milisDia;

        valorTotal = diaria * dias;

        JOptionPane.showMessageDialog(null, "Valor da diária: " + diaria
                + "\nData de locação: " + sdf.format(dataLoc.getTime())
                + "\nData de devolução: " + sdf.format(dataDev.getTime())
                + "\n Dias de locação: " + dias
                + "\nValor total da locação: " + valorTotal);

    }

}
