package Lab_22;

import java.util.Scanner;
import java.util.Stack;

public class RPNCalculator {
    public static double evaluateRPN(String[] tokens) {
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                if (stack.size() < 2) {
                    System.out.println("Невозможно выполнить операцию " + token + ". Недостаточно операндов ");
                    return Double.NaN;
                }

                double operand2 = stack.pop();
                double operand1 = stack.pop();

                if (token.equals("/") && operand2 == 0) {
                    System.out.println("На ноль делить нельзя");
                    return Double.NaN;
                }

                double result = performOperation(token, operand1, operand2);
                stack.push(result);
            }
        }

        if (stack.size() == 1) {
            return stack.pop();
        } else {
            System.out.println("Неверное количество операндов");
            return Double.NaN;
        }
    }

    private static boolean isNumeric(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static double performOperation(String operator, double operand1, double operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            default:
                System.out.println("Неверно введен оператор: " + operator);
                return Double.NaN; // Возвращаем NaN в случае ошибки
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите выражение: ");
            String expression = scanner.nextLine();

            if (expression.equalsIgnoreCase("e")) {
                System.out.println("Программа завершена.");
                break;
            }

            String[] rpnExpression = expression.split("\\s+");

            double result = evaluateRPN(rpnExpression);
            if (!Double.isNaN(result)) {
                System.out.println("Результат выражения: " + result);
            }
        }
    }
}
