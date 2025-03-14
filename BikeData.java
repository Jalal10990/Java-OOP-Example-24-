 public class BikeData extends vehicle {
    
    boolean hasGear;

   
    BikeData(String brand, boolean gear){
        super(brand);
        this.hasGear = gear;

    }
    void showBikeINfo(){
        System.out.println(brand + " bike has gear: " + hasGear);

    }
}
