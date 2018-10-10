/*
Gary Wu
Alex Hinding
 */
import java.util.*; //Imports all classes
public class SciCalculator {
    public static void main(String[] args) {
        double CurrentResult = 0; //Creates variable
        double firstDouble = 0;
        double secondDouble = 0;
        double sum = 0;
        int counter = 0;
        int menuNum = 1;
        Scanner myScanner = new Scanner(System.in); //Creates Scanner
        while (menuNum != 0) {
            if (menuNum > 0 && menuNum < 7) {
                System.out.println("Current Result: " + CurrentResult);
                System.out.println("");
                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
                System.out.println("");
                //Creates Menu
            }
            do {
                System.out.print("Enter Menu Selection: ");
                menuNum = myScanner.nextInt(); // Takes in an operation integer
                if (menuNum == 7 && counter == 0) {
                    System.out.println("");
                    System.out.println("Error: No calculations yet to average!");
                    System.out.println("");
                }
            } while (menuNum == 7 && counter == 0); //Only executes once and only if menuNum=7 and counter=0 after that
            if (menuNum > 0 && menuNum < 7) {
                System.out.print("Enter first operand: ");
                firstDouble = myScanner.nextDouble(); //Saves user input into firstDouble
                System.out.print("Enter second operand: ");
                secondDouble = myScanner.nextDouble(); //Saves user input into secondDouble
                System.out.println("");
            }
            switch (menuNum) { //Sets switch statement for each menuNum input
                case 0:
                    System.out.print("Thanks for using this calculator. Goodbye!");
                    break;
                case 1:
                    CurrentResult = firstDouble + secondDouble;
                    sum += CurrentResult;
                    counter += 1;
                    break;
                case 2:
                    CurrentResult = firstDouble - secondDouble;
                    sum += CurrentResult;
                    counter += 1;
                    break;
                case 3:
                    CurrentResult = firstDouble * secondDouble;
                    sum += CurrentResult;
                    counter += 1;
                    break;
                case 4:
                    CurrentResult = firstDouble / secondDouble;
                    sum += CurrentResult;
                    counter += 1;
                    break;
                case 5:
                    CurrentResult = Math.pow(firstDouble, secondDouble);
                    sum += CurrentResult;
                    counter += 1;
                    break;
                case 6:
                    CurrentResult = Math.log(secondDouble) / Math.log(firstDouble);
                    sum += CurrentResult;
                    counter += 1;
                    break;
                case 7:
                    System.out.println("Sum of calculations: " + sum);
                    System.out.println("Number of calculations: " + counter);
                    System.out.print("Average of calculations: ");
                    double average = sum / counter;
                    System.out.printf("%.2f", average);
                    break;
                default:
                    System.out.println("Error: Invalid selection!");
            }
        }
    }
}

