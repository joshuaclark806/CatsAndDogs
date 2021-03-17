
/**
 * Write a description of class Cats here.
 *
 * @author Josh Clark
 * @version 16/03/2021
 */
public class Dog
{
    // instance variables
    private String name;
    private int hp;

    /**
     * Constructor for objects of class Dog
     */
    public Dog(String nm)
    {
        // initialise instance variables
        name = nm;
        hp = 150;
    }
    
    public void bark()
    {
        System.out.println("Ruff!");
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
    
    public int bite()
    {
        // attacks between 5-20
        int MIN = 1;
        int MAX = 10;
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
