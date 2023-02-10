abstract class Animal {

    abstract void makeNoise();

    public void run(){
        System.out.println(" the animal is running!");
    }
}

class Dog extends Animal {
    @Override
    public void makeNoise(){

        System.out.println(" the dog goes woof, woof");

    }
}

class Main1 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.makeNoise();
        dog.run();
        
    }
}
