package atividadeextra;

import java.util.ArrayList;

public class Vendedor extends Pessoa{
    
    private int regFunc;
    private double taxaComissao;
    private ArrayList<Pedido> pedidos;


    public Vendedor(int regFunc, String nome, String endereco){
        super(nome, endereco);
        this.pedidos = new ArrayList<>();
        this.regFunc = regFunc;
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public void adicionarPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    
    public void removerPedido(Pedido pedido){
        pedidos.remove(pedido);
    }
    
    public int quantidadePedidos(){
        return pedidos.size();
    }
    
    public Pedido listarPedidos(int posicao){
        return pedidos.get(posicao);
    }
    
     public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

}
