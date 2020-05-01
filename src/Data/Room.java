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

    public void conditionerOn() {
        if (airConditioner instanceof BasicAirConditioner) {
            if (temperature > airConditioner.getMaxTemperature() + (1.0 / roomVolume)) {
                temperature -= 1.0 / roomVolume;
            } else {
                System.out.printf("Nie udało się obniżyć temperatury w pokoju %s, nie można przekroczyć temperatury minimalnej.\n", roomNumber);
            }
        } else if (airConditioner instanceof ProAirConditioner) {
            if (temperature > airConditioner.getMaxTemperature() + (2.0 / roomVolume)) {
                temperature -= 2.0 / roomVolume;
            } else {
                System.out.printf("Nie udało się obniżyć temperatury w pokoju %s, nie można przekroczyć temperatury minimalnej.\n", roomNumber);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Pokój numer: %s. Aktualna temperatura: %.1f", roomNumber, temperature);
    }
}
