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
  
      public void go() {

        boolean  boo1, boo2, boo3, boo4, boo5, boo6, boo7, boo8, boo9, boo10, boo11, boo12, boo13, boo14, boo15, boo16;
      
        while (boo1 = true) { 
            b.chooseRoomIngame();
            if (b.roomChoiceIngame == 1) {
                r2.toString();
                System.out.println("Du står nu i rum:   " + r2);
                boo2 = true;
                break;

            }
            if (b.roomChoiceIngame == 2) {
                r16.toString();
                System.out.println("Du står nu i rum:   " + r16);
                b.chooseRoomIngame();
                boo16 = true;
                break;
            }
            if (b.roomChoiceIngame == 3) {
                r3.toString();
                System.out.println("Du står nu i rum:   " + r3);
                boo3 = true;
                break;
            }
            if (b.roomChoiceIngame == 4) {
                System.out.println("No door in that direction");
                boo1 = true;
                break;
            }
        }

        while (boo2 = true) {
           
         b.chooseRoomIngame();  
            if (b.roomChoiceIngame == 1) {
                r6.toString();
                System.out.println("Du står nu i rum:   " + r6);
                boo6 = true;
                break;
            }
            if (b.roomChoiceIngame == 2) {
                r4.toString();
                System.out.println("Du står nu i rum:   " + r4);
                boo4 = true;
                break;
            }
            if (b.roomChoiceIngame == 3) {
                r1.toString();
                System.out.println("Du står nu i rum:   " + r1);
                boo1 = true;
                break;
            }
            if (b.roomChoiceIngame == 4) {
                System.out.println("Du står nu i rum:   " + r7);
                boo7 = true;
                break;

            }
        }
 
            while (boo3=true) {
                b.chooseRoomIngame();
                if (b.roomChoiceIngame == 1) {
                    r7.toString();
                    System.out.println("Du står nu i rum:   " + r7);
                    boo6 = true;
                    break;
                }

                if (b.roomChoiceIngame == 2) {
                    r1.toString();
                    System.out.println("Du står nu i rum:   " + r1);
                    boo1 = true;
                    break;
                }
                if (b.roomChoiceIngame == 3) {
                    System.out.println("No door in that direction");
                    boo3 = true;
                    break;
                }
                if (b.roomChoiceIngame == 4) {
                    r5.toString();
                    System.out.println("Du står nu i rum:   " + r5);
                    boo5 = true;
                    break;
                }
            }
    
            while (boo4 = true) {
          b.chooseRoomIngame();
                if (b.roomChoiceIngame == 1) {
                    r8.toString();
                    System.out.println("Du står nu i rum:   " + r8);
                    boo8 = true;
                    break;
                }
                if (b.roomChoiceIngame == 2) {
                    System.out.println("No door in that direction");
                    boo4 = true;
                    break;
                }
                if (b.roomChoiceIngame == 3) {
                    r16.toString();
                    System.out.println("Du står nu i rum:   " + r16);
                    boo16 = true;
                    break;
                }
                if (b.roomChoiceIngame == 4) {
                    r2.toString();
                    System.out.println("Du står nu i rum:   " + r2);
                    boo2=true; 
                    return <boo2>;
                  
                   
                }
                
            }
 
            while (boo5 = true) {
                b.chooseRoomIngame();
                if (b.roomChoiceIngame == 1) {
                    r9.toString();
                    System.out.println("Du står nu i rum:   " + r9);
                    boo9 = true;
                    break;
                }
                if (b.roomChoiceIngame == 2) {
                    r3.toString();
                    System.out.println("Du står igen i rum:   " + r3);
                    boo3 = true;
                    break;
                }
                if (b.roomChoiceIngame == 3) {
                    System.out.println("No door in that direction");
                    boo5 = true;
                    break;
                }
                if (b.roomChoiceIngame == 4) {
                    System.out.println("Du står igen i rum:   " + r11);
                    boo11 = true;
                    break;
                }
                break;
            }
          
            while (boo6 = true) {
               b.chooseRoomIngame();
                    if  (b.roomChoiceIngame==1){
                        r10.toString();
                        System.out.println("Du står nu i rum:   " + r10);
                        boo10 = true;
                        break;
                    }
                   if  (b.roomChoiceIngame==2){
                        r8.toString();
                        System.out.println("Du står nu i rum:   " + r8);
                        boo8 = true;
                        break;
                   }
                   if  (b.roomChoiceIngame==3){
                        r2.toString();
                        System.out.println("Du står nu i rum:   " + r2);
                        boo2 = true;
                        break;
                   }
                 
                    if  (b.roomChoiceIngame==4){
                        r12.toString();
                        System.out.println("Du står nu i rum:   " + r12);
                        boo12 = true;
                        break;
                }
            }
            //  "Tast 1 for Nord");
            //  ("Tast 2 for Vest");
            //"Tast 3 for Syd");
            //"Tast 4 for Øst");
            while (boo7 = true) {
                switch (b.roomChoiceIngame) {
                    case 1:
                        r10.toString();
                        System.out.println("Du står nu i rum:   " + r10);
                        boo6 = false;
                        b.chooseRoomIngame();
                        boo10 = true;
                        break;
                    case 2:
                        r8.toString();
                        System.out.println("Du står nu i rum:   " + r8);
                        boo6 = false;
                        b.chooseRoomIngame();
                        boo8 = true;
                        break;
                    case 3:
                        r2.toString();
                        System.out.println("Du står igen i rum:   " + r2);
                        boo6 = false;
                        b.chooseRoomIngame();
                        boo2 = true;
                        break;
                    case 4:
                        System.out.println("Du står nu i rum:   " + r12);
                        boo5 = false;
                        b.chooseRoomIngame();
                        boo12 = true;
                        break;
                }
            }
        }       //case 0:

    }
}
}
