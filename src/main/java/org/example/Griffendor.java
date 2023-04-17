package org.example;

public class Griffendor extends Hogwards
{

    private int blago;
    private int chest;
    private int hrabrost;

    public Griffendor(int powerKoldov, int powTransgress)
    {
        super(powerKoldov, powTransgress);
    }

    public Griffendor(int powerKoldov, int powTransgress, int blago, int chest, int hrabrost) {
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
}
