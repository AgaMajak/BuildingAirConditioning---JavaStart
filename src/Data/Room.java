package Data;

public class Room {
    private double temperature;
    private String roomNumber;
    private double roomVolume;
    private AirConditioner airConditioner;

    public Room(double temperature, String roomNumber, double roomVolume, AirConditioner airConditioner) {
        this.temperature = temperature;
        this.roomNumber = roomNumber;
        this.roomVolume = roomVolume;
        this.airConditioner = airConditioner;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public double getRoomVolume() {
        return roomVolume;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    @Override
    public String toString() {
        return String.format("Pokój numer: %s. Aktualna temperatura: %.1f", roomNumber, temperature);
    }
}
