package softserve.academy;

import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static Envelope envelopeA = new Envelope();
    private static Envelope envelopeB = new Envelope();

    public static void main(String[] args) {
        String userAnswer;
        do {
            askForSide1EnvelopA();
            askForSide2EnvelopA();
            askForSide1EnvelopB();
            askForSide2EnvelopB();

            switch (envelopeA.compareTo(envelopeB)) {
                case 1:
                    System.out.println("Envelope B can be put into envelope A");
                    break;
                case -1:
                    System.out.println("Envelope A can be put into envelope B");
                    break;
                case 0:
                    System.out.println("Envelopes cannot be put into each other");
                    break;
            }
            System.out.println("Do you want to continue? (y/n or yes/no): ");
            userAnswer = scanner.nextLine();
        }
        while (userAnswer.compareToIgnoreCase("y") == 0 || userAnswer.compareToIgnoreCase("yes") == 0);
    }

    private static void askForSide2EnvelopB() {
        do {
            System.out.println("side2: ");
            try {
                envelopeB.setSide2(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Not a number. Try again!");
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        } while (envelopeB.getSide2() <= 0);
    }

    private static void askForSide1EnvelopB() {
        do {
            System.out.println("Envelope B params:");
            System.out.println("side1: ");
            try {
                envelopeB.setSide1(scanner.nextLine());
            } catch (NumberFormatException ex) {
                showErrorMessage();
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        } while (envelopeB.getSide1() <= 0);
    }

    private static void askForSide2EnvelopA() {
        do {
            System.out.println("side2: ");
            try {
                envelopeA.setSide2(scanner.nextLine());
            } catch (NumberFormatException ex) {
                showErrorMessage();
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        } while (envelopeA.getSide2() <= 0);
    }

    private static void askForSide1EnvelopA() {
        do {
            System.out.println("Envelope A params:");
            System.out.println("side1: ");
            try {
                envelopeA.setSide1(scanner.nextLine());
            } catch (NumberFormatException ex) {
                showErrorMessage();
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        } while (envelopeA.getSide1() <= 0);
    }

    private static void showErrorMessage() {
        System.out.println("Wrong argument. Try again!");
    }
}
