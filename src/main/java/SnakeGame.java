import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SnakeGame {
    private static final int BOARD_WIDTH = 20;
    private static final int BOARD_HEIGHT = 15;

    private char[][] board;
    private List<int[]> snake;
    private int[] food;

    public SnakeGame() {
        board = new char[BOARD_HEIGHT][BOARD_WIDTH];
        snake = new ArrayList<>();
        snake.add(new int[]{BOARD_HEIGHT / 2, BOARD_WIDTH / 2});
        generateFood();
    }

    private void generateFood() {
        Random rand = new Random();
        food = new int[]{rand.nextInt(BOARD_HEIGHT), rand.nextInt(BOARD_WIDTH)};
    }

    private boolean isCollision() {
        // Check for self-collision
        for (int i = 1; i < snake.size(); i++) {
            if (snake.get(0)[0] == snake.get(i)[0] && snake.get(0)[1] == snake.get(i)[1]) {
                return true;
            }
        }

        // Check for boundary collision
        if (snake.get(0)[0] < 0 || snake.get(0)[0] >= BOARD_HEIGHT ||
                snake.get(0)[1] < 0 || snake.get(0)[1] >= BOARD_WIDTH) {
            return true;
        }

        return false;
    }

    private void move(int direction) {
        int[] head = snake.get(0);
        int newX = head[0];
        int newY = head[1];

        switch (direction) {
            case 1: // Up
                newX--;
                break;
            case 2: // Down
                newX++;
                break;
            case 3: // Left
                newY--;
                break;
            case 4: // Right
                newY++;
                break;
        }

        if (isCollision()) {
            // Game over
        }

        snake.add(0, new int[]{newX, newY});

        if (snake.get(0)[0] == food[0] && snake.get(0)[1] == food[1]) {
            generateFood();
        } else {
            snake.remove(snake.size() - 1);
        }
    }

    // ... (rest of the game loop, rendering, input handling)
}