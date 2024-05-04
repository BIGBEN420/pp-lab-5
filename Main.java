import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
public class test {
    public static void main(String[] args) {
        try {
            Person person = new Person("Bartek", 20);
            System.out.println("Imię: " + person.getName());
            System.out.println("Wiek: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("Test");
    }
}
