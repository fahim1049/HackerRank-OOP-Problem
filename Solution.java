import java.util.Scanner;

abstract class Calculator {
    abstract int add(int a, int b);
}

class Adder extends Calculator {
    @Override
    int add(int a, int b) {
        return a + b;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Adder adder = new Adder();


        int num1 = scanner.nextInt();


        int num2 = scanner.nextInt();


        int sum = adder.add(num1, num2);

        System.out.println(sum);

        scanner.close();
    }
}