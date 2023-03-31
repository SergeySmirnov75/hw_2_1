package org.example;

public class Hogwards
        {
            int powerKoldov;
            int powTransgress;

            public Hogwards(int powerKoldov, int powTransgress)
            {
                this.powerKoldov = powerKoldov;
                this.powTransgress = powTransgress;
            }

            public int getPowerKoldov()
            {
                return powerKoldov;
            }

            public void setPowerKoldov(int powerKoldov)
            {
                this.powerKoldov = powerKoldov;
            }

            public int getPowTransgress()
            {
                return powTransgress;
            }

            public void setPowTransgress(int powTransgress)
            {
                this.powTransgress = powTransgress;
            }

            @Override
            public String toString()
            {
                return "Hogwards{" + "powerKoldov=" + powerKoldov + ", powTransgress=" + powTransgress + '}';
            }
        }
