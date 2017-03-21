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
        
          
    Player player1=new Player();
    Scanner userInput = new Scanner(System.in);
    int roomChoice;
    String name;
    int roomChoiceIngame;    

   
    public void introduction(){
    
        
        System.out.println("Velkommen til spillet");
        System.out.println("Hvad hedder du? ");
        name = userInput.nextLine();
        
        player1.setName(name);
    }    
    public String name(){
        return name;
        }
    // choose room
    
    public void chooseRoomStart(){
  
        System.out.println("Hej   " + name +"   Du står nu foran indgangen ");
        System.out.println("Vil du ind i labyrinten eller tør du ikke");
        System.out.println("Tast 0 for 'tør ikke'");
        System.out.println("Tast 1 for at komme ind");
        Scanner rumA = new Scanner(System.in);
        roomChoice = rumA.nextInt();
        
         
                     
    
        }
      public void chooseRoomIngame(){
       
             Scanner rumB = new Scanner(System.in);
         
       
        System.out.println("Tast 1 for Nord");
        System.out.println("Tast 2 for Vest");
        System.out.println("Tast 3 for Syd");
        System.out.println("Tast 4 for Øst");
        
       roomChoiceIngame = rumB.nextInt();
        
       
    }
}
