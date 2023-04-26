package aplicacao;

import entidades.Livro;
import entidades.Revistas;
import interfaces.Imprimivel;

public class App {
    public static void main(String[] args) {

        Imprimivel[] listaImprimivel = new Imprimivel[2];

        listaImprimivel[0] = new Livro(
                "Linux, um Guia Pratico \n",
                "Sobel\n");


        listaImprimivel[1] = new Revistas(
                 "Actia Sentia \n",
                 122334);

        for (Imprimivel item: listaImprimivel) {
            item.imprimir();
        }
    }
}
