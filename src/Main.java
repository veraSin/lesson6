public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Lucy");
        Cat cat2 = new Cat("Josephine");
        cat1.Run(250F);
        cat1.Swim(10F);
        cat1.Jump(1.9F);
        cat2.Run(210F);
        cat2.Jump(5F);

        Dog dog1 = new Dog("Max");
        Dog dog2 = new Dog("Rex");
        dog1.Run(800F);
        dog2.Run(400F);
        dog1.Swim(12F);
        dog2.Swim(6F);
        dog1.Jump(0.3F);
        dog2.Jump(1.8F);

    }
}
