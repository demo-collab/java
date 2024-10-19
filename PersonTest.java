import java.util.Scanner;

class Person {
    private String personName;
    private String aadharNo;
    private String panNo;

    public Person(String personName, String aadharNo, String panNo) {
        this.personName = personName;
        this.aadharNo = aadharNo;
        this.panNo = panNo;
    }

    public void displayInfo() {
        System.out.printf("Name: %s, Aadhar No: %s, PAN No: %s%n", personName, aadharNo, panNo);
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] persons = new Person[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Aadhar No: ");
            String aadharNo = scanner.nextLine();

            System.out.print("Enter PAN No: ");
            String panNo = scanner.nextLine();

            persons[i] = new Person(name, aadharNo, panNo);
        }

        System.out.println("\nPerson Information:");
        for (Person person : persons) {
            person.displayInfo();
        }

        scanner.close();
    }
}