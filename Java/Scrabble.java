class Scrabble {
    String name;
    
    Scrabble(String word) {
         name = word;
    }
    int getValue(char c){
        char ch = Character.toLowerCase(c);
        switch(ch){
            case 'a': case 'e':case 'i': case 'o':case 'u': case 'l' :case 'n': case 'r':case 's': case 't':
                return 1;
            case 'd': case 'g':
                return 2;
            case 'b': case 'c':case 'm': case 'p':
                return 3;
            case 'y': case 'w':case 'v': case 'h':case 'f':
                return 4;
            case 'k':
                return 5;
            case 'j': case 'x':
                return 8;
            case 'q': case 'z':
                return 10;
            default:
                return 0;
        }
    }
    int getScore() {
        int score = 0;
        for(int i = 0;i < name.length();i++){
            score = score + getValue(name.charAt(i));
        }
        return score;
    }
}
