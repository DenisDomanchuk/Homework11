public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("brown", 4000, "persian", "Jerry");
        Cat cat1 = new Cat("white", 40, "bengal", "Tom");
        System.out.println("Tom.hashCode " + cat1.hashCode());
        System.out.println("Jerry.hashCode " + cat.hashCode() + "\n");

        System.out.println(cat1.getName() + ": ");
        cat1.doThisDay(DayOfWeek.ANYDAY);
        System.out.println("name: " + cat1.getName() + "\ncolor: " + cat1.getColor() + "\nweight: " + cat1.getWeight() + "g" + "\nspecies: " + cat1.getSpecies() + "\n");

        System.out.println("name: " + cat.getName() + "\ncolor: " + cat.getColor() + "\nweight: " + cat.getWeight() + "g" + "\nspecies: " + cat.getSpecies() + "\n");
        System.out.println(cat.getName() + ": ");
        cat.doThisDay(DayOfWeek.THURSDAY);

        System.out.println(cat == cat1);
        System.out.println(cat.getSpecies().hashCode());
        System.out.println(cat1.getSpecies().hashCode());

    }

}
