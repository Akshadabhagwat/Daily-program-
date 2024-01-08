import java.util.Scanner;

public class UserChoiceProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice:");
        System.out.println("1. Check if a given number is even or odd");
        System.out.println("2. Find out the grade (provide marks for 5 subjects)");
        System.out.println("3. Find the cube if the number is divisible by 5");
        System.out.println("4. Find the greatest among 3 numbers");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter a number:");
                int num = scanner.nextInt();
                if (num % 2 == 0) {
                    System.out.println(num + " is even.");
                } else {
                    System.out.println(num + " is odd.");
                }
                break;

            case 2:
                System.out.println("Enter marks for 5 subjects:");
                int totalMarks = 0;
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Enter marks for subject " + i + ":");
                    totalMarks += scanner.nextInt();
                }
                double averageMarks = totalMarks / 5.0;

                if (averageMarks >= 90) {
                    System.out.println("Grade: A");
                } else if (averageMarks >= 80) {
                    System.out.println("Grade: B");
                } else if (averageMarks >= 70) {
                    System.out.println("Grade: C");
                } else if (averageMarks >= 60) {
                    System.out.println("Grade: D");
                } else {
                    System.out.println("Grade: F");
                }
                break;

            case 3:
                System.out.println("Enter a number:");
                int cubeNum = scanner.nextInt();
                if (cubeNum % 5 == 0) {
                    int cube = cubeNum * cubeNum * cubeNum;
                    System.out.println("Cube of " + cubeNum + " is: " + cube);
                } else {
                    System.out.println(cubeNum + " is not divisible by 5.");
                }
                break;

            case 4:
                System.out.println("Enter three numbers:");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                int num3 = scanner.nextInt();
                int max =num1;
                if(num2>max){
                    max=num2;
                }
                if(num3>max){
                    max=num3;
                }
                System.out.println("The greatest number is: " + max);
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
