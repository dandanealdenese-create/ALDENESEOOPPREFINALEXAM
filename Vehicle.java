/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public class Vehicle {

    static String getVehicleCount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

public abstract class Vehicle {
    private String vehicle;
    private String Brand;
    private String model;
    private int year;
    private int reantalDays;
    private static int vehiclecount = 0;
    
    public Vehicle(int vehicleCount) {
        vehicleCount++;
    }
    
   public Vehicle(String vehicleID, String brand, String model, int year, int rentalDays){
     this.vehicleId = vehicleID;
     this.Brand = brand;
     this.model = model;
     this.year = year;
     this.reantalDays = rentalDays;
     vehicleCount++;
   }
}             
   public String getvehicleID() { return vehicleID; }
   public void setvehicleID(String vehicleID) { this.vehicleID = vehicleID; }
   public String getBrand() { return Brand; }
   public void setBrand(String brand) { this.Brand = Brand;}
   public String getmodel() { return model;}
   public void setmodel(Sring model) { this.model = model;}
   public int getYear() { return year; }
   public void set year( int year ) { this.year = year;}
   public int getrentalDays() { return rentalDays; }
   public void setrentalDays( int rentalDays) {this.rentalDays; }
   
   public abstract double calculateRentalfee();
   
   public void displayVehicleInfo() {
       System.out.println("Vehicle ID : " + vehicleID);
       System.out.println("Brand : " + brand);
       System.out.println("Model : " + model);
       System.out.println("Year : " + year);
       System.out.println("Rental Days : " + rentalDays);
   }
   
   public static int getVehicleCount(int vehicleCount) {
       return vehicleCount++;
   }
   
   public void displayVehicleInfo(boolean showRentalFee) {
       displayVehicleInfo();
       if (showRentalFee){
           System.out.printf("Rental Fee : PHP %.2f\n", calculateRentalFee());
       }
   }
   
   public abstract void displayVehicleType():
 
}
  
