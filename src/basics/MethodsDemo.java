package basics;

public class MethodsDemo {

    static void greet() {

        System.out.println("Welcome to Java");

    }

    static int square(int n) {

        return n * n;

    }

    public static void main(String[] args) {

        greet();

        System.out.println(square(5));

    }
}