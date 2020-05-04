package atividadeextra;

public abstract class Pessoa {
    
    protected String nome;
    protected String endereco;
    
    // não usei este construtor  -----
    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
    
    public String getNome(){
        return nome;
    }
}
