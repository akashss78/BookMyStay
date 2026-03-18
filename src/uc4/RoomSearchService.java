package uc4;

import uc2.*;
import uc3.RoomInventory;
import java.util.Map;

public class RoomSearchService {

    public void searchAvailableRooms(
            RoomInventory inventory,
            Room single,
            Room doubleRoom,
            Room suite) {

        Map<String, Integer> availability = inventory.getRoomAvailability();

        System.out.println("Room Search\n");

        if (availability.get("Single") > 0) {
            System.out.println("Single Room:");
            single.displayRoomDetails();
            System.out.println("Available: " + availability.get("Single") + "\n");
        }

        if (availability.get("Double") > 0) {
            System.out.println("Double Room:");
            doubleRoom.displayRoomDetails();
            System.out.println("Available: " + availability.get("Double") + "\n");
        }

        if (availability.get("Suite") > 0) {
            System.out.println("Suite Room:");
            suite.displayRoomDetails();
            System.out.println("Available: " + availability.get("Suite"));
        }
    }
}