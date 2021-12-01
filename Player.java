abstract class Player implements TryCourse {
    public String name;
    public int run;
    public int jump;

    Player(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    @Override
    public String toString() {
        return name + ", " + run + ", " + jump;
    }
}
