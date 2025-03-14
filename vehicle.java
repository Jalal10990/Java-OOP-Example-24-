class vehicle {
    String brand;

    vehicle(){
        brand = "null";
    }
    vehicle(String brand){
        this.brand = brand;
    }

    void showInfo(){
        System.out.println("thiis is a " + brand + " vehicle.");
    }

}
