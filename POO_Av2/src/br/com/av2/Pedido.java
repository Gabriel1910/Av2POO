package br.com.av2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    public int numPedido;
    public Date dataHoraPedido;
    public double precoTotal;
    public int statusPedido;
    public List<PedidoItem> items = new ArrayList<>();

    public Pedido (int numPedido, double precoTotal, int statusPedido) {
        this.numPedido = numPedido;
        this.dataHoraPedido = new Date();
        this.precoTotal += precoTotal;
        this.statusPedido = statusPedido;
    }
    public void alterarStatus(int status){
        this.statusPedido = status;
    }
    public boolean consultarPedido(Pedido pedido) {
        if(pedido.numPedido == this.numPedido){
            return true;
        }
        return false;
    }
    public void iserirItensPedido(PedidoItem pedidoItem) {
        items.add(new PedidoItem(pedidoItem.nomeItem, pedidoItem.qtdItem, pedidoItem.precoItem));
    }
    public void excluirItensPedido(PedidoItem pedidoItem){
        items.remove(pedidoItem);
    }
    public double calcularPedido(List<PedidoItem> saldo){
        int valorTotal = 0;
        for (PedidoItem item : saldo){
            valorTotal += item.getPrecoItem();
        }
        return this.precoTotal = valorTotal;
    }
}