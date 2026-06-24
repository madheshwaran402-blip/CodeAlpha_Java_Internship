import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms = new ArrayList<>();

    public Hotel() {

        rooms.add(new Room(101, "Standard"));
        rooms.add(new Room(102, "Standard"));

        rooms.add(new Room(201, "Deluxe"));
        rooms.add(new Room(202, "Deluxe"));

        rooms.add(new Room(301, "Suite"));
    }

    public void displayRooms() {

        System.out.println("\nAvailable Rooms:");

        for(Room room : rooms) {

            if(!room.isBooked()) {

                System.out.println(
                        "Room " +
                                room.getRoomNumber() +
                                " - " +
                                room.getCategory());
            }
        }
    }

    public void bookRoom(int roomNumber) {

        for(Room room : rooms) {

            if(room.getRoomNumber() == roomNumber &&
                    !room.isBooked()) {

                room.bookRoom();

                System.out.println(
                        "Booking Successful!");
                return;
            }
        }

        System.out.println(
                "Room not available.");
    }

    public void cancelRoom(int roomNumber) {

        for(Room room : rooms) {

            if(room.getRoomNumber() == roomNumber &&
                    room.isBooked()) {

                room.cancelBooking();

                System.out.println(
                        "Booking Cancelled!");
                return;
            }
        }

        System.out.println(
                "No booking found.");
    }
}