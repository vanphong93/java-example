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
        String idRoom = Room.inputIdRoom();
        Room room = getRoomById(idRoom);
        if (room == null) {
            room = new Room();
            room.setId(idRoom);
            room.input();
            this.rooms.add(room);
        } else {
            Util.decoExit();
            System.out.println("Ma lop da su dung");
        }
        return room;
    }

    public void addStu(String idRoom, Student data) {
        Room room = getRoomById(idRoom);
        if (room != null) {
            room.addStu(data);
        }
    }

    public Room updateRoom(String id) {
        Room room = getRoomById(id);
        if (room != null) {
            room.inputUpdate();
        }
        return room;
    }

    public void outputRoom() {
        System.out.println("-----Ket Qua------");
        for (Room item : rooms) {
            System.out.println(item);
        }
Util.decoExit();
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

    }

    public void averageScoreRoomLess() {
      if (rooms.size() > 0) {
        for (Room item : rooms) {
            if (item.scoreCount()) {
                System.out.println(item);
            }
        }
      } else {
        Util.decoExit();
        System.out.println("Hien khong co lop hoc");
      }
    }
}
