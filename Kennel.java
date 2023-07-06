import java.util.*;
public class Kennel {
    String Name1;
    String Name2;
    Double Weight1;
    Double Weight2;
    Double Average;
    private Dog[] dogs = new Dog[2];
    public Kennel() {
        for(int i = 0; i < 2; i++){
            dogs[i] = new Dog();
        }
    }
    public void addDogs() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of dog: ");
        Name1 = scan.next();
        System.out.println("Enter weight of dog: ");
        Weight1 = scan.nextDouble();
        System.out.println("Enter name of dog: ");
        Name2 = scan.next();
        System.out.println("Enter weight of dog: ");
        Weight2 = scan.nextDouble();
        dogs[0].setName(Name1);
        dogs[0].setWeight(Weight1);
        dogs[1].setName(Name2);
        dogs[1].setWeight(Weight2);
        Average = (dogs[0].toKgs() + dogs[1].toKgs()) / 2;
    }
    public void printDogs() {
        System.out.println(dogs[0].toString());
        System.out.println(dogs[1].toString());
        System.out.println("Average weight in kgs: " + Average);
        }

    public static void main(String[] args) {
        Kennel app = new Kennel();
        app.addDogs();
        app.printDogs();
    }
}
