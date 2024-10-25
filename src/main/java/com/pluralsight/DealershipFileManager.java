package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {



    public Dealership getDealership() {

        Dealership dealership = new Dealership();

        try {
            BufferedReader bufRead = new BufferedReader(new FileReader("src/main/resources/inventory.csv"));

            String line;

            while ((line = bufRead.readLine()) != null) {
                String[] parts = line.split("\\|");
                {
                    int vin = Integer.parseInt(parts[0].trim());
                    int year = Integer.parseInt(parts[1].trim());
                    String make = parts[2].trim();
                    String model = parts[3].trim();
                    String vehicleType = parts[4].trim();
                    String color = parts[5].trim();
                    int odometer = Integer.parseInt(parts[6]);
                    double vehiclesByPrice = Double.parseDouble(parts[7]);


                    Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, vehiclesByPrice);
                    dealership.addVehicle(vehicle);
                }
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
return dealership;
    }

      public void saveDealership(){

    }

}
