class RotationalCipher {
    int rot = 0;
    RotationalCipher(int shiftKey) {
        rot = shiftKey;
    }

    String rotate(String data) {
        //char temp = 'a';
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < data.length() ; i++){

            char c = data.charAt(i);
            if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                int a = c + rot;
                if(c >= 'a' && c <= 'z'){
                    if(a >= 123){
                        a = 96 + (a - 122);
                        char temp = (char) a;
                        sb.append(temp);
                    }
                    else{
                        char temp = (char) (c + rot);
                        sb.append(temp);
                    }
                }
                else if(c >= 'A' && c <= 'Z'){
                    if(a >= 91){
                        a = 64 + (a - 90);
                        char temp = (char) a;
                        sb.append(temp);
                    }
                    else{
                        char temp = (char) (c + rot);
                        sb.append(temp);
                    }
                }
            }
            else {
                sb.append(c);
            }

        }
        return sb.toString();
    }

}
