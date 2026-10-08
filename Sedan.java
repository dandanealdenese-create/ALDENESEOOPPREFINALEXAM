/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public class Sedan extends Vehicle{
  private double dailyRate;
  private double insuranceFee;  
    private final double dailyrate;
    
  
  public Sedan(String vehicleID, String model, int year, int rentalDays, double dailyRate, double insuranceFee){
      super(vehicleID, brand,model, year, rentalDays);
      this.dailyrate = dailyRate;
      this.insuranceFee = insureranceFee;
  }
  
  @Override
  public double calculaterentalFee() {
      return (getrentalDays()* dailyRate) + insuranceFee;
  }
  
  @Override
  public void displayVehicleType(){
      System.out.println("Vehicle Type Sedan");
  }
  
  
}
