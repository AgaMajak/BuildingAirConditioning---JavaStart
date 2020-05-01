import javax.crypto.spec.PSource;

public class Room {
    double temperature;
    String roomNumber;
    double roomVolume;
    AirConditioner airConditioner;

    public Room(double temperature, String roomNumber, double roomVolume, AirConditioner airConditioner) {
        this.temperature = temperature;
        this.roomNumber = roomNumber;
        this.roomVolume = roomVolume;
        this.airConditioner = airConditioner;
    }

    void conditionerOn() {
        if (airConditioner instanceof BasicAirConditioner) {
            if (temperature > airConditioner.maxTemperature+(1.0/roomVolume)){
            temperature -= 1.0 / roomVolume;
            } else {
                System.out.println("Nie udało się obniżyć temperatury, osiągnięto temperaturę minimalną.");
            }
        } else if (airConditioner instanceof ProAirConditioner) {
            if (temperature > airConditioner.maxTemperature+(2.0/roomVolume)){
                temperature -= 2.0 / roomVolume;
            } else {
                System.out.printf("Nie udało się obniżyć temperatury w pokoju %s, osiągnięto temperaturę minimalną.\n", roomNumber);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Pokój numer: %s. Aktualna temperatura: %.1f", roomNumber, temperature);
    }
}
