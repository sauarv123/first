/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saurav
 */
public class AnimalPlay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();
        System.out.println("Hi i am a dog" + " " + "I" + " " + dog.getSound());
        System.out.println("Hi i am a bird" + " " + "I" + " " + bird.getSound());
        
        System.out.println("After creating interface");
        
        
        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.trytoFly());

        System.out.println("Bird: " + tweety.trytoFly());

	        // This allows dynamic changes for flyingType
        sparky.setFlyingAbility(new Itflys());

        System.out.println("Dog: " + sparky.trytoFly());

    }

}
