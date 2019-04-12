public class Coin {

    private final int HEADS = 0;
    private final int TAILS = 1;

    private int face;

    public Coin()
    {

    }

    public void flip()
    {
        face = (int)(Math.random()* 2);
    }

    //Returns true if the current face of the coin is heads
    public boolean isHeads()
    {
        return (face == HEADS);
    }

    public String toString()
    {
        String facename;

        if (face == HEADS)
            facename = "Heads";
        else
            facename = "Tails";

        return facename;
    }


}
