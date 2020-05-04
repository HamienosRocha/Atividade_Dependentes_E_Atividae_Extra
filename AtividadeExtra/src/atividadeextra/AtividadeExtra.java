
package atividadeextra;

public class AtividadeExtra {

    public static void main(String[] args) {
     
        // instâncias -------------
        Pedido pedido_1 = new Pedido(100,"21/04/2020", 10.3);
        Pedido pedido_2 = new Pedido(101,"21/04/2020", 8.5);
        Pedido pedido_3 = new Pedido(102,"21/04/2020", 6);
        Pedido pedido_4 = new Pedido(103,"21/04/2020", 17.8);
        Pedido pedido_5 = new Pedido(104,"21/04/2020", 50);
        
        Cliente cliente_1 = new Cliente(123, "John Wick", "Rua Dos Cachorros", 900, 1000);
        cliente_1.adicionarPedido(pedido_1);
        cliente_1.adicionarPedido(pedido_2);
        
        Cliente cliente_2 = new Cliente(456, "John Rambo", "Rua Esburacada", 1000, 330);
        cliente_2.adicionarPedido(pedido_3);
        cliente_2.adicionarPedido(pedido_4);
        
        Cliente cliente_3 = new Cliente(789, "Thanos", "Rua Pela Metade", 1000, 500);
        cliente_3.adicionarPedido(pedido_5);
        
        Cliente cliente_4 = new Cliente(111, "Julius Rock", "Rua Bed-Stuy, Brooklyn", 1000, 1000);
        
        Vendedor vendedor_1 = new Vendedor(2001, "Mercador do Resident Evil 4", "Onipresente");
        vendedor_1.adicionarPedido(pedido_1);
        vendedor_1.adicionarPedido(pedido_2);
        vendedor_1.adicionarPedido(pedido_3);
        vendedor_1.setTaxaComissao(0.02);
        
        Vendedor vendedor_2 = new Vendedor(2002, "Vendedor do Carro do Ovo", "Combe");
        vendedor_2.adicionarPedido(pedido_4);
        vendedor_2.adicionarPedido(pedido_5);
        vendedor_2.setTaxaComissao(0.03);
        
        
        // exibição
        System.out.println("--- Pedidos ----------");
        System.out.println("Número: "+pedido_1.getNumero()
                +"\nData: "+pedido_1.getData()
                +"\nValor: R$ "+pedido_1.getValor());
        
        System.out.println("\nNúmero: "+pedido_2.getNumero()
                +"\nData: "+pedido_2.getData()
                +"\nValor: R$ "+pedido_2.getValor());
        
        System.out.println("\nNúmero: "+pedido_3.getNumero()
                +"\nData: "+pedido_3.getData()
                +"\nValor: R$ "+pedido_3.getValor());
        
        System.out.println("\nNúmero: "+pedido_4.getNumero()
                +"\nData: "+pedido_4.getData()
                +"\nValor: R$ "+pedido_4.getValor());
        
        System.out.println("\nNúmero: "+pedido_5.getNumero()
                +"\nData: "+pedido_5.getData()
                +"\nValor: R$ "+pedido_5.getValor());
        
        System.out.println("\n--- Clientes ----------");
        System.out.println("Nome: " + cliente_1.getNome()
                +"\nEndereço: " + cliente_1.getEndereco()
                +"\nCódigo: " + cliente_1.getCodigo()
                +"\nCrédito: " + cliente_1.getLimiteCredito()
                +"\nDisponível: " + cliente_1.getLimiteDisponivel());
        System.out.println("***Seus pedidos***");
        for(int i = 0; i < cliente_1.quantidadePedidos(); i++){
            System.out.println("Número: " + cliente_1.listarPedidos(i).getNumero());
        }
        
        System.out.println("\nNome: " + cliente_2.getNome()
                +"\nEndereço: " + cliente_2.getEndereco()
                +"\nCódigo: " + cliente_2.getCodigo()
                +"\nCrédito: " + cliente_2.getLimiteCredito()
                +"\nDisponível: " + cliente_2.getLimiteDisponivel());
        System.out.println("***Seus pedidos***");
        for(int i = 0; i < cliente_2.quantidadePedidos(); i++){
            System.out.println("Número: " + cliente_2.listarPedidos(i).getNumero());
        }
        
        System.out.println("\nNome: " + cliente_3.getNome()
                +"\nEndereço: " + cliente_3.getEndereco()
                +"\nCódigo: " + cliente_3.getCodigo()
                +"\nCrédito: " + cliente_3.getLimiteCredito()
                +"\nDisponível: " + cliente_3.getLimiteDisponivel());
        System.out.println("***Seus pedidos***");
        for(int i = 0; i < cliente_3.quantidadePedidos(); i++){
            System.out.println("Número: " + cliente_3.listarPedidos(i).getNumero());
            
        System.out.println("\nNome: " + cliente_4.getNome()
                +"\nEndereço: " + cliente_4.getEndereco()
                +"\nCódigo: " + cliente_4.getCodigo()
                +"\nCrédito: " + cliente_4.getLimiteCredito()
                +"\nDisponível: " + cliente_4.getLimiteDisponivel());
        System.out.println("***Seus pedidos***");
        System.out.println("Seu eu não comprar nada, o desconto é maior");
        }
        
        System.out.println("\n--- Vendedores ----------");
        System.out.println("Nome: " + vendedor_1.getNome()
                +"\nEndereço: " + vendedor_1.getEndereco()
                +"\nTaxa de Comissão: " + vendedor_1.getTaxaComissao()+"%");
        System.out.println("***Pedidos Vendidos");
        for(int i = 0; i < vendedor_1.quantidadePedidos(); i++){
            System.out.println("Número: " + vendedor_1.listarPedidos(i).getNumero());
        }
        
        System.out.println("\nNome: " + vendedor_2.getNome()
                +"\nEndereço: " + vendedor_2.getEndereco()
                +"\nTaxa de Comissão: " + vendedor_2.getTaxaComissao()+"%");
        System.out.println("***Pedidos Vendidos");
        for(int i = 0; i < vendedor_2.quantidadePedidos(); i++){
            System.out.println("Número: " + vendedor_2.listarPedidos(i).getNumero());
        }
    }
    
}
