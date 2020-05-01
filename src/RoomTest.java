import Data.AirConditioner;
import Data.BasicAirConditioner;
import Data.ProAirConditioner;
import Data.Room;

public class RoomTest {
    public static void main(String[] args) {
        AirConditioner airConditionerBasic = new BasicAirConditioner(22.0);
        AirConditioner airConditionerPro = new ProAirConditioner(18.0);

        Room[] rooms = {
                new Room(22.5, "202A", 5.0, airConditionerBasic),
                new Room(25, "15", 10, airConditionerPro),
                new Room(19.0, "311", 20, airConditionerPro)
        };

        for (Room room : rooms) {
            System.out.println(room);
        }

        System.out.println();

        for (int i = 0; i < 3; i++) {
            rooms[0].conditionerOn();
        }

        for (int i = 0; i < 3; i++) {
            rooms[1].conditionerOn();
        }

        for (int i = 0; i < 3; i++) {
            rooms[2].conditionerOn();
        }

        System.out.println();

        for (Room room : rooms) {
            System.out.println(room);
        }

    }
}
