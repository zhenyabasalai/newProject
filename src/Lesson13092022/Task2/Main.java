package Lesson13092022.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("Valera", "Petrov","123132489");
        System.out.println(user);


        System.out.println("Input 1 if shallow clone, or 2 deep");
        Scanner input = new Scanner(System.in);
        byte a = input.nextByte();
        System.out.println("Input ID");
        Scanner input1 = new Scanner(System.in);
        String id = input1.nextLine();

        if (a == 1) {
            User clone;
            try {
                clone = (User) user.clone();

                clone.setId(id);
                System.out.println("After cloning: " + clone);

            } catch (CloneNotSupportedException e) {
                System.out.println("Объект не может быть клонированным.");
            }
        }
        if (a == 2) {

        }

    }
}
