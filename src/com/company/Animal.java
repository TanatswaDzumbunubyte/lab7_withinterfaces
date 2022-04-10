package com.company;

public abstract class Animal implements AnimalBehaviourDzumbunu56874, AnimalMoveDzumbunu56874, AnimalNameDzumbunu56874 {

    public String NameDzumbunu56874;
    public int AgeDzumbunu56874;
    private int WeightDzumbunu56874;

    public Animal(int ageDzumbunu56874) {
        AgeDzumbunu56874 = WeightDzumbunu56874 = 12;
        NameDzumbunu56874 = "NN";
    }

    public Animal(String NameDzumbunu56874, int AgeDzumbunu56874, int WeightDzumbunu56874, String colourofFeathersDzumbunu56874) {
        this.NameDzumbunu56874 = NameDzumbunu56874;
        this.AgeDzumbunu56874 = AgeDzumbunu56874;
        this.WeightDzumbunu56874 = WeightDzumbunu56874;
    }

    public Animal(int AgeDzumbunu56874, String orderDzumbunu56874, int weightDzumbunu56874) {
        this.AgeDzumbunu56874 = AgeDzumbunu56874;
    }

    public Animal() {

    }

    public abstract void eat(String foodName);

    public abstract void getVoice();

    public String getNameDzumbunu56874() {
        return NameDzumbunu56874;
    }

    public void setNameDzumbunu56874(String NameDzumbunu) {
        this.NameDzumbunu56874 = NameDzumbunu56874;
    }

    public int getAgeDzumbunu56874() {
        return AgeDzumbunu56874;
    }

    public void setAgeDzumbunu56874(int AgeDzumbunu) {
        this.AgeDzumbunu56874 = AgeDzumbunu;
    }

    public int getWeightDzumbunu56874() {
        return WeightDzumbunu56874;
    }

    public void setWeightDzumbunu56874(int WeightDzumbunu56874) {
        this.WeightDzumbunu56874 = WeightDzumbunu56874;
    }

    public abstract void getVoiceDzumbunu56874();

    public abstract void eatDzumunu56874(String FoodName);

    public abstract void eatDzumbunu56874(String FoodName);
}

//interface animal name
interface AnimalNameDzumbunu56874{
    static void nameDzumbunu56874(String Name)
    {
        System.out.println("The animal's name is" + Name);
    }
}

//interface animal behaviour
interface AnimalBehaviourDzumbunu56874{
    void sleepDzumbunu56874();
}


//interface animal move
interface AnimalMoveDzumbunu56874{
    default void moveDzumbunu56874() {
        System.out.println("The animal is moving. ");
    }
}




