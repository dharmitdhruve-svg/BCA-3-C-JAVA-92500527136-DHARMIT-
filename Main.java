

class Animal {
    String name ="Animal";
    void eat(){
        System.out.println("This animal eats food.");
    }
}

// Subclass (child) inheriting animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks: woof! woof!");
    }
}
class Puppy extends Dog{
    void weep(){
        System.out.println("Puppy is weeping.");
    }
}


// Main execution class 
public class Main {
 
    public static void main(String[] args) {
        Dog myDog=new Dog();
        Puppy p=new Puppy();
        p.eat();//from grandparent(animal)
        p.bark();//from parent(dog)
        p.weep();//from child (Puppy)
        myDog.eat(); // Inherited method from animal class!
        myDog.bark(); // own method of dog class 
    }
}
