package Atividade6;

import java.util.ArrayList;

public class Cliente {

    private static long ultimoId = 0;
    private final long id;

    private ArrayList<Endereco> enderecos = new ArrayList<>();

    public Cliente(){
        this.id = recuperarId();
    }

    public void adicionarEnderecos(Endereco endereco){
        this.enderecos.add(endereco);
    }

    public Cliente(long id) {
        this.id = id;

        if (Cliente.ultimoId < id) {
            Cliente.ultimoId = id;
        }
    }

    public long recuperarId(){
        return Cliente.ultimoId++;
    }

    public int retornaNumeroEnderecosAtivos(){
        return this.enderecos.stream().filter(Endereco::isAtivo).toList().size();
    }


    public void exibirEnderecos(){
        for(Endereco endereco: enderecos){
            System.out.println(endereco.toString());
        }
    }
}
