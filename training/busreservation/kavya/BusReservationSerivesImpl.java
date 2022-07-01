package training.busreservation.kavya;

import java.util.ArrayList;
import java.util.HashMap;

public class BusReservationSerivesImpl extends  BusReservationSerives{

    @Override
    public void addBus(String busno) {
        reservationDataBase.put(busno,new HashMap<>(30));
    }

    @Override
    public void removeBus(String busno) {
       reservationDataBase.remove(busno);
    }

    @Override
    public void reserveBus(String busno, int seatno,User user) {
        reservationDataBase.get(busno).put(seatno,user);
    }

    @Override
    public void cancelBus(String busno, int seatno) {
        reservationDataBase.get(busno).remove(seatno);
    }
}
