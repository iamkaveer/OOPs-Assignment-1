import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String carType = sc.nextLine();
        if(carType.equals("SUV")){
            String serviceCodes = sc.nextLine();
            String[] services = serviceCodes.split(",");
            Suv suvCar = new Suv();
            suvCar.setServices(services);
            suvCar.generateBills();
        }else if(carType.equals("Hatchback")){
            String serviceCodes = sc.nextLine();
            String[] services = serviceCodes.split(",");
            Hatchback HatchbackCar = new Hatchback();
            HatchbackCar.setServices(services);
            HatchbackCar.generateBills();
        }else if(carType.equals("Sedan")){
            String serviceCodes = sc.nextLine();
            String[] services = serviceCodes.split(",");
            Sedan SedanCar = new Sedan();
            SedanCar.setServices(services);
            SedanCar.generateBills();
        }
        
    }
}
class Suv{
    //to store service code and its price
    private static Map<String,Integer> map = new HashMap<>();
    static {
        map.put("BS01",5000);
        map.put("EF01",10000);
        map.put("CF01",6000);
        map.put("BF01",2500);
        map.put("GF01",8000);
    }
    //to store service code and its name
    private static Map<String,String> code_name = new HashMap<>();
    static {
        code_name.put("BS01","Basic Servicing");
        code_name.put("EF01","Engine Fixing");
        code_name.put("CF01","Clutch Fixing");
        code_name.put("BF01","Brake Fixing");
        code_name.put("GF01","Gear Fixing");
    }
    
    String carType = "SUV";
    String[] services;
    public void setServices(String[] services){
        this.services = services;
    }
    public void generateBills(){
        System.out.println("Types of Car: "+carType);
        System.out.print("Service Codes: ");
        for(String ele : this.services){
            System.out.print(ele+" ");
        }
        System.out.println();
        int total = 0;
        for(String ele : this.services){
            System.out.println("Charges for "+code_name.get(ele)+" - "+map.get(ele));
            total = total + map.get(ele);
        }
        System.out.println("Total Bill "+total);
        if (total > 10000) {
            System.out.println("Complimentary cleaning provided.");
        }
    }
}

class Hatchback{
    //to store service code and its price
    private static Map<String,Integer> map = new HashMap<>();
    static {
        map.put("BS01",2000);
        map.put("EF01",5000);
        map.put("CF01",2000);
        map.put("BF01",1000);
        map.put("GF01",3000);
    }
    //to store service code and its name
    private static Map<String,String> code_name = new HashMap<>();
    static {
        code_name.put("BS01","Basic Servicing");
        code_name.put("EF01","Engine Fixing");
        code_name.put("CF01","Clutch Fixing");
        code_name.put("BF01","Brake Fixing");
        code_name.put("GF01","Gear Fixing");
    }
    
    String carType = "Hatchback";
    String[] services;
    public void setServices(String[] services){
        this.services = services;
    }
    public void generateBills(){
        System.out.println("Types of Car: "+carType);
        System.out.print("Service Codes: ");
        for(String ele : this.services){
            System.out.print(ele+" ");
        }
        System.out.println();
        int total = 0;
        for(String ele : this.services){
            System.out.println("Charges for "+code_name.get(ele)+" - "+map.get(ele));
            total = total + map.get(ele);
        }
        System.out.println("Total Bill "+total);
        if (total > 10000) {
            System.out.println("Complimentary cleaning provided.");
        }
    }
}

class Sedan{
    //to store service code and its price
    private static Map<String,Integer> map = new HashMap<>();
    static {
        map.put("BS01",4000);
        map.put("EF01",8000);
        map.put("CF01",4000);
        map.put("BF01",1500);
        map.put("GF01",6000);
    }
    //to store service code and its name
    private static Map<String,String> code_name = new HashMap<>();
    static {
        code_name.put("BS01","Basic Servicing");
        code_name.put("EF01","Engine Fixing");
        code_name.put("CF01","Clutch Fixing");
        code_name.put("BF01","Brake Fixing");
        code_name.put("GF01","Gear Fixing");
    }
    
    String carType = "Sedan";
    String[] services;
    public void setServices(String[] services){
        this.services = services;
    }
    public void generateBills(){
        System.out.println("Types of Car: "+carType);
        System.out.print("Service Codes: ");
        for(String ele : this.services){
            System.out.print(ele+" ");
        }
        System.out.println();
        int total = 0;
        for(String ele : this.services){
            System.out.println("Charges for "+code_name.get(ele)+" - "+map.get(ele));
            total = total + map.get(ele);
        }
        System.out.println("Total Bill "+total);
        if (total > 10000) {
            System.out.println("Complimentary cleaning provided.");
        }
    }
}
