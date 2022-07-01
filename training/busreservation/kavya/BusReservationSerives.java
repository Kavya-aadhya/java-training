package training.busreservation.kavya;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class BusReservationSerives {
   protected Map<String, Map<Integer,User>> reservationDataBase=new HashMap<>();
    public abstract void addBus(String busno);
    public abstract void removeBus(String busno);
    public abstract void reserveBus(String busno,int seatno,User user);
    public abstract void cancelBus(String busno,int seatno);
    public void printReport() {
        System.out.println("Total buses avaialable: "+ reservationDataBase.size());
        int totalPassengers = 0;
        for (String bus : reservationDataBase.keySet()) {
            totalPassengers = totalPassengers + reservationDataBase.get(bus).size();
            for (Integer seatNumber : reservationDataBase.get(bus).keySet()) {
                User user = reservationDataBase.get(bus).get(seatNumber);
                System.out.println("Passenager details:");
                        System.out.println("Name : " + user.getName() + " Age : " + user.getAge());
            }
        }
        System.out.println("Totalpassengers:"+totalPassengers);
    }
}
