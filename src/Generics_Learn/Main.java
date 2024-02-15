package Generics_Learn;

record BaseballPlayer(String name, String position) {
}

public class Main {
    public static void main(String[] args) {
        BaseballTeam vietnam = new BaseballTeam("Vietnam Team");
        BaseballTeam japan = new BaseballTeam("Japan Team");
        scoreResult(vietnam, 6, japan , 5);

        var harper = new BaseballPlayer("B Harper", "ST");
        var marsh = new BaseballPlayer("C Marsh", "CB");

        vietnam.addTeamMember(harper);
        vietnam.addTeamMember(marsh);
        vietnam.listTeamMember();

    }

    private static void scoreResult(BaseballTeam team1, int t1_score,
                                    BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
