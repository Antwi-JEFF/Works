package Lucky;
import java.util.Scanner;

public class Lucky_Number {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int random_number = (int) (Math.random() * 10);
        personID PersonID = new personID();


        System.out.println("First Number: ");
        int person1 = input.nextInt();
        PersonID.setPerson1(person1);


        System.out.println("Second Number: ");
        int person2 = input.nextInt();
        PersonID.setPerson2(person2);


        System.out.println("Third Number: ");
        int person3 = input.nextInt();
        PersonID.setPerson3(person3);


        System.out.println("Fourth Number: ");
        int person4 = input.nextInt();
        PersonID.setPerson4(person4);


        System.out.println("Fifth Number: ");
        int person5 = input.nextInt();
        PersonID.setPerson5(person5);


        System.out.println("----------------------------");
        System.out.println("\tPREPARE FOR A ROUND\t");
        System.out.println("----------------------------");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(random_number);

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (random_number == person1) {
            System.out.println("FIRST NUMBER WON");

        } else if (random_number == person2) {

            System.out.println("SECOND NUMBER WON");
        } else if (random_number == person3) {

            System.out.println("THIRD NUMBER WON");
        } else if (random_number == person4) {

            System.out.println("FOURTH NUMBER WON");
        } else if (random_number == person5) {

            System.out.println("FIFTH NUMBER WON");
        } else {
            System.out.println("ALL LOST");
        }
    }
}

