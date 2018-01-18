package ht3_09_01_18;

public class Cat {
    private String name = "Vasia";
    private String color = "Red";
    private float weight = 15;
    private float growth = 0.4f;
    private float length = 0.5f;
    private double forse;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getGrowth() {
        return growth;
    }

    public void setGrowth(float growth) {
        this.growth = growth;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public double getForse() {
        return forse;
    }

    public void setForse(float weight, float growth, float length) {
        this.forse = weight * 0.5 + growth * 0.4 + length * 0.1;
    }
}
