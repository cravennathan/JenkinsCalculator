import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the calculator!");
        while(true) {
            System.out.println("Enter a command:");
            String command = scanner.nextLine();
            String commandArr[] = command.split(" ");
            if (commandArr.length < 1) {
                continue;
            }
            String functionName = commandArr[0];
            switch (functionName.toLowerCase()) {
                case "exit":
                    return;
                case "add":
                    if (commandArr.length < 3) {
                        System.out.println("must have two arguments.");
                        continue;
                    }
                    int arg1 = Integer.parseInt(commandArr[1]);
                    int arg2 = Integer.parseInt(commandArr[2]);
                    System.out.println(calc.add(arg1, arg2));
                    break;
                case "subtract":
                    if (commandArr.length < 3) {
                        System.out.println("must have two arguments.");
                        continue;
                    }
                    int arg1 = Integer.parseInt(commandArr[1]);
                    int arg2 = Integer.parseInt(commandArr[2]);
                    System.out.println(calc.subtract(arg1, arg2));
                    break;
                case "multiply":
                    if (commandArr.length < 3) {
                        System.out.println("must have two arguments.");
                        continue;
                    }
                    int arg1 = Integer.parseInt(commandArr[1]);
                    int arg2 = Integer.parseInt(commandArr[2]);
                    System.out.println(calc.multiply(arg1, arg2));
                    break;
                case "divide":
                    if (commandArr.length < 3) {
                        System.out.println("must have two arguments.");
                        continue;
                    }
                    int arg1 = Integer.parseInt(commandArr[1]);
                    int arg2 = Integer.parseInt(commandArr[2]);
                    System.out.println(calc.divide(arg1, arg2));
                    break;
                case "fibonnacci":
                    if (commandArr.length < 2) {
                        System.out.println("must have one argument.");
                        continue;
                    }
                    int arg1 = Integer.parseInt(commandArr[1]);
                    System.out.println(calc.fibonacciNumberFinder(arg1));
                    break;
                case "binary":
                    if (commandArr.length < 2) {
                        System.out.println("must have one argument.");
                        continue;
                    }
                    int arg1 = Integer.parseInt(commandArr[1]);
                    System.out.println(calc.intToBinaryNumber(arg1));
                    break;
            }
        }

    }
}