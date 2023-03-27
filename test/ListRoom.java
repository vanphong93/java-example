package test;
import java.util.ArrayList;
import java.util.List;

public class ListRoom {
    private List<Room> rooms;
    public ListRoom() {
        this.rooms = new ArrayList();
    }
    public List<Room> getRooms() {
        return rooms;
    }
    public Room inputRoom() {
        String id = Room.inputIdRoom();
        Room st = getRoomById(id);
        if (st == null) {
            st = new Room();
            st.setId(id);
            st.input();
            this.rooms.add(st);
        }
        return st;

    }

    public Room updateRoom(String id) {
        Room st = getRoomById(id);
        if (st != null) {
            st.inputUpdate();
        }
        return st;
    }

    public void outputRoom() {
        for (Room Room : rooms) {
            System.out.println(Room);
        }
    }

    public Room getRoomById(String id) {
        for (Room Room : rooms) {
            if (Room.getId().equals(id)) {
                return Room;
            }
        }
        return null;
    }

    public void deleteRoomById(Room item) {
        this.rooms.remove(item);
    
}}
