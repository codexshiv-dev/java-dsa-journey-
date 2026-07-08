package basics;

public class OutputFormattingDemo {

    public static void main(String[] args) {

        String name = "Shiv";
        int age = 20;
        double cgpa = 8.76;

        System.out.printf("Name : %s%n", name);
        System.out.printf("Age : %d%n", age);
        System.out.printf("CGPA : %.2f%n", cgpa);

    }
}