public abstract class Predator {

    private String color;
    private int weight;

    public Predator(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public abstract void sleeping();

    public abstract void hunting();

}

