package entidades;

import interfaces.Imprimivel;

public class Revistas implements Imprimivel {
        private String nome;
        private int numero;

    public Revistas(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }
    @Override
    public void imprimir(){
        System.out.println("Revista: " + this.nome +
                "Numero: " + this.numero);
    }
}
