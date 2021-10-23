class ResistorColorDuo {

    int getValue(String color){
        switch (color){
            case "black": return 0;
            case "brown": return 1;
            case "red": return 2;
            case "orange": return 3;
            case "yellow": return 4;
            case "green": return 5;
            case "blue": return 6;
            case "violet": return 7;
            case "grey": return 8;
            case "white": return 9;
            default: return 0;
        }
    }

    int value(String[] colors) {
        int sum = 0;
        if(colors.length == 1){
            sum = getValue(colors[0]);
            return sum;
        }
        else{
            int inc = 0;
            for (String s : colors){
                sum += getValue(s);
                inc++;
                if (inc == 2) {
                    return sum;
                }
                sum = sum * 10;
            }
        }
        return sum;
    }
}
