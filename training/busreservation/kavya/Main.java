package training.busreservation.kavya;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Admin saba=new Admin();
        List<String> busList=new ArrayList<>();
        busList.add("30");
        busList.add("32");
        busList.add("Ebe34");
        BusReservationSerives service=new BusReservationSerivesImpl();
        saba.setBuslist(busList);
        service.addBus(saba.getBuslist().get(0));
        saba.getBuslist().remove(0);
        User srujana=new User();
        srujana.setName("kadali srujana");
        srujana.setAge(25);
        srujana.setAadharno(123456789L);
        srujana.setGender('F');
        service.reserveBus("30",1,srujana);
       service.printReport();
    }
}
