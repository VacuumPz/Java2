public class Team extends Player {
    Team(String name, int run, int jump) {
        super(name, run, jump);
    }

    private int distance;
    private int height;

    public void setDistance(int distance) {
        this.distance = distance;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String resultJump() {
        if (jump >= height) return "Участник " + name + " прыгнул на высоту " + height + " метров.";
        else return "Участник " + name + " не смог прыгнуть на высоту " + height + " метров.";
    }
    @Override
    public String resultRun() {
        if (run >= distance) return "Участник " + name + " пробежал " + distance + " метров.";
        else return "Участник " + name + " не смог пробежать " + distance + " метров.";
    }

}



