class NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class
    int speed;
    int batteryDrain;
    int batteryRem = 100;
    int distance = 0;
    public NeedForSpeed(int speed, int batteryDrain){
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }
    public boolean batteryDrained() {
        if(batteryRem <= 0)
            return true;
        else
            return false;
    }
    public int distanceDriven() {
        return distance;
    }
    public void drive() {
        if(batteryRem!=0){
            distance+= speed;
           // System.out.println("HELLLLLLLLLOXXXXX");
            batteryRem = batteryRem - batteryDrain;
        }
    }
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}
class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class
    int distance;
    public RaceTrack(int distance){
        this.distance = distance;
    }
    public boolean carCanFinish(NeedForSpeed car) {
        double total = (double)distance/car.speed;
        double bat = total * car.batteryDrain;
        if(bat > 100.00)
            return false;
        else
            return true;
    }
}
