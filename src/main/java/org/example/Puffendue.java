package org.example;

public class Puffendue extends Hogwards
{
    private int trud;
    private int vera;
    private int chestnost;

    public Puffendue(int powerKoldov, int powTransgress)
    {
        super(powerKoldov, powTransgress);
    }

    public Puffendue(int powerKoldov, int powTransgress, int trud, int vera, int chestnost) {
        super(powerKoldov, powTransgress);
        this.trud = trud;
        this.vera = vera;
        this.chestnost = chestnost;
    }


    public int getTrud()
    {
        return trud;
    }

    public void setTrud(int trud)
    {
        this.trud = trud;
    }

    public int getVera()
    {
        return vera;
    }

    public void setVera(int vera)
    {
        this.vera = vera;
    }

    public int getChestnost()
    {
        return chestnost;
    }

    public void setChestnost(int chestnost)
    {
        this.chestnost = chestnost;
    }
}
