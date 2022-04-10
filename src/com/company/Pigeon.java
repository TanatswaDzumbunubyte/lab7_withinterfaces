package com.company;

public abstract class Pigeon extends Bird implements AnimalMoveDzumbunu56874,AnimalBehaviourDzumbunu56874{
    private String SpeciesofBirdDzumbunu56874;

    Pigeon(){
        super();
        SpeciesofBirdDzumbunu56874="NN";
    }

    public Pigeon(String NameDzumbunu56874, int AgeDzumbunu56874, int WeightDzumbunu56874, String ColourofFeathers, String SpeciesofBirdDzumbunu56874){
        super(NameDzumbunu56874, AgeDzumbunu56874, WeightDzumbunu56874,ColourofFeathers);
        this.SpeciesofBirdDzumbunu56874= SpeciesofBirdDzumbunu56874;
    }

    public Pigeon(int AgeDzumbunu56874, String ColourofFeathersDzumbunu56874, String SpeciesofBirdDzumbunu){
        super(AgeDzumbunu56874, ColourofFeathersDzumbunu56874);
        this.SpeciesofBirdDzumbunu56874=SpeciesofBirdDzumbunu;
    }

    public void action1(){
        System.out.println("The Pigeon is pecking wood");
    }

    @Override
    public void sleepDzumbunu56874()
    {
        System.out.println("zzzz");

    }

    @Override
    public void moveDzumbunu56874()
    {
        System.out.println("Pigeon is flying");
    }

    @Override
    public void getVoiceDzumbunu56874() {
        System.out.println("The Pigeon is chirping");
    }

    @Override
    public void eatingDzumbunu56874(String FoodName) {
        System.out.println("The Pigeon is eating: "+ FoodName);
    }

    public String getSpeciesofBirdDzumbunu56874() {
        return SpeciesofBirdDzumbunu56874;
    }

    public void setSpeciesofBirdDzumbunu56874(String SpeciesofBirdDzumbunu56874) {
        this.SpeciesofBirdDzumbunu56874 = SpeciesofBirdDzumbunu56874;
    }

    @Override
    public void sleepDzumbunu56874()
    {
        System.out.println("zzzz");
    }

    @Override
    public void moveDzumbunu56874()
    {
        System.out.println("The pigeon is flying");
    }
    @Override
    public String toString() {
        return
                "Pigeon{" + "SpeciesofBirdDzumbunu56874='" + SpeciesofBirdDzumbunu56874 + '\'' +
                '}';
    }
}