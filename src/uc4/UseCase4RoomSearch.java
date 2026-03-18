package uc4;

import uc2.*;
import uc3.RoomInventory;

public class UseCase4RoomSearch {

    public static void main(String[] args) {

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        RoomInventory inventory = new RoomInventory();

        RoomSearchService service = new RoomSearchService();

        service.searchAvailableRooms(
                inventory,
                single,
                doubleRoom,
                suite
        );
    }
}