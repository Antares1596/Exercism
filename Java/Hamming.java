public class Hamming {
    String left, right;
    public Hamming(String leftStrand, String rightStrand) throws IllegalArgumentException {
        left = leftStrand;
        right = rightStrand;
        
        if(left.isEmpty() && right.length() > 0){
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        else if(left.length() > 0 && right.isEmpty()){
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        else if(left.length() != right.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
            
    }
    public int getHammingDistance() throws IllegalArgumentException {
        int count = 0;
        if(left.length() == 0 && right.length() == 0)
            return count;
        if(left.length() == right.length())
        {
            for(int i = 0; i < left.length(); i++)
            {
                if(left.charAt(i) != right.charAt(i))
                    count += 1;
            }
            return count; 
        }
        else
            throw new IllegalArgumentException("hahaha");
    }
}
