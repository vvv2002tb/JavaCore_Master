public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        calScore(gameOver, score, levelCompleted, bonus);
//        calScore(true, 800, 5, 100); same
        calScore(true, 10000, 8, 200);


        int result = returnScore(gameOver, score, levelCompleted, bonus);
        System.out.println(result);

    }

    public static void calScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore + " points!");
        }
    }

    public static int returnScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}
