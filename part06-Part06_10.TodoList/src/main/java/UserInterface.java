import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList,Scanner scanner){
        this.scanner = scanner;
        this.todoList =todoList;
    }

    public void start(){
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if(input.equals("add")){
                System.out.print("To add: ");
                String add = scanner.nextLine();
                todoList.add(add);
            }
            else if(input.equals("list")){
                todoList.print();
            }
            else if(input.equals("remove")){
                System.out.print("Which one is removed? ");
                int remove = scanner.nextInt();
                scanner.nextLine();
                todoList.remove(remove);
            }
            else if(input.equals("stop")){
                break;
            }
        }
    }



}
