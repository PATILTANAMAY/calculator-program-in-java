import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("Choose an operation: for sum enter 1, for subtraction enter 2, for multiplication enter 3, for division enter 4, for modulo enter 5");
        int choice = sc.nextInt();
        
        switch(choice) {
            case 1:
                int sum = a + b;
                System.out.println("The answer is sum: " + sum);
                break;
            case 2:
                int sub = a - b;
                System.out.println("The answer is subtraction: " + sub);
                break;
            case 3:
                int multi = a * b;
                System.out.println("The answer is multiplication: " + multi);
                break;
            case 4:
                if (b != 0) {
                    int div = a / b;
                    System.out.println("The answer is division: " + div);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            case 5:
                int modulo = a % b;
                System.out.println("The answer is modulo: " + modulo);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1, 2, 3, 4, or 5.");
                break;
        }
        
        sc.close();
    }
}
