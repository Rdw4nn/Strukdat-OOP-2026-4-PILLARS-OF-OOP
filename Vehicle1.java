class Car extends Vehicle {

    public Car(String brand, int speed){
        super(brand, speed);
    }

    @Override
    void move(){
        System.out.println(getBrand() + " car is driving at " + getSpeed());
    }
}

class Bike extends Vehicle {

    public Bike(String brand, int speed){
        super(brand, speed);
    }

    @Override
    void move(){
        System.out.println(getBrand() + " bike is riding at " + getSpeed());
    }
}