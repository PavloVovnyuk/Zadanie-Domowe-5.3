public class Room {
    double howMeters;
    double temperature;
    double height;
    boolean isClima;

    public Room() {
    }

    public Room(double howMeters, double temperature, boolean isClima, double height) {
        this.howMeters = howMeters;
        this.temperature = temperature;
        this.isClima = isClima;
        this.height = height;
    }

    boolean minusTemperature() {
        double minTemp = 18;
        if (isClima == true) {
            if (temperature > minTemp) {
                temperature = temperature - 1;
                return true;
            } else {
                return false;
            }
        } else {
            return false;

        }
    }


}