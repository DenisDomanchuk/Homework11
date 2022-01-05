import java.util.Objects;

public class Cat extends Predator {
    private String name;
    private String species;

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public Cat(String color, int weight, String species, String name) {
        super(color, weight);
        this.species = species;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cat)) {
            return false;
        }

        Cat cat = (Cat) o;

        return Objects.equals(this.getSpecies(), cat.getSpecies());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSpecies());
    }

    public void sleeping() {
        System.out.println("Hrrrrrr");
    }

    public void hunting() {
        System.out.println("I want to kill you!");
    }

    public void tigidik() {
        System.out.println("Time to destroy your house");
    }

    public void lickEggs() {
        System.out.println("Don't look if you not 18+");
    }

    public void doThisDay(DayOfWeek doThisDay) {
        switch (doThisDay) {
            case MONDAY, WEDNESDAY, FRIDAY -> sleeping();
            case TUESDAY, THURSDAY, SATURDAY -> hunting();
            case SUNDAY -> tigidik();
            default -> lickEggs();
        }
    }

}
