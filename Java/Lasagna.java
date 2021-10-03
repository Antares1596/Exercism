public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    int remainingMinutesInOven(int i){
        return 40-i;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    int preparationTimeInMinutes(int i){
        return 2*i;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    int totalTimeInMinutes(int i,int j){
        return preparationTimeInMinutes(i)+j;
    }
}
