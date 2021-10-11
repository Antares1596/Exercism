class DifferenceOfSquaresCalculator {
    int computeSquareOfSumTo(int input) {
        int sum = 0;
            for(int i = 1 ; i <= input; i++){
                sum += i;
            }
        return sum*sum;
    }
    int computeSumOfSquaresTo(int input) {
        int square = 0;
        for(int i = 0; i<= input;i++){
            square = square + (i * i);
        }
        return square;
    }
    int computeDifferenceOfSquares(int input) {
        int sum1 = computeSquareOfSumTo(input);
        int sum2 = computeSumOfSquaresTo(input);
        return sum1 - sum2;
    }
}
