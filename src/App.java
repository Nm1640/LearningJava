import java.util.List;
import java.util.ArrayList;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to EAT!");
        List<String> shoppingList = new ArrayList<>();

        // Set up the main loop.
        boolean running = true;
        while (running){
            System.out.println();
            System.out.println("Shoppping List:");
            System.out.println(shoppingList);
            System.out.println();
            System.out.println("options: add, remove, check out");
            
            // input what to do next:
            String dirrections = System.console().readLine("What would you like to do: ").toLowerCase();
            
            // Add Items to the list
            while (dirrections.toLowerCase().equals("add")){
                System.out.println();

                String item_name = System.console().readLine("Enter item to add or enter back: ");
                if (item_name.toLowerCase().equals("back")){
                    break;
                }
                System.out.println("Item added: " + item_name);
                shoppingList.add(item_name);
            }
            // Remove Items from the list
            while (dirrections.equals("remove")){
                System.out.println();

                String item_name = System.console().readLine("Enter item to remove or enter back: ");
                if (item_name.equals("back")){
                    break;
                }
                if (shoppingList.contains(item_name)){
                    shoppingList.remove(item_name);
                    System.out.println("Item removed: " + item_name);
                }else{
                    System.out.println(item_name + " is not in the shopping list.");
                }
            }
            if (dirrections.equals("check out")){
                break;
            }
        }
        // closing program
        System.out.println();
        System.out.println("Thank you for shoping with EAT!");
        System.out.println(shoppingList);
    }
}