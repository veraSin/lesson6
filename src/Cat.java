public class Cat extends Animal {
    public Cat(String Name) {
        super(Name);
        max_jump = 1.5F + (float)Math.random();
        max_swim = 0F;
        max_run = 150F + (float)Math.random() * 100F;
    }
}
