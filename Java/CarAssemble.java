public class CarsAssemble {
    public double productionRatePerHour(int speed) {
        double a = speed * 221;
          //double b = a/60;
          if(speed >= 1 && speed < 5 )
              return a;
          else if(speed >=5 && speed < 9)
              return (a * 0.9);
          else if(speed == 9)
              return (a * 0.8);
          else if(speed == 10)
              return (a * 0.77);
          else
              return 0;
    }
    public int workingItemsPerMinute(int speed) {
          int a = speed * 221;
          double b = a/60;
          if(speed >= 1 && speed < 5 )
              return (int)b;
          else if(speed >=5 && speed < 9)
              return (int)(b * 0.9);
          else if(speed == 9)
              return (int)(b * 0.8);
          else if(speed==10)
              return (int)(28);
          else
              return 0;
          
    }
}
