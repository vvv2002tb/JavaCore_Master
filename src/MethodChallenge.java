public class MethodChallenge {
    public static void main(String[] args) {
        int scorePlayer1 = 1500;
        int scorePlayer2 = 1000;
        int scorePlayer3 = 500;
        int scorePlayer4 = 100;
        int scorePlayer5 = 25;


        displayHighScorePosition("Tim", computeHighScorePosition(scorePlayer1));
        displayHighScorePosition("Tim", computeHighScorePosition(scorePlayer2));
        displayHighScorePosition("Tim", computeHighScorePosition(scorePlayer3));
        displayHighScorePosition("Tim", computeHighScorePosition(scorePlayer4));
        displayHighScorePosition("Tim", computeHighScorePosition(scorePlayer5));
    }

    public static void displayHighScorePosition(String namePlayer, int playerPosition) {
        System.out.println(namePlayer + " managed to get into position " + playerPosition + " on the high score list.");
    }

    public static int computeHighScorePosition(int playerScore) {
        int positionEqualScore = 4;
        if (playerScore >= 1000) {
            positionEqualScore = 1;
        } else if (playerScore >= 500) {
            positionEqualScore = 2;
        } else if (playerScore >= 100) {
            positionEqualScore = 3;
        }
        return positionEqualScore;
    }
}
