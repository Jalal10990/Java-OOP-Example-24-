
public class CarData extends vehicle {
    int doors;

    // Constructor
    CarData(String brand, int doors) {
        super(brand); // Calling Parent class constructor
        this.doors = doors;
    }

 
    void showCarInfo() {
        System.out.println(brand + " car has " + doors + " doors.");
    }
}





