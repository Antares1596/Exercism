import java.util.Arrays;
import java.util.Stack;

public class BaseConverter {
    private int base1;
    private int [] data;

    public BaseConverter(int base, int [] data) throws IllegalArgumentException{
        if (base < 2)
            throw new IllegalArgumentException("Bases must be at least 2.");
        for (int i: data){
            if (i < 0)
                throw new IllegalArgumentException("Digits may not be negative.");
            if (i >= base)
                throw new IllegalArgumentException("All digits must be strictly less than the base.");

        }
        this.base1 = base;
        this.data = data;
    }

    int [] convertToBase(int base ) throws IllegalArgumentException{
        for (int i: data){
            if (base < 2)
                throw new IllegalArgumentException("Bases must be at least 2.");
        }
        int power = data.length -1;
        int value = 0;

        for (int i = 0; i < data.length;i++ ){
            value = data[i]*(int)(Math.pow(base1,power)) + value;
            power--;
        }

        System.out.println(value);
        Stack<Integer> stack = new Stack<>();
        int temp = value;
        int temp2 = value;
        if (base == 10){
            System.out.println("inside 1");
            if (temp < base){
                int b[] = {value};
                System.out.println(Arrays.toString(b));
                return (b);
            }
            while(temp >= base){
                temp  = temp % base;
                stack.push(temp);
            }
            stack.push(temp2/base);
            int [] b = new int[stack.size()];
            int index = 0;
            while (!stack.isEmpty()){
                b[index] = stack.pop();
                index++;
            }
            System.out.println(Arrays.toString(b));
            return b;
        }
        int [] b = toBase(value,base);
        System.out.println(Arrays.toString(b));
        return b;
    }

    int [] toBase(int a,int base){
        Stack<Integer> stack = new Stack<>();
        int temp =  a;
        int temp2 = a;
        System.out.println(temp+" "+base);
        while(temp2 >= base){
            temp  = temp2 % base;
            temp2 = temp2/base;
            stack.push(temp);
//            System.out.println("temp is "+temp);
//            System.out.println("temp 2 is " +temp2);
        }
        System.out.println("temp is "+temp);
        System.out.println("temp 2 is " +temp2);
        stack.push(temp2);
        int [] b = new int[stack.size()];
        int index = 0;
        while (!stack.isEmpty()){
            b[index] = stack.pop();
            index++;
        }
//        System.out.println(Arrays.toString(b));
        return b;
    }

    public static void main(String[] args) {
        int [] a = {5};
        BaseConverter baseConverter = new BaseConverter(10,a);
        // System.out.println(a.length);
        int [] b = baseConverter.convertToBase(2);

    }
}
