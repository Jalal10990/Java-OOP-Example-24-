

// Main class to test
public class runner {
    public static void main(String[] args) {
        CarData car = new CarData("Toyota", 4);
        BikeData bike = new BikeData("Yamaha", true);

        // Calling Parent class method
        car.showInfo();
        car.showCarInfo();

        bike.showInfo();
        bike.showBikeINfo();
    }
}
