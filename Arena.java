
/**
 * Where cat and dog fight to death
 *
 * @author Josh
 * @version 16/03/2021
 */
public class Arena
{
    private final int MAXDOGS = 3, MAXCATS = 3;
    
    // this is the new shit // making array of dogs and cats holding objects
    private Dog[] dogs = new Dog[MAXDOGS];
    private Cat[] cats = new Cat[MAXCATS];
    
    public Arena()
    {
        fillKennel();
    }
    
    public void fillKennel()
    {
        for (int i = 0; i < dogs.length; i++)
        {
            dogs[i] = new Dog("Dog " + Integer.toString(i+1));
            cats[i] = new Cat("Cat " + Integer.toString(i+1));
            
            // make the dogs and cats bark and meow
            System.out.print(dogs[i].getName() + " goes");
            dogs[i].bark();
        }
    }
    
    public void dogAttack(Dog dog, Cat cat)
    {
        System.out.println(dog.getName() + " bites " + cat.getName());
        cat.hit(dog.bite());
        
        // check if still alive
        if (cat.isAlive() == false)
        {
            System.out.println(cat.getName() + " is dead");
        }
    }
    
    public void catAttack(Dog dog, Cat cat)
    {
        System.out.println(cat.getName() + " claws " + dog.getName());
        dog.hit(cat.claw());
        
        // check if still alive
        if (dog.isAlive() == false)
        {
            System.out.println(dog.getName() + " is dead");
        }
    }
    
    public void fight()
    {
        while (cats[0].isAlive() == true && dogs[0].isAlive())
        {
            this.dogAttack(dogs[0], cats[0]);
            this.catAttack(dogs[0], cats[0]);
            returnWinner(dogs[0], cats[0]);
        }
    }
    
    public void returnWinner(Dog dog, Cat cat)
    {
        System.out.println(cat.getName() + " has " + cat.getHP() + "hp");
        System.out.println(dog.getName() + " has " + dog.getHP() + "hp\n");
    }
    
    
    
    
}
