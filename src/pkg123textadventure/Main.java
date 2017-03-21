/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123textadventure;

import java.util.Scanner;



/**
 *
 * @author Ejer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
   boolean playGame;
        boundary b = new boundary();
        Game g = new Game();
       
        b.introduction();
        b.chooseRoomStart();
         if (b.roomChoice==1) {
             playGame=true;
              while (playGame=true){
            g.go();
          }  
         }
         if (b.roomChoice==0) {
             playGame=false; 
             while (playGame= false){
        System.exit(0);

         }
         
         
        
        
}
        
        
    }
    
}
