import java.util.*;
import java.util.HashMap;

public class PhoneBook {
    private static HashMap<String, String> phonebook = new HashMap<String, String>();


    public PhoneBook(){}

    public void Menu(){
        Scanner in = new Scanner(System.in);

        while(true){
        System.out.println("1. Insert PhoneNumber in the list.");
        System.out.println("2. Find PhoneNumber from the list.");
        System.out.println("3. Show all the data of the list.");
        System.out.println("4. Show the length of the list.");
        System.out.println("5. Exit.");
        int choice = in.nextInt();

        if (choice == 1){
            addPhoneNumber();
        } else if (choice == 2){
            searchNumber();
        } else if (choice == 3){
            displayAllNumbers();
        } else if (choice == 4){
            System.out.println("The length of the data which are in the list are: " + phonebook.size());
        } else if(choice == 5){
            System.out.println("You exit the menu Bye!");
            break;
        } else{
            System.out.println("You entered the wrong option. Please Try again.");
        }
    }
}

    private static void addPhoneNumber(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Give First and LastName: ");
        String name = in.nextLine();
        System.out.println("Give Phone Number For " + name +":");
        String number = in.next();
        phonebook.put(name, number);
        }
        
        
    private static void searchNumber(){
        Scanner in = new Scanner(System.in);

        System.out.println("Give name to search in the list: ");
        String name = in.next();
        String number = phonebook.get(name);

        if (number == null){
            System.out.println("The name " + name + " Does not exist in the list");
        } else{
            System.out.println(number);
        }
    }


    private static void displayAllNumbers(){
        for(String name: phonebook.keySet()){
            String number = phonebook.get(name);
            System.out.println(name + ": " + number);
        }
    }
}