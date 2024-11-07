public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = { 10, 20, 30 };
            int result = numbers[2] / 0;
            System.out.println("The result is: " + result);
            System.out.println("The number at index 5 is: " + numbers[5]);
        } catch (ArithmeticException m) {
            System.out.println("Exception: " + m.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}