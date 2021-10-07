class ProductionRemoteControlCar implements RemoteControlCar{
    int vict = 0;
    public void drive() {
        throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.drive() method");
    }
    public int getDistanceTravelled() {
        return 10;
    }
    public int getNumberOfVictories() {
        throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.getNumberOfVictories() method");
    }
    public void setNumberOfVictories(int numberofVictories) {
        vict = numberofVictories;
    }
}
