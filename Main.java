public class Main {
    public static void main(String[] args) {
        Course round1 = new Course(110, 2);
        Team player1 = new Team ("Player1", 100, 2);
        Team player2 = new Team ("Player2", 120, 3);
        Team player3 = new Team ("Player3", 90, 1);
        Team player4 = new Team ("Player4", 130, 2);
        int distance = round1.getDistance();
        int height = round1.getHeight();
        player1.setDistance(distance);
        player1.setHeight(height);
        player2.setDistance(distance);
        player2.setHeight(height);
        player3.setDistance(distance);
        player3.setHeight(height);
        player4.setDistance(distance);
        player4.setHeight(height);
        TryCourse[] rocket = {player1, player2, player3, player4};
        for (TryCourse player : rocket) {
            System.out.println(player);
            System.out.println(player.resultRun());
            System.out.println(player.resultJump());
        }
    }
}
