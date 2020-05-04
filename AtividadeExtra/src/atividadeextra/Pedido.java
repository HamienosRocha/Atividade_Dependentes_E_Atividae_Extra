package atividadeextra;

public class Pedido {
    
    private int numero;
    private String data;
    private double valor;
    
    public Pedido(int numero, String data, double valor){
        this.numero = numero;
        this.data = data;
        this.valor = valor;
    }
    
    public int getNumero() {
        return numero;
    }

    public String getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }
}
