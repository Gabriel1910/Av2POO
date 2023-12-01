package br.com.av2;

public class PedidoItem {
    public String nomeItem;
    public int qtdItem;
    public double precoItem;

    public PedidoItem(String nomeItem, int qtdItem, double precoItem) {
        this.nomeItem = nomeItem;
        this.qtdItem = qtdItem;
        this.precoItem = precoItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }


}