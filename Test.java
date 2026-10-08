/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public class Test {
    public static void displayHeader(){
        System.out.println("===============================================");
        System.out.println(" DINA AND GAT RENT RIDE SERVICE");
        System.out.println("VEHICLE RENTAL");
        System.out.println("===============================================");
    }  
    
    public static void displayVehicle(Vehicle v) {
        v.displayVehicleInfo();
        v.displayVehicleType();
        System.out.printf("Rental Fee : PHP %.2f/n", v.calculateRentalfee());
        System.out.println("\n==============================================");
    }
    
    public static void displaySummary(double totalFees) {
        System.out.println("==================================================");
        System.out.println("Total Vehicles: " + Vehicle.getVehicleCount());
        System.out.printf("Total Rental Fees: PHP %.2f\n",totalFees);
        System.out.println("==================================================");
    }
    
    public static void main(String[] args) {
        displayHeader();
        
        Sedan sedan = new Sedan("SD001","TOYOTA","Vios",2024, 3,1500.00,500.00);
        Van van = new Van ("VN001","TOYOTA","HI-ACE",2023,2,3000.00,1000.00);
        Motorcycle motorcycle = new Motorcycle ("MC001","HONDA","CLICK160",2024,4,500.00,600.00);
        
        Vehicle[] vehicles = new vehicle[3];
        Vehicles[0] = Sedan;
        Vehicles[1] = Van;
        Vehicles[2] = motorcycle;
        
        double total = 0;
        for(Vehicle v : vehicles){
            displayVehicle(v);
            total += v.CalculaterentalFee();
        }
        
        double total = 0;
        
        displaysummary(TOTAL);
    }
}
