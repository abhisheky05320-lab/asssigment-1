class Car {
    String brand;
    String model;
    int price;

    Car(String b, String m, int p) {
        brand = b;
        model = m;
        price = p;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Car c1 = new Car("Maruti", "Swift", 650000);
        Car c2 = new Car("Hyundai", "Creta", 1100000);
        Car c3 = new Car("Tata", "Nexon", 900000);

        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();
    }
}