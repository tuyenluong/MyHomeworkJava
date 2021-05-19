package chapter10;

public class Tiger extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Roar");
    }
    public void bite(){
        System.out.println("I am a tiger. I bite things");
    }
}
