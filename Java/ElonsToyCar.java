public class ElonsToyCar {
    int totaldist = 2000;
    int distanceCovered = 0;
    int battery = 100;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }
    public String distanceDisplay() {
        if(battery!=0)
            return "Driven " + String.valueOf(distanceCovered) + " meters";
        else
            return "Driven " + String.valueOf(distanceCovered) + " meters";
    }
    public String batteryDisplay() {
        if(distanceCovered == 0)
            return "Battery at 100%";
        if(battery!= 0){
            battery = battery - (distanceCovered/20);
            return "Battery at " + String.valueOf(battery)+ "%";
        }
        else {
            return "Battery empty";
        }
    }
    public void drive() {
        if(battery!=0 && distanceCovered!=2000)
            distanceCovered += 20;
        else
            battery = 0;
    }
}
