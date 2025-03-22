public class polymorphism {
    // Create a class named Animal
    class Animal {
        public void animalSound() {
            System.out.println("The animal makes a sound");
        }
    }

    // Create a class named Pig that inherits from the Animal class
    class Pig extends Animal {
        @Override
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }
    

    public static void main(String[] args) {
        // Create a new object of the class
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}