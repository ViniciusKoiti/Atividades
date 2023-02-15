package Atividade5;

import Atividade5.Enum.Condicao;
import Atividade5.Enum.Sexo;

public class Pessoa {

    private Sexo sexo;
    private double peso;
    private double altura;

    private Condicao condicao;

    public Pessoa(){

    }

    public Pessoa(Sexo sexo,double peso,double altura){
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;

        condicao = getCondicao(sexo,peso,altura);

    }

    private Condicao getCondicao(Sexo sexo, double peso, double altura) {

        double imc = calcularImc(peso,altura);

        switch (sexo){
            case MASCULINO -> {
                if(imc < 19.1){
                    return Condicao.ABAIXO_PESO;
                } if (imc < 25.8) {
                    return Condicao.PESO_NORMAL;
                } if (imc < 32.3) {
                    return Condicao.ACIMA_PESO;
                }
            }
            case FEMININO -> {
                if(imc < 20.7){
                    return Condicao.ABAIXO_PESO;
                } if (imc < 26.4) {
                    return Condicao.PESO_NORMAL;
                } if (imc < 31.1){
                   return Condicao.ACIMA_PESO;
                }
            }
        }
        return Condicao.OBESO;
    }

    private double calcularImc(double peso, double altura) {
        double imc = peso/(altura * altura);
        return imc;
    }


}
