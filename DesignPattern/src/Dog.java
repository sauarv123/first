/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saurav
 */
public class Dog extends Animal {

    public void dighole() {

        System.out.println("Dug a hole");

    }

    public Dog() {

        super();
        setSound("Bark");
        flyingType = new cantFly();
    }

}
