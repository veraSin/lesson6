public class Animal {
    private String name;
    protected float max_run;
    protected float max_swim;
    protected float max_jump;

    public Animal(String Name) {
        name = Name;
        max_run = 0F;
        max_swim = 0F;
        max_jump = 0F;
    }

    public void Run(float distance) {
        if (max_run == 0) {
            System.out.println(name + " can't run!");
        } else
        if (distance > max_run) {
            System.out.println(name + " can't run so long!");
        } else {
            System.out.println(name + " run " + distance + " m.");
        }
    }

    public void Jump(float height) {
        if (max_jump == 0) {
            System.out.println(name + " can't jump!");
        } else
        if (height > max_jump) {
            System.out.println(name + " can't jump so high!");
        } else {
            System.out.println(name + " jumped " + height + " m.");
        }
    }

    public void Swim(float distance) {
        if (max_swim == 0) {
            System.out.println(name + " can't swim!");
        } else
        if (distance > max_swim) {
            System.out.println(name + " can't swim so long!");
        } else {
            System.out.println(name + " swam " + distance + " m.");
        }
    }

}
