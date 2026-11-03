public class Add {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: Please provide two numbers as arguments.");
            System.exit(1);
        }
        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            double sum = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Error: Both arguments must be valid numbers.");
            System.exit(1);
        }
    }
}
