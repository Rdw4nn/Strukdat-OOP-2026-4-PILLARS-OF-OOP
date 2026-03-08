public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Car("McLaren", 92);
        Vehicle v2 = new Bike("Ferrari", 73);

        v1.move();
        v2.move();
    }

}
