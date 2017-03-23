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
 **/
public class Boundery {
    public void intro() {
        System.out.println(
                         ">> Welcome to Text Based Adventure Game! <<\n\n"
                        + "The objective of this game is to find your way through\n" 
                        + "the dungeon and collect as much gold as possible. \n\n"
                        + "You don't have a map and only a flaslight at your \n"
                        + "disposal to light up your quest.\n"
                        + "At any time during your quest, type help and get some options\n"
                        + "You forgot to eat so you have to finish your quest\n"
                        + "before you faint and is eaten by moths and bats \n"
                        + "and big ugly spiders and then eventually die,  \n"
                        + "which in that case you have lost. \n"
                        + "Your health is at 100% when you start and you will\n"
                        + "gradually lose your health while your walking around.\n"
                        + "because you are hungry and no food is available\n"
                        + "You have won the game when you have found the Exit\n"
                        + "and collected at least 20 goldpieces.\n\n\n\n");
        
    }
    
    public void chooseDirection () {
                
                
                
                System.out.println("Where do you wanna go");
                System.out.println("Press n for north");
                System.out.println("Press s for south");
                System.out.println("Press e for east");
                System.out.println("Press w for west");
                
               
    }
    public void helpMenu() {
                    
                  
                    
                      
                    }
}


