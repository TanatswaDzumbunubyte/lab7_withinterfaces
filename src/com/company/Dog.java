package com.company;

public abstract class Dog extends Mammal implements AnimalMoveDzumbunu56874{
    private String dogbreedDzumbunu56874;

    Dog(){
        super();
        dogbreedDzumbunu56874= "NN";
    }

    public Dog(String NameDzumbunu56874 , int AgeDzumbunu56874,int WeightDzumbunu56874,String ColourDzumbunu56874, String dogbreedDzumbunu56874)
    {
        super(NameDzumbunu56874,AgeDzumbunu56874,WeightDzumbunu56874,ColourDzumbunu56874, WeightDzumbunu56874);
        this.dogbreedDzumbunu56874=dogbreedDzumbunu56874;
    }

   // public Dog(int AgeDzumbunu56874, String ColourDzumbunu56874,int weightDzumbunu56874, String dogbreedDzumbunu56874){
    //    super(AgeDzumbunu56874,ColourDzumbunu56874, weightDzumbunu56874);
    //    this.dogbreedDzumbunu56874=dogbreedDzumbunu56874;
  //  }

    public void action1Dzumbunu56874(){
        System.out.println("The dog is retrieving.");
    }

    @Override
    public void action2Dzumbunu56874() {
        System.out.println("The dog is drinking water.");
    }

    @Override
    public void getVoiceDzumbunu56874() {
        System.out.println("The dog is barking.");
    }

    @Override
    public void eatDzumbunu56874(String FoodName) {
        System.out.println("The dog is eating: "+ FoodName);
    }

    @Override
    public void sleepDzumbunu56874()
    {
        System.out.println("zzzzzz");
    }

    @Override
    public void moveDzumbunu56874()
    {
        System.out.println("The dog is running");
    }

    public String getDogbreedDzumbunu56874() {
        return dogbreedDzumbunu56874;
    }

    public void setDogbreedDzumbunu56874(String dogbreedDzumbunu56874) {
        this.dogbreedDzumbunu56874 = dogbreedDzumbunu56874;
    }
    @Override
    public String toString() {
        return
                "Dog{" + "dogbreedDzumbunu56874='" + dogbreedDzumbunu56874 + '\'' +
                '}';
    }
}

