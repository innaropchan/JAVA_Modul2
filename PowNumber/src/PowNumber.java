public class PowNumber {
    public static void main(String[] args) {
        System.out.println(powNumber(5, 3));
        System.out.println(pow(3, 3));
    }

    public static int powNumber(int number, int pow) {
        while (pow != 1) {
            return powNumber(number, --pow) * number;
        }
        return number * 1;
    }

    public static int pow(int value, int powValue) {
        int result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;
        }
        return result;
    }
}
