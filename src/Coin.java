public class Coin implements Comparable<Coin>{
    private int denomination;

    public Coin(int denomination) {
        this.denomination = denomination;
    }

    public int getDenomination() {
        return denomination;
    }

    @Override
    public int compareTo(Coin c) {
        return c.denomination > this.denomination ? 1 : -1;
    }
}