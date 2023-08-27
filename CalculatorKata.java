import java.util.Scanner;

public class CalculatorKata {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        String result = calc(expression);
        System.out.println(result);
    }

    public static String calc(String input) throws Exception {

        String[] subExpression = input.split(" ");

        if (subExpression.length != 3) {
                throw new Exception("Неверный формат1");
        }

        int a = Integer.parseInt(subExpression[0]);
        int b = Integer.parseInt(subExpression[2]);
        String symbol = subExpression[1];

        if (a < 1 || b > 10) {
            throw new Exception("Неверный формат2");
        }

        int result = switch (symbol) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "/" -> a / b;
            case "*" -> a * b;
            default -> throw new Exception("Неверный формат3"); // эту часть переделала IDEA (она была длиннее).
        };

        return String.valueOf(result);
    }
}





