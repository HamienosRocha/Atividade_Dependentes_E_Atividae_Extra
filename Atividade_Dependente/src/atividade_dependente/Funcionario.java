package atividade_dependente;

import java.util.ArrayList;

public class Funcionario extends Pessoa {

    private ArrayList<Dependente> dependentes;
 
    public void Funcionario(String nome, String nascimento, String id){
        this.dependentes = new ArrayList<>();
        this.nome = nome;
        this.nascimento = nascimento;
        this.id = id;
    }
    
    public void adicionarDependente(Dependente dependente){
        dependentes.add(dependente);
    }
    
    public void removerDependente(Dependente dependente){
        dependentes.remove(dependente);
    }
    
    public int quantidadeDependentes(){
        return dependentes.size();
    }
  
    public Dependente listarDependentes(int posicao){
        return dependentes.get(posicao);
    }
    
}
