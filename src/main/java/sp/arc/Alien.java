package sp.arc;

public class Alien {
    int age;
    private Laptop lap;

    public Alien() {
        System.out.println("object created.");
    }

    public Alien(int age, Laptop lap) {
        this.age = age;
        this.lap = lap;
    }

    public Alien(int age){
        System.out.println("pera constructor called");
        this.age =age;
        System.out.println(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter age Called");
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void compile(){
        lap.code();
        System.out.println("compiling..");
    }
}
