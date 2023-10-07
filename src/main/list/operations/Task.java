package main.list.operations;

public class Task {
    private String description;

    /* Construtor que recebe uma description e cria um objeto task */
    public Task(String description){
        this.description = description;
    }

    /* Getter para description */
    public String getDescription(){
        return description;
    }

    /* Template para imprimir objeto Task com sua description no lugar de um endereço de memória */
    @Override
    public String toString(){
        return "Tarefa{" +
                "Descrição = '" + description + "\'" +
                '}';
    }
}
