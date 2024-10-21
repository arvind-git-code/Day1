import java.util.Scanner;

public class ArrayMatchingGame {

    public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "cherry", "date", "elderberry"};
        String[] array2 = {"grape", "honeydew", "kiwi", "lemon", "mango"};

        playGame(array1, array2);
    }

    private static void playGame(String[] array1, String[] array2) {
        Scanner scanner = new Scanner(System.in);

        int currentElementIndex = 0;
        boolean gameWon = false;

        while (!gameWon && currentElementIndex < array1.length) {
            System.out.println("Current element: " + array1[currentElementIndex]);
            System.out.print("Enter your guess: ");
            String guess = scanner.nextLine();

            if (guess.equals(array2[currentElementIndex])) {
                currentElementIndex++;
                System.out.println("Correct! Moving to the next element.");
            } else {
                System.out.println("Incorrect. Try again.");
            }

            if (currentElementIndex == array1.length) {
                gameWon = true;
                System.out.println("Congratulations! You've won the game.");
            }
        }

        scanner.close();
    }
}