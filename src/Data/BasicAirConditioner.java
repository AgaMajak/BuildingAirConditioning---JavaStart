package Data;

public class BasicAirConditioner extends AirConditioner {

    public BasicAirConditioner(double maxTemperature) {
        super(maxTemperature);
    }

    @Override
    public double lowerTemperature(double temperature, double volume, String number) {
        if (temperature > getMaxTemperature() + (1.0 / volume)) {
            return temperature - 1.0 / volume;
        } else {
            System.out.printf("Nie udało się obniżyć temperatury w pokoju %s, nie można przekroczyć temperatury minimalnej.\n", number);
            return temperature;
        }
    }
}
