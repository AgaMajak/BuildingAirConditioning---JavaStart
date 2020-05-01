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
            if (temperature > airConditioner.maxTemperature) {
                temperature -= 1.0 / roomVolume;
            } else {
                System.out.println("Nie udało się obniżyć temperatury, osiągnięto temperaturę minimalną.");
            }
        } else if (airConditioner instanceof ProAirConditioner) {
            if (temperature > airConditioner.maxTemperature) {
                temperature -= 2.0 / roomVolume;
            } else {
                System.out.println("Nie udało się obniżyć temperatury, osiągnięto temperaturę minimalną.");
            }
        }
    }

    @Override
    public String toString() {
        return "Pokój numer: " + roomNumber +
                ". Aktualna temperatura: " + temperature;
    }
}
