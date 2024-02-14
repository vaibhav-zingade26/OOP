package org.OOP_Concepts.inheritence;

public class Animal {
    private String weight;
    private String type;
    private String home;

    public Animal(String weight, String type, String home) {
        this.weight = weight;
        this.type = type;
        this.home=home;
    }

    public void eat(){
        System.out.println("From animal class");
    }
    public String getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }
}
