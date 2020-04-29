package pl.gda.wsb;

public class Footballer extends Person {
    private String club;
    private Position position;
    private int numberOfGoals;

    public Footballer(String name, String surname, String dateOfBirth, String club, Position position) {
        super(name, surname, dateOfBirth);
        this.club = club;
        this.position = position;
    }

    public void scoreAGoal() {
        numberOfGoals += 1;
        System.out.println(club + " (" + getSurname() + ") scores!");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Footballer's club: " + club + ", position: " + position + "." + "\n" +
                "Number of goals: " + numberOfGoals;
    }
}

