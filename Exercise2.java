public class Exercise2 {
    public static void main(String[] args) {
        int num1 = 14;
        int num2 = 15;

        // Before Swapping
        System.out.println("The value of num1 before swapping: " + num1);
        System.out.println("The value of num2 before swapping: " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        // After Swapping
        System.out.println("The value of num1 after swapping: " + num1);
        System.out.println("The value of num2 after swapping: " + num2);

    }
}
