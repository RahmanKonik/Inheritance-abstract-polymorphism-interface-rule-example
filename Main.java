
class Vehicle {
    protected String brand = " ford";
    public String modelName;

    public void honk (){
        System.out.println(" tuut, tuut!");
    }
}
class  Car extends Vehicle {
    private String modelName ="mustang";

    public static void main(String[] args) {

        Car car = new Car();

        car.honk();
        System.out.println(car.brand + " "+car.modelName);
        
    }
}
