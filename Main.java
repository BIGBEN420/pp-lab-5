import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Bartek", 20);
            System.out.println("Imię: " + person.getName());
            System.out.println("Wiek: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        int a = 5;
        int b = 6;
        int suma = MathUtils.add(a,b);
        
        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("Test sumy: "+suma);
    }
}
