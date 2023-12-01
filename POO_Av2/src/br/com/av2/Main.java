package br.com.av2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Categoria categoria1 = new Categoria("Açougue");
        Categoria categoria2 = new Categoria("Plastico");
        Categoria categoria3 = new Categoria("Matimentos");
        Categoria categoria4 = new Categoria("Gelados");
        Categoria categoria5 = new Categoria("Eletro");

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Carne", 10.0, "", categoria1));
        produtos.add(new Produto("Vasilha", 15.0, "",categoria1));
        produtos.add(new Produto("Miolo", 20.0, "", categoria1));
        produtos.add(new Produto("Sorvete", 25.0, "", categoria2));
        produtos.add(new Produto("Picolé", 30.0, "", categoria2));

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(123,0,1));
        pedidos.add(new Pedido(123,0,1));
        pedidos.add(new Pedido(123,0,1));
        pedidos.add(new Pedido(123,0,1));

    }
}