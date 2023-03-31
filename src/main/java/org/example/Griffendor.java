package org.example;

public class Griffendor extends Hogwards
{

    private int blago;
    private int chest;
    private int hrabrost;
<<<<<<< HEAD

    public Griffendor(int powerKoldov, int powTransgress)
=======
    private int size;

     public Griffendor(int powerKoldov, int powTransgress)
>>>>>>> 53538b6 (Initial commit)
    {
        super(powerKoldov, powTransgress);
    }

<<<<<<< HEAD
    public Griffendor(int powerKoldov, int powTransgress, int blago, int chest, int hrabrost) {
=======
    public Griffendor(int powerKoldov, int powTransgress, int blago, int chest, int hrabrost)
    {
>>>>>>> 53538b6 (Initial commit)
        super(powerKoldov, powTransgress);
        this.blago = blago;
        this.chest = chest;
        this.hrabrost = hrabrost;
    }


    public int getBlago()
    {
        return blago;
    }

    public void setBlago(int blago)
    {
        this.blago = blago;
    }

    public int getChest()
    {
        return chest;
    }

    public void setChest(int chest)
    {
        this.chest = chest;
    }

    public int getHrabrost()
    {
        return hrabrost;
    }

    public void setHrabrost(int hrabrost)
    {
        this.hrabrost = hrabrost;
    }
<<<<<<< HEAD
=======

    public int countChois(int powerKoldov, int powTransgress, int blago, int chest, int hrabrost)
    {
        int count = 0;
        count = powerKoldov + powTransgress + blago + chest + hrabrost;
        return count;
    }

    public boolean compCount(int countChois1, int countChois2)
    {
        boolean comp = false;
        if (countChois1 == countChois2)
            comp = true;
        return comp;
    }

>>>>>>> 53538b6 (Initial commit)
}
