/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonjournom;
import aleatoire.*;

/**
 *
 * @author megab
 */
public class BonjourNom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(Integer.parseInt(args[2]));
        // TODO code application logic here
        Person john = new Person("John", "Doe", 35);
        
        System.out.println("Bonjour");
        System.out.println(john.getFirstName());
        System.out.println(john.getLastName());
        System.out.println(john.getAge());
                
    }
    
}
