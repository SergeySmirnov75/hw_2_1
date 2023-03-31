package org.example;

public class Slizarin extends Hogwards
{
    private int hitrost;
    private int reshit;
    private int ambic;
    private int nahodch;
    private int vlast;

    public Slizarin(int powerKoldov, int powTransgress) {
        super(powerKoldov, powTransgress);
    }

    public Slizarin(int powerKoldov, int powTransgress, int hitrost, int reshit, int ambic, int nahodch, int vlast) {
        super(powerKoldov, powTransgress);
        this.hitrost = hitrost;
        this.reshit = reshit;
        this.ambic = ambic;
        this.nahodch = nahodch;
        this.vlast = vlast;
    }


    public int getHitrost()
    {
        return hitrost;
    }

    public void setHitrost(int hitrost)
    {
        this.hitrost = hitrost;
    }

    public int getReshit()
    {
        return reshit;
    }

    public void setReshit(int reshit)
    {
        this.reshit = reshit;
    }

    public int getAmbic()
    {
        return ambic;
    }

    public void setAmbic(int ambic)
    {
        this.ambic = ambic;
    }

    public int getNahodch()
    {
        return nahodch;
    }

    public void setNahodch(int nahodch)
    {
        this.nahodch = nahodch;
    }

    public int getVlast()
    {
        return vlast;
    }

    public void setVlast(int vlast)
    {
        this.vlast = vlast;
    }
}
