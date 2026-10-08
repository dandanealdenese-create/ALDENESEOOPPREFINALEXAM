/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public class Van extends Vehicle{
    private double dailyRate;
    private double driverFee;
    
    public Van(String vehicleID,String brand,String model, int year, int rentaldays, double dailyrate, double driverFee) {
        super(vehicleID, brand, model, year, rentalDays);
        this.dailyRate = dailyrate;
        this.driverFee = driverFee;
    }
    
    @override
    public double calculaterentalFee() {
        return (getRentalDays() * dailyRate) + driverFee;
    }
    
    
    @override
    public void displayVehicleType() {
        System.out.println("Vehicle Type:VAN");
    }
}
