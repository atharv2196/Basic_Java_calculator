import java.util.Scanner;
import java.lang.Math;

class Calculator {

    private double num1, num2;
   
    public Calculator(double a, double b) {
        num1 = a;
        num2 = b;
    }

    public void displayNumbers() {
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 != 0) {
            return num1/num2;
        }
        else {
            System.out.println("Any number divided by zero is not defined");
            return Double.NaN;
            }
    }
 
 
   public void sq(){
      System.out.println("Square of num1 ="+num1+" is "+(num1*num1));
      System.out.println("Square of num2 ="+num2+" is "+(num2*num2));
   }
   public void fact(){
       System.out.println();
       double f=1;
       for(int i=0;i<num1;i++){
           f=f*(num1-i);
       }
       System.out.println("factorial of num1 ="+num1+" is "+f);
       double f1=1;
       for(int i=0;i<num2;i++){
           f1=f1*(num2-i);
       }
       System.out.println("factorial of num1 ="+num2+" is "+f1);
       
   }
    public void sqrt(){
      System.out.println("Square root of num1 ="+num1+" is "+Math.sqrt(num1)) ;
      System.out.println("Square root of num2 ="+num2+" is "+Math.sqrt(num2) );
   }
   public void log(){
      System.out.println("log to base 10 of  num1 ="+num1+" is "+Math.log10(num1)) ;
      System.out.println("log to base 10 of num2 ="+num2+" is "+Math.log10(num2) );
   }
   public void mod(){
      System.out.println("modulo of num1 ="+num1+" to num2= "+num2+" is "+num1%num2);
     
   }
   public void power(){
       System.out.println("the power of num1="+num1+" to num2= "+num2+" is "+Math.pow(num1,num2));
   }
   
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        Calculator calc = new Calculator(num1, num2);

        calc.displayNumbers();
   

        System.out.println("\nSelect the operation you want to perform:");
        System.out.println("1 for Addition");
        System.out.println("2 for Subtraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");
        System.out.println("5 for Square");
        System.out.println("6 for factorial");
        System.out.println("7 for square root");
        System.out.println("8 for log to base 10");
        System.out.println("9 for modulo");
        System.out.println("10 for power");

       System.out.println("");
        System.out.print("Enter your choice (1/2/3/4/5/6/7/8/9/10): ");
        int choice = scanner.nextInt();
       System.out.println("");
     
        switch (choice) {
            case 1:
                System.out.println(" Addition: " + calc.add());
                break;
            case 2:
                System.out.println("Subtraction: " + calc.subtract());
                break;
            case 3:
                System.out.println("Multiplication: " + calc.multiply());
                break;
            case 4:
                System.out.println("Division: " + calc.divide());
                break;
            case 5:
                calc.sq();
                break;  
            case 6:
                calc.fact();
                break;
            case 7:
                calc.sqrt();
                break;
            case 8:
                calc.log();
                break;
            case 9:
                calc.mod();
                break;
            case 10:
                calc.power();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
        }
    }
}