import com.company.*;
public class Main {

    public static void main(String[] args, Iterable<? extends Animal> Animal)
    {
        Animal AnimalDzumbunu56874s[]= new Animal[6];

        AnimalDzumbunu56874s[0]= new Mammal("Little",5,3,);
        AnimalDzumbunu56874s[1]= new Dog("Rex",5,7,"brown","German Shepard");
        AnimalDzumbunu56874s[2]= new Bird("Eagle",1,3,"white and black");
        AnimalDzumbunu56874s[3]= new BlowFish("Steve",3,5,"Yellow",7);
        AnimalDzumbunu56874s[4]= new Pigeon("Fly",5,4,"grey","spain");
        AnimalDzumbunu56874s[5]= new Fish("Nemo",2,3,"orange and white");


        AnimalDzumbunu56874s[1].getVoice();
        AnimalDzumbunu56874s[2].getVoice();
        AnimalDzumbunu56874s[4].getVoice();

        Animal animalBehavior[] = new Animal[3];
        animalBehavior[0]= new Dog("Rex",3,14,"Carnivore","Bulldog");
        animalBehavior[1]= new Pigeon("Sam",4,5,"red","america");
        animalBehavior[2]= new BlowFish("BlowFish",4,1,"Yellow",18);


        animalBehavior[0].sleepDzumbunu56874();
        animalBehavior[1].sleepDzumbunu56874();
        animalBehavior[2].sleepDzumbunu56874();


        for (Animal a: Animal){
            a.moveDzumbunu56874();




    }



}
