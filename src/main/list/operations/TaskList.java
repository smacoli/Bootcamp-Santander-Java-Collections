package main.list.operations;
import java.util.List;
import java.util.ArrayList;

public class TaskList {
    /* Atributo List (com generics), no qual os elementos são tasks e o nome da lista é myTasks */
    private List<Task> myTasks;

    /* Construtor que cria um objeto do tipo TaskList com ArrayList vazio para o atributo myTasks*/
    public TaskList(){
        this.myTasks = new ArrayList<>();
    }

    /*
    * Task é um elemento dentro da lista myTasks;
    * Método addTask adiciona uma tarefa (elemento) no ArrayList myTasks;
    * Uma Task é instanciada (new Task) e a Task precisa receber uma description, que é passada como parâmetro;
    */
    public void addTask(String description){
        myTasks.add(new Task(description));
    }

    /*
    * Método removeTask recebe removeAll com a finalidade de remover n elementos com a mesma descrição,
    * pois podem haver mais de um elemento com a mesma;
    * Ele percorre a lista procurrando por elementos que possuem a mesma descrição passada como parâmetro para remover todas;
    */
    public void removeTask(String description){

        /* Cria uma lista vazia para adicionar as tarefas que possuem a description a serem removidas */
        List<Task> tasksToRemove = new ArrayList<>();

        /* Percorre a lista myTasks pegando cada um de seus elementos (Task) */
        for (Task t : myTasks){

            /*
            * Se a description da Task dentro de myTask for igual a description passada para ser removida,
            * adiciona o elemento Task na lista de tarefas a serem removidas
            */
            if (t.getDescription().equalsIgnoreCase(description)){
                tasksToRemove.add(t);
            }
        }

        /* Remove toda a lista de tarefas a serem removidas (que possuem mesma description); */
        myTasks.removeAll(tasksToRemove);
    }

    /* Método obtainTotalNumberOfTasks retorna um inteiro com o tamanho de myTasks; */
    public int obtainTotalNumberOfTasks(){
        return myTasks.size();
    }

    /* Método obtainDescriptionsOfTasks retorna as descrições das Tasks; */
    public void obtainDescriptionsOfTasks(){
        System.out.println(myTasks);
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        taskList.addTask("Tarefa 1");
        taskList.addTask("Tarefa 2");
        taskList.addTask("Tarefa 3");
        taskList.addTask("Tarefa 4");
        taskList.addTask("Tarefa 5");
        taskList.addTask("Tarefa 7");
        taskList.addTask("Tarefa 7");

        System.out.println("Numero total de elementos da lista: " + taskList.obtainTotalNumberOfTasks());

        taskList.removeTask("Tarefa 1");

        System.out.println("Numero total de elementos da lista apos remocao: " + taskList.obtainTotalNumberOfTasks());

        System.out.println("Obtendo descrições: ");

        taskList.obtainDescriptionsOfTasks();

    }
}
