public class Clima {

    private Room room1;

    public Room getRoom1() {

        return room1;
    }

    public void setRoom1(Room room1) {
        this.room1 = room1;
    }

    public double climaCoold() {
        if (room1.howMeters * room1.height >= 15 && room1.howMeters * room1.height < 20) {
            room1.temperature = room1.temperature - 1;
            return -1;
        } else if (room1.howMeters * room1.height >= 20 && room1.howMeters * room1.height < 25) {
            room1.temperature = room1.temperature - 0.8;
            return -0.8;
        } else if (room1.howMeters * room1.height >= 25 && room1.howMeters * room1.height < 30) {
            room1.temperature = room1.temperature - 0.5;
            return -0.5;
        }
        return 0;
    }

}

