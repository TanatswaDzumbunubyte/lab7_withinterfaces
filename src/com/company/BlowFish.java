package com.company;

public abstract class BlowFish extends Fish {
    private int DiameterDzumbunu56874;

    BlowFish() {
        super(weightDzumbunu56874);
        DiameterDzumbunu56874 = 8;
    }

    public BlowFish(String NameDzumbunu56874, int AgeDzumbunu56874, int WeightDzumbunu56874, String ColourDzumbunu56874, int DiameterDzumbunu56874) {
        super(NameDzumbunu56874, AgeDzumbunu56874, WeightDzumbunu56874, ColourDzumbunu56874);
        this.DiameterDzumbunu56874 = DiameterDzumbunu56874;

    }

    public BlowFish(int AgeDzumbunu56874, String ColourDzumbunu56874, int DiameterDzumbunu56874) {
        super(AgeDzumbunu56874, ColourDzumbunu56874);
        this.DiameterDzumbunu56874 = DiameterDzumbunu56874;
    }

    public void actionDzumbunu56874() {
        System.out.println("The BlowFish is swimming");
    }


    @Override
    public void eatDzumbunu56874(String FoodName) {
        System.out.println("The BlowFish is eating: " + FoodName);
    }

    @Override
    public void getVoiceDzumbunu56874() {
        System.out.println("The blowfish is quiet");
    }

    public int getDiameterDzumbunu56874() {
        return DiameterDzumbunu56874;
    }

    public void setDiameterDzumbunu56874(int DiameterDzumbunu56874) {
        this.DiameterDzumbunu56874 = DiameterDzumbunu56874;
    }

    @Override
    public String toString() {
        return

                "BlowFish{" + "Diameter=" + DiameterDzumbunu56874 +
                        '}';
    }

}

