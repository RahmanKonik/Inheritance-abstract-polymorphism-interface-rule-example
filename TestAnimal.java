interface Animal {
    void makeNoise();
}

interface pet {
    void ownercall();
}

class Dog implements Animal, pet {

    @Override

    public void makeNoise (){
        System.out.println(" the dog , woof , woof");
    }

    @Override

    public void ownercall (){

        System.out.println(" owner is coming !");
    }
} 

class TestAnimal {
    
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.makeNoise();
        dog.ownercall();

        
    }
}
