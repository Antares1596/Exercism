public class Twofer {
    public String twofer(String name) {
        String fname = "One for ";
        String lastname = ", one for me.";
        if(name == null)
            return fname + "you" + lastname;
        return fname + name + lastname;
    }
}
