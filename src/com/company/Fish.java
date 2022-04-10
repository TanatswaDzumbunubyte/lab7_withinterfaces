package com.company;

public abstract class Fish extends Animal implements AnimalBehaviourDzumbunu56874, AnimalMoveDzumbunu56874{

    private String ColourDzumbunu56874;

    public Fish() {
        super();
        ColourDzumbunu56874 = "NN";
    }
    public Fish(String nameDzumbunu56874, int ageDzumbunu56874, int weightDzumbunu56874, String ColourDzumbunu56874)
    {
        super(ageDzumbunu56874);
        this.ColourDzumbunu56874=ColourDzumbunu56874;

    }

    public Fish( int AgeDzumbunu56874, String colourDzumbunu56874)
    {
        super(AgeDzumbunu56874);
        this.ColourDzumbunu56874=colourDzumbunu56874;


    }

    public void actionDzumbunu56874()
    {
        System.out.println("Gulping Gulping");
    }
    @Override
    public void getVoiceDzumbunu56874()
    {
        System.out.println("The fish is quiet");

    }

    public void eatingDzumbunu56874(String FoodName)
    {
        System.out.println("The fish is eating" +FoodName);
    }
    public String ColourDzumbunu56874()
    {
        return ColourDzumbunu56874;
    }
    public void setColourDzumbunu56874(String ColourDzumbunu56874)
    {
        this.ColourDzumbunu56874=ColourDzumbunu56874;
    }

    @Override
    public void sleepDzumbunu56874()
    {
        System.out.println("zzzz");
    }

    @Override
    public void moveDzumbunu56874()
    {
        System.out.println("The fish is swimming");
    }

    public String toStringDzumbunu56874()
    {
        return
                "Fish"+"ColourDzumbunu56874'" + ColourDzumbunu56874;
    }
}
