class RaindropConverter {
    String convert(int number) {
        String final1 = "";
        if(number%3 == 0 || number%5==0 || number%7==0){
            if(number%3==0){
                final1 = "Pling";
            }
            if(number%5==0)
                final1 = final1 + "Plang";
            if(number%7==0)
                final1 = final1 + "Plong";
            return final1;
        }
        else
            return String.valueOf(number);
    }
}
