import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first digit");
    int a = sc.nextInt();
    System.out.println("enter the second digit");
    int b = sc.nextInt();
    System.out.println("Enter the operator");
    char op = sc.next().charAt(0);

    switch (op) {
      case '+':
        System.out.println("sum of two number :" + sum(a, b));
        break;
      case '-':
        System.out.println("sum of two number :" + sub(a, b));
        break;

      case '*':
        System.out.println("sum of two number :" + mul(a, b));
        break;
      case '/':
        if (b == 0) {
          System.out.println("The digit cannot we divided by 0");
        }
        System.out.println("sum of two number :" + div(a, b));
        break;

      default:
        System.out.println("Operator does not exist");

    }

  }
}
