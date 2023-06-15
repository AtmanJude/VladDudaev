import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.questionOne();
        main.questionTwo();
        main.questionThree();
    }

    public void questionOne() {
        System.out.println("enter a number");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int border = 7;
        if (value > border) {
            System.out.println("hello");
        }
    }

    public void questionTwo() {
        System.out.println("Enter a name");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String vyacheslav = "Vyacheslav";
        if (value.equals(vyacheslav)) {
            System.out.println("Hello, Vyacheslav");
        } else {
            System.out.println("I do not know this name");
        }
    }

    public void questionThree() {
        int[] array = {1, 2, 3, 4, 6, 9};
        System.out.println("Array elements that are multiples of three:");
        for (int element : array) {
            if (element % 3 == 0) {
                System.out.println(element);
            }
        }
    }
}