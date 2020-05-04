package atividade_dependente;

public class Atividade_Dependente {

    public static void main(String[] args) {
        
        // intâncias
        Funcionario funcionario_1 = new Funcionario();
        Funcionario funcionario_2 = new Funcionario();
        
        Dependente dependente_1 = new Dependente();
        Dependente dependente_2 = new Dependente();
        Dependente dependente_3 = new Dependente();
        
        dependente_1.Dependente("Marcos", "05/03/2003", "123");
        dependente_2.Dependente("Maria", "07/01/2005", "456");
        dependente_3.Dependente("Rita", "27/09/2002", "789");
        
        funcionario_1.Funcionario("Ricardo", "21/04/1980", "001");
        funcionario_1.adicionarDependente(dependente_1);
        
        funcionario_2.Funcionario("Fernanda", "22/06/1985", "002");
        funcionario_2.adicionarDependente(dependente_2);
        funcionario_2.adicionarDependente(dependente_3);
        
        // exibição
        System.out.println("Nome: " + funcionario_1.getNome()
                +"\nId: " + funcionario_1.getId()
                +"\nNascimento: "+ funcionario_1.getNascimento());
        System.out.println("***Dependente(s)****");
        for(int i = 0; i < funcionario_1.quantidadeDependentes(); i++){
            
            System.out.println("Nome: " + funcionario_1.listarDependentes(i).getNome()
                +"\nId: " + funcionario_1.listarDependentes(i).getId()
                +"\nNascimento: "+ funcionario_1.listarDependentes(i).getNascimento());
            }
        
        System.out.println("\nNome: " + funcionario_2.getNome()
                +"\nId: " + funcionario_2.getId()
                +"\nNascimento: "+ funcionario_2.getNascimento());
        System.out.println("***Dependente(s)****");
        for(int i = 0; i < funcionario_2.quantidadeDependentes(); i++){
            
            System.out.println("Nome: " + funcionario_2.listarDependentes(i).getNome()
                +"\nId: " + funcionario_2.listarDependentes(i).getId()
                +"\nNascimento: "+ funcionario_2.listarDependentes(i).getNascimento());
            }
        
 
    }
    
}
