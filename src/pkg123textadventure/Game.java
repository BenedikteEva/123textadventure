/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123textadventure;

/**
 *
 * @author Zack
 */
public class Game {
    public void go(){
        Room r1 = new Room("rum1");
        Room r2 = new Room("rum2");
        Room r3 = new Room("rum3");
        Room r4 = new Room("rum4");
        Room r5 = new Room("rum5");
        Room r6 = new Room("rum6");
        Room r7 = new Room("rum7");
        Room r8 = new Room("rum8");
        Room r9 = new Room("rum9");
        Room r10 = new Room("rum10");
        Room r11 = new Room("rum11");
        Room r12 = new Room("rum12");
        Room r13 = new Room("rum13");
        Room r14 = new Room("rum14");
        Room r15 = new Room("rum15");
        Room r16 = new Room("rum16");
        
           
        
        r1.setNorth(r2);
        r2.setSouth(r1);
    }
}
