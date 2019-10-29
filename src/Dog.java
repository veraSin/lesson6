public class Dog extends Animal {
    public Dog(String Name) {
        super(Name);
        max_jump = 0.2F + (float)Math.random() * 0.6F;
        max_swim = 5F + (float)Math.random() * 10F;
        max_run = 300F + (float)Math.random() * 500F;
    }
}
