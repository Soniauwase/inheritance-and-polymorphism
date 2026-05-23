import Q1.Bike;
import Q1.Car;
import Q1.Vehicle;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


            System.out.println(" ********  choose vehicle  To Rent  ************** ");

            System.out.println("1.car rental");
            System.out.println("2. bike  rental");
            System.out.print(" enter your choice ");
            String choice = input.next();
            switch (choice){
                case "1":
                    System.out.print("enter the car brand : ");
                    String CarBrand = input.next();
                    Car car = new Car(CarBrand ,5000);
                    System.out.print("enter day you want to rent car ");
                    int day= input.nextInt();
                    car.calculateRentalCost(3);
                    System.out.print(car);
                    System.out.println();
                    break;
                case "2":
                    input.nextLine();
                    System.out.print(" you choose Bike y/n");
                    String bike= input.next();
                    System.out.print(" enter the millage ");
                    int millage = input.nextInt();
                    System.out.print(" enter the bike brand");
                    String bikeBrand= input.next();
                    Bike v1=new Bike(bikeBrand,3000);
                    System.out.print("enter the day you rent the bike");
                    int dy= input.nextInt();
                    v1.calculateRentalCost(5);
                    System.out.println(v1);


            }

        }
    }
