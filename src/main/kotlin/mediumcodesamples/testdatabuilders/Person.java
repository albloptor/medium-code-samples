package mediumcodesamples.testdatabuilders;

public class Person {

    private String name;
    private int age;
    private double weightInKg;
    private int heightInCm;
    private int energy;

    public Person(String name, int age, double weightInKg, int heightInCm, int energy) {
        this.name = name;
        this.age = age;
        this.weightInKg = weightInKg;
        this.heightInCm = heightInCm;
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }

    public void sleep() {
        this.energy = 100;
    }
}
