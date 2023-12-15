package Lab_19;

import java.util.Scanner;

public class OnlinePurchase {
    public static void main(String[] args) {
        try {
            makePurchase("Rich Noa", getInputINN());
            System.out.println("Purchase successful!");
        } catch (InvalidINNException e) {
            System.out.println("Invalid INN: " + e.getMessage());
        } catch (InvalidINNLengthException e) {
            System.out.println("Invalid INN length: " + e.getMessage());
        }
    }

    public static void makePurchase(String fullName, String inn) throws InvalidINNException, InvalidINNLengthException {
        // Проверяем действительность ИНН
        if (!isValidINN(inn)) {
            throw new InvalidINNException("Invalid characters in INN.");
        }

        // Проверяем длину ИНН
        if (inn.length() != 12) {
            throw new InvalidINNLengthException("INN must be exactly 12 digits long.");
        }

        System.out.println("Order processing for: " + fullName);
    }

    public static boolean isValidINN(String inn) {

        return inn.matches("\\d{12}");
    }

    public static String getInputINN() {
        Scanner scanner = new Scanner(System.in);
        String inputINN;

        do {
            System.out.print("Enter your INN (12 digits only): ");
            inputINN = scanner.nextLine();

            if (!inputINN.matches("\\d+")) {
                System.out.println("Invalid characters in INN. Please enter digits only.");
            } else if (inputINN.length() != 12) {
                System.out.println("Invalid INN length. Please enter exactly 12 digits.");
            }

        } while (!inputINN.matches("\\d+") || inputINN.length() != 12);

        return inputINN;
    }
}

class InvalidINNException extends Exception {
    public InvalidINNException(String message) {
        super(message);
    }
}

class InvalidINNLengthException extends Exception {
    public InvalidINNLengthException(String message) {
        super(message);
    }
}
