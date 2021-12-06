class SpaceAge {

    private double sec;

    SpaceAge(double seconds) {
        this.sec = seconds;
    }

    double getSeconds() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onEarth() {
        return (sec/60/60)/(24*365.25);
    }

    double onMercury() {
        return ((sec/60/60)/(24*365.25))/(0.2408467);
    }

    double onVenus() {
        return ((sec/60/60)/(24*365.25))/(0.61519726);
    }

    double onMars() {
        return ((sec/60/60)/(24*365.25))/(1.8808158);
    }

    double onJupiter() {
        return ((sec/60/60)/(24*365.25))/(11.862615);
    }

    double onSaturn() {
        return ((sec/60/60)/(24*365.25))/(29.447498);
    }

    double onUranus() {
        return ((sec/60/60)/(24*365.25))/(84.016846);
    }

    double onNeptune() {
        return ((sec/60/60)/(24*365.25))/(164.79132);
    }

}
