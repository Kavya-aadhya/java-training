package training.busreservation.kavya;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User{
    private List<String> buslist=new ArrayList<>();

    public List<String> getBuslist() {
        return buslist;
    }

    public void setBuslist(List<String> buslist) {
        this.buslist = buslist;
    }
}
