import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sum();
        del();
        multi();
        sub();
    }

    public static void sum(){
        Scanner scannerSum = new Scanner(System.in);
        System.out.println("Введите 2 числа, которые хотите сложить");
        int firstNumber = scannerSum.nextInt();
        int secondNumber = scannerSum.nextInt();
        int result = firstNumber + secondNumber;
        System.out.println(result);
    }

    public static void del(){
        Scanner scannerDel = new Scanner(System.in);
        System.out.println("Введите 2 числа, которые хотите разделить");
        int firstNumber = scannerDel.nextInt();
        int secondNumber = scannerDel.nextInt();
        int result = firstNumber / secondNumber;
        System.out.println(result);
    }

    public static void multi(){
        Scanner scannerMulti = new Scanner(System.in);
        System.out.println("Введите 2 числа, которые хотите умножить");
        int firstNumber = scannerMulti.nextInt();
        int secondNumber = scannerMulti.nextInt();
        int result = firstNumber * secondNumber;
        System.out.println(result);
    }

    public static void sub(){
        Scanner scannerSub = new Scanner(System.in);
        System.out.println("Введите 2 числа, которые хотите вычесть");
        int firstNumber = scannerSub.nextInt();
        int secondNumber = scannerSub.nextInt();
        int result = firstNumber - secondNumber;
        System.out.println(result);
    }
}