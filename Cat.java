
/**
 * Write a description of class Cats here.
 *
 * @author Josh Clark
 * @version 16/03/2021
 */
public class Cat
{
    // instance variables
    private String name;
    private int hp;

    /**
     * Constructor for objects of class Cat
     */
    public Cat(String nm)
    {
        // initialise instance variables
        name = nm;
        hp = 100;
    }
    
    public void meow()
    {
        System.out.println("Meow!");
    }

    public String getName()
    {
        return name;
    }
    
    public int getHP()
    {
        return hp;
    }
    
    public void hit(int amt)
    {
        this.hp -= amt;
    }
    
    public int claw()
    {
        // attacks between 5-20
        int MIN = 5;
        int MAX = 20;
        return (int) (MIN + Math.random() * MAX);
    }
    
    public boolean isAlive()
    {
        if (this.hp <= 0)
        {
            return false;
        }
        return true;
    }
}
