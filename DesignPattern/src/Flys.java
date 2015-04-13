/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saurav
 */
public interface Flys {
    public String fly();
    
}
class Itflys implements Flys{

    @Override
    public String fly() {
      return "Flyimg High" ;
    }


}
class cantFly implements Flys{

    @Override
    public String fly() {
       return "Can't Fly!!!!";
    }

}
