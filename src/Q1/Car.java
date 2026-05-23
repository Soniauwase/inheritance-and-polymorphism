package Q1;

public class Car extends Vehicle{
    public Car(String brand, double rentalPrice) {
        super(brand, rentalPrice);

    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalPrice() * days;

    }

    @Override
    public String toString() {
        return "Car{" +
                " carBrand='" + getBrand() + '\'' +
                ", rentalPrice=" + getRentalPrice() +
                '}';
    }
}
