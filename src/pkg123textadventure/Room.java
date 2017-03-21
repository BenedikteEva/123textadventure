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
public class Room {
     private String roomName;
    private String roomDescription;
    private int goldAmount;
  
   
    public int getGoldAmount() {
        return goldAmount;
    }

    public void setGoldAmount(int goldAmount) {
        this.goldAmount  = goldAmount;
    }
    public void addGold (int GoldTotal) {
        GoldTotal += goldAmount;
    }

    public Room(String roomName, String roomDescription, int goldAmount) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.goldAmount = goldAmount;
        
    }

    public Room(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }
  


   @Override
    public String toString() {
        return "Room{" + "roomName=" + roomName + ", roomDescription=" + roomDescription + ", goldAmount=" + goldAmount + '}';
    }

}
