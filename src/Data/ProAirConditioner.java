package Data;

public class ProAirConditioner extends AirConditioner {

    public ProAirConditioner(double maxTemperature) {
        super(maxTemperature);
    }


    @Override
    public void conditionerOn(Room room) {
        if (room.getTemperature() > getMaxTemperature() + (2.0 / room.getRoomVolume())) {
            room.setTemperature(room.getTemperature() - 2.0 / room.getRoomVolume());
        } else {
            System.out.printf("Nie udało się obniżyć temperatury w pokoju %s, nie można przekroczyć temperatury minimalnej.\n", room.getRoomNumber());
        }

    }
}
