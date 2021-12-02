public class Robot {
    static String charset = "ABCDEFGHHJKLMNOPQRSTUVWXYZ0123456789";
    private String name = "";

    public Robot(){
        generatename();
    }
    void generatename(){
        for (int i = 0; i<2;i++){
            int randnum = (int) (Math.random() * 26);
            name += charset.charAt(randnum);
        }
        for (int i = 0; i < 3;i++){
            int randnum = 26 +  (int) (Math.random() * (35 - 26) + 1);
            name += charset.charAt(randnum);
        }
    }
    void reset(){
        name = "";
        generatename();
    }
    //implement map to check for collisions
    String getName(){
        return name;
    }
}
