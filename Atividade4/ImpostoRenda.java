package Atividade4;

import javax.swing.*;

public class ImpostoRenda {

    public static void main(String[] args){


        double horasTrabalhadas =  Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
        int valorHora = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de sua hora"));
        double salarioBruto = 0.0;
        double salarioLiquido = 0.0;

        salarioBruto = horasTrabalhadas * valorHora;

        salarioLiquido = (salarioBruto / 100) * 11;






    }
}

