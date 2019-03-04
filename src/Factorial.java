public class Factorial {

    public int fact(int n) {
        int result;
        if (n ==1) {
            return 1;
        }

        result = fact(n - 1) * n;
        return result;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println("Factorial  5!: " +factorial.fact(5));
    }
}
