import java.util.Scanner;

class Add {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number");
    int a = sc.nextInt();

    System.out.println("enter the second number");
    int b = sc.nextInt();

    System.out.print("Addition of two numbers is :");
    System.out.print(a + b);
  }

}