import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PizzaOrder{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        List<Integer> integers = new ArrayList<>();//
        integers.add(1);

        while (true){
            System.out.print("What would you like to do?(close/difference/sum/multiply) ");
            String command = reader.nextLine();
            if (command.equals("close")) {
                break;//
            }

            System.out.println("Enter the numbers to operate on: ");
            int firstNumber = Integer.parseInt(reader.nextLine());
            int secondNumber = Integer.parseInt(reader.nextLine());

            if (command.equals("sum")) {
                int sum = firstNumber + secondNumber;
                System.out.println("The sum of the numbers is: " + sum);
            } else if (command.equals("difference")) {
                int difference = firstNumber - secondNumber;
                System.out.println("The difference between the two numbers is: " + difference);
            } else if (command.equals("multiply")) {
                int product = firstNumber * secondNumber;
                System.out.println("The product of the numbers is: " + product);
            } else {
                System.out.println("The given command was not valid.");
            }
        }

        System.out.println("Thanks for using this shitty calculator!");



    }
}
