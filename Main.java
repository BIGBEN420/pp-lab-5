import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        int licznik = 1;
        Person[] people = new Person[5];
        int b = 10;
        try {
            people[0] = new Person("Jacek", 39);
            people[1] = new Person("Wojtek", 60);
            people[2] = new Person("Artur", 39);
            people[3] = new Person("Przemek", 45);
            people[4] = new Person("Tomek", 50);
                
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        for (Person o : people){
            System.out.println("Informacje o osobie "+licznik);
            System.out.println("Imie: "+o.getName());
            System.out.println("Wiek: "+o.getAge());
            int sum = MathUtils.add(o.getAge(), b);
            System.out.println("Wartość sumy wieku i b to: " + sum);
            Messenger messenger = new EmailMessenger();
            messenger.sendMessage("Wynik sumy wieku i b to: " + sum);
            System.out.println();
            licznik++;
        }
        
    }
}
