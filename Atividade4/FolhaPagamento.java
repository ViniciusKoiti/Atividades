package Atividade4;

public class FolhaPagamento {


    int valorHora;
    double horasTrabalhadas;

    double fgts;
    double salarioBruto;
    double salarioLiquido;

    double sindicato;

    double porcentagemRenda;
    double impostoRenda;


    public FolhaPagamento(){

    }

    public FolhaPagamento(int valorHora, double horasTrabalhadas){
        this.valorHora = valorHora;
        this.horasTrabalhadas =  horasTrabalhadas ;

        salarioBruto = valorHora * horasTrabalhadas;
        fgts = (salarioBruto / 100) * 11;
        sindicato = (salarioBruto / 100) * 3;
        porcentagemRenda = getPorcentagemRenda(salarioBruto);

        salarioLiquido = salarioBruto - fgts - sindicato - (salarioBruto * porcentagemRenda);

        mostraFolhaPagamento(salarioBruto,fgts,sindicato,salarioLiquido);
    }

    public void mostraFolhaPagamento(double salarioBruto,double fgts,double sindicato,double salarioLiquido){
        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("Imposto de Renda: " + impostoRenda);
        System.out.println("INSS: ");
        System.out.println(salarioLiquido);
    }
    public double getPorcentagemRenda(double salarioBruto){
        if (salarioBruto <= 900){
            porcentagemRenda = 0;
        }
        else if (salarioBruto >= 1500){
            porcentagemRenda = (5 / 100);
        } else if (salarioBruto >= 2500){
            porcentagemRenda = (10 / 100);
        } else if (salarioBruto < 2500) {
            porcentagemRenda = (20 / 100);
        }
        return porcentagemRenda;
    }

}
