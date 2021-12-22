package trabalho_exercicios;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Bernardo Dirceu Tomasi
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double salario = 0.0;
        Double inss = 0.0;
        String nome;

        try {
            nome = JOptionPane.showInputDialog("Informe o nome da pessoa:");
            
            salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário:"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO");
            JOptionPane.showMessageDialog(null, "Classe do Erro: " + e.getClass());
            return;
        }

        if (salario >= 0 && salario <= 1100.00) {
            inss = salario * 0.075;
        } else if (salario >= 1100.01 && salario <= 2203.48) {
            inss = salario * 0.09;
        } else if (salario >= 2203.49 && salario <= 3305.22) {
            inss = salario * 0.12;
        } else if (salario >= 3305.23 && salario <= 6433.57) {
            inss = salario * 0.14;
        } else if (salario >= 6433.58) {
            inss = 6433.57 * 0.14;
        }

        JOptionPane.showMessageDialog(null, "Nome: " + nome
                + "\nSalário bruto: " + salario
                + "\nINSS: " + inss
                + "\nSalário líquido: " + (salario - inss));
    }
}
