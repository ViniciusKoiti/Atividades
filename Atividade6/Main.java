package Atividade6;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setAtivo(true);
        Cliente cliente = new Cliente();
        Endereco endereco1 = new Endereco();
        endereco1.setAtivo(false);
        cliente.adicionarEnderecos(endereco1);
        cliente.adicionarEnderecos(endereco);


        System.out.println(cliente.retornaNumeroEnderecosAtivos());

    }
}
