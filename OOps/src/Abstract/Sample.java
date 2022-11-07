package Abstract;
abstract class Sample{
    public void display() {
        System.out.println("It is a non abstract method");
    }
}
abstract class Bike{
    public abstract void run();
    void changeGear(){
        System.out.println("Changing the gear");
    }
}
class Honda extends Bike{
    public void run() {
        System.out.println("Motocycle is running");
    }
}