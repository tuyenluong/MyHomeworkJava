package chapter10;

public class Zoo {

    public static void main(String[] args){
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makeSound();
        sasha = new Cat();
        sasha.makeSound();
        ((Cat) sasha).scratch();
        feed(sasha);
        
        sasha = new Tiger();
        sasha.makeSound();
        ((Tiger) sasha).bite();
        feed(sasha);
    }
    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("here your dog food");
        }
        else if (animal instanceof Cat){
            System.out.println("here your cat food");
        }
        else if (animal instanceof Tiger){
            System.out.println("here your meet");
        }
    }
}
