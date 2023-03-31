package org.example;

public class Kogtevran extends Hogwards
{
    private int um;
    private int mudrost;
    private int ostroum;
    private int tverdost;

    public Kogtevran(int powerKoldov, int powTransgress)
    {
        super(powerKoldov, powTransgress);
    }

    public Kogtevran(int powerKoldov, int powTransgress, int um, int mudrost, int ostroum, int tverdost) {
        super(powerKoldov, powTransgress);
        this.um = um;
        this.mudrost = mudrost;
        this.ostroum = ostroum;
        this.tverdost = tverdost;
    }


    public int getUm()
    {
        return um;
    }

    public void setUm(int um)
    {
        this.um = um;
    }

    public int getMudrost()
    {
        return mudrost;
    }

    public void setMudrost(int mudrost)
    {
        this.mudrost = mudrost;
    }

    public int getOstroum()
    {
        return ostroum;
    }

    public void setOstroum(int ostroum)
    {
        this.ostroum = ostroum;
    }

    public int getTverdost()
    {
        return tverdost;
    }

    public void setTverdost(int tverdost)
    {
        this.tverdost = tverdost;
    }
}
