package Atividade5.Enum;

public enum Condicao {

    ABAIXO_PESO("Abaixo do peso"),
    PESO_NORMAL("No peso normal"),
    MARGINALMENTE_ACIMA_PESO("Marginalmente acima do peso"),
    ACIMA_PESO("Acima do peso ideal"),
    OBESO("Obeso");

    private final String condicao;

    Condicao(String condicao){
        this.condicao = condicao;
    }

    public String getCondicao() {
        return condicao;
    }
}
