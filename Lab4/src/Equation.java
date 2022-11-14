import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Format funkcji: \n a*x^2 + b*x + c\n Please, write a:");
        float a = scanner.nextFloat();
        System.out.println("Please, write b");
        float b = scanner.nextFloat();
        System.out.println("Please, write c");
        float c = scanner.nextFloat();
        if(a == 0) {
            calculateRoot(b,c);
        } else {
            calculateRoot(a,b,c);
        }

    }

    public static void calculateRoot(float a, float b, float c) {
        System.out.println(String.format("%f*x^2 + %f*x + %f",a,b,c));
        float discriminant = b*b - 4*a*c;
        if(discriminant > 0){
            System.out.println("First root: " + (-b + Math.sqrt(discriminant))/(2*a));
            System.out.println("Second root: " + (-b - Math.sqrt(discriminant))/(2*a));
        }else{
            if(discriminant == 0){
                System.out.println(-b/(2*a));
            }else {
                System.out.println("There arent any roots");
            }
        }

    }

    public static void calculateRoot(float a, float b) {
        System.out.println(String.format("%f*x + %f",a,b));
        System.out.println("x = " + (-b/a));
    }


}
