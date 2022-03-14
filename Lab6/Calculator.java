import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;
    private String result;

    public Calculator() {
        Scanner scanCalc = new Scanner(System.in);
        System.out.println("Input the first number: ");
        num1 = scanCalc.nextInt();
        System.out.println("Input the operator: ");
        scanCalc.nextLine();
        operator = scanCalc.nextLine();
        while (operator.equals("+")==false && operator.equals("-")==false && operator.equals("*")==false && operator.equals("/")==false){
            System.out.println("Please enter one of the following operators: +, -, *, /");
            operator = scanCalc.nextLine();
        }
        System.out.println("Input the second number: ");
        num2 = scanCalc.nextInt();
        
        switch(operator){
            case "+":
                result = num1 + " " + operator + " " + num2 + " = " + add(num1, num2);
                break;
            case "-":
                result = num1 + " " + operator + " " + num2 + " = " + subtract(num1, num2);
                break;
            case "*":
                result = num1 + " " + operator + " " + num2 + " = " + multiply(num1, num2);
                break;
            case "/":
                result = num1 + " " + operator + " " + num2 + " = " + divide(num1, num2);
                break;
            default:
                result = "";
        }

    }

    public String add(int a, int b) {
        int sum = a + b;
        String sum1 = sum + "";
        return sum1;
    }

    public String subtract(int a, int b) {
        int difference = a - b;
        String difference1 = difference + "";
        return difference1;
    }

    public String multiply(int a, int b) {
        int product = a * b;
        String product1 = product + "";
        return product1;
    }

    public String divide(int a, int b) {
        double quotient = a / (double) b;
        String quotient1 = quotient + "";
        return quotient1;
    }
    public String toString(){
        return result;
    }
    

}
        String sum1 = sum + "";
        return sum1;
    }

    public String subtract(int a, int b) {
        int difference = a - b;
        String difference1 = difference + "";
        return difference1;
    }

    public String multiply(int a, int b) {
        int product = a * b;
        String product1 = product + "";
        return product1;
    }

    public String divide(int a, int b) {
        double quotient = a / (double) b;
        String quotient1 = quotient + "";
        return quotient1;
    }
    public String toString(){
        return result;
    }
    

}