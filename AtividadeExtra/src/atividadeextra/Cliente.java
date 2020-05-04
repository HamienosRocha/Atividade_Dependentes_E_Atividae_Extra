package atividadeextra;

import java.util.ArrayList;

public class Cliente extends Pessoa {
    
    private int codigo;
    private double limiteCredito;
    private double limiteDisponivel;
    private ArrayList<Pedido> pedidos;

    public Cliente(int codigo, String nome, String endereco, double limCred, double limDisp) {
        super(nome, endereco);
        this.pedidos = new ArrayList<>();
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.limiteCredito = limCred;
        this.limiteDisponivel = limDisp;
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

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    
}
