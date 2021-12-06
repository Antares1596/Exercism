import java.math.BigInteger;

class Grains {


    BigInteger grainsOnSquare(final int square) throws IllegalArgumentException {
        if (square < 1 || square > 64)
            throw new IllegalArgumentException("square must be between 1 and 64");
        BigInteger bt = new BigInteger("2");
        return (bt.pow(square - 1));
    }

    BigInteger grainsOnBoard() {
        BigInteger bt = new BigInteger("2");
        return ((bt.pow(64)).subtract(new BigInteger("1")));
    }
}
