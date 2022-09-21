// This is a very basic Calculator
import java.util.Scanner;

public class calulator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter two numbers : \n");
        float num1 = s.nextFloat();
        float num2 = s.nextFloat();
        System.out.println('\n');

        System.out.println("Please select an operation as per the option below:\n" +
                "Select 1 for ADDITION\n" +
                "Select 2 for SUBTRACTION\n" +
                "Select 3 for MULTIPLICATION\n" +
                "Select 4 for DIVISION\n");

        int choice = s.nextInt();
        System.out.println('\n');

        switch (choice) {
            case 1: addition add = new addition(num1, num2);
                System.out.println("Addition of " + num1 + " and " + num2 +
                        " is: " + add.addNum());
                break;

            case 2: subtraction sub = new subtraction(num1, num2);
                System.out.println("Subtraction of " + num1 + " and " + num2 +
                        " is: " + sub.subNum());
                break;

            case 3: multiplication mul = new multiplication(num1, num2);
                System.out.println("Multiplication of " + num1 + " and " + num2 +
                        " is: " + mul.mulNum());
                break;

            case 4: division div = new division(num1, num2);
                System.out.println("Division of " + num1 + " and " + num2 +
                        " is: " + div.divNum());
                break;

            default:
                System.out.println("Please enter a valid choice...");
        }
    }
}

class numbers {
    protected float num1;
    protected float num2;
    public numbers(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float getNum1() {
        return num1;
    }

    public float getNum2() {
        return num2;
    }
}

class subtraction extends numbers {
    public subtraction(float num1, float num2) {
        super(num1, num2);
    }
    public float subNum() {
        return getNum1() - getNum2();
    }
}

class multiplication extends numbers {
    public multiplication(float num1, float num2) {
        super(num1, num2);
    }
    public float mulNum() {
        return getNum1() * getNum2();
    }
}

class division extends numbers {
    public division(float num1, float num2) {
        super(num1, num2);
    }
    public float divNum() {
        return getNum1() / getNum2();
    }
}

class addition extends numbers {
    public addition(float num1, float num2) {
        super(num1, num2);
    }
    public float addNum() {
        return getNum1() + getNum2();
    }
}
