import java.util.Stack;
class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        int number  = numberToCheck;
        int temp = number;
        int inc = 0;
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            stack.push(number%10);
            inc = inc + 1;
            number = number / 10;
        }
        System.out.println("inc is " +inc);
        while (!stack.isEmpty()){
            sum = sum + (int) (Math.pow(stack.pop(),inc));
        }
        System.out.println("sum is " + sum);
        if(temp == sum){
            System.out.println("true ");
            return true;

        }
        else{
            System.out.println("false ");
            return false;
        }
    }

}
