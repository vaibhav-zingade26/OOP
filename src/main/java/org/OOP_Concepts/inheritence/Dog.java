package org.OOP_Concepts.inheritence;

public class Dog extends Animal{

    private String eye;
    private String breed;
    public Dog(String weight, String type, String home,String eye,String breed) {
        super(weight, type, home);
        this.breed=breed;
        this.eye=eye;
    }

    public void chew(){
        super.eat();
        System.out.println("Dog is chew his food");
    }

    public void eat(){
        super.eat();

    }
}
