public class MallardDuck extends Duck{
    public MallardDuck()
    {
        quackBehaviour = new Quack();
        swimBehaviour = new Swimming();
        flyBehaviour = new Flying();
    }
    @Override
    public void display() {
        System.out.println("I am Mallard Duck");
    }
}
