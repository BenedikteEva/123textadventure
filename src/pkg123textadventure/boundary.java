/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123textadventure;

import java.util.Scanner;

/**
 *
 * @author Zack
 */
public class boundary {
        
    Player player1 = new Player();
    Room rum = new Room();
    Scanner userInput = new Scanner(System.in);
    int roomChoice;
    public void introduction(){
        String name;
        
        System.out.println("Velkommen spillet");
        System.out.println("Hvad hedder du ");
        name = userInput.nextLine();
        
        player1.setName(name);
    }    
    
    // choose room
    
    public void chooseRoom(){
        Scanner rumA = new Scanner(System.in);
        
        System.out.println("Hvilke vej vil du gå");
        System.out.println("Tast 1 for Nord");
        System.out.println("Tast 2 for Vest");
        System.out.println("Tast 3 for Syd");
        System.out.println("Tast 4 for Øst");
        
        roomChoice = rumA.nextInt();
        
        switch (roomChoice) {
            case 1:
                // call room 1
              
                break;
            case 2:
                // call room 2
               
                break;
     
        }
        
    }

    // rum1
 
    
   
}
