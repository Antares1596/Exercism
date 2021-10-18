class Darts {
    double x,y;
    Darts(double x, double y) {
        this.x = Math.abs(x);
        this.y = Math.abs(y);
    }

    int score() {
            double newx = Math.pow(x,2);
            double newy = Math.pow(y,2);
            //double radius = 100.0;
            if((newx + newy) > 100)
                return 0;
            if(((newx + newy) <= 100) && ((newx + newy) > 25))
                return 1;
            if((newx + newy) <= 25 && (newx + newy) > 1 )
                return 5;
            else
                return 10;
     }

}
