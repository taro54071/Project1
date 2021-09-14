import java.util.Scanner;

class Product extends Employee {
    protected String ac, cctv, dish, micro, refri;
    protected int price;
    protected int totalSalesUnit, totalSalesBaht;
    /* 1. adding more method and variables are needed
        2. write input in main method

    unfinished
    */
    public int sumof_SalesUnit(String name, int units){
        // System.out.println("hello");
        int sum = 0;
        switch(name)
        {
            case "ac" : 
                // System.out.println("hello");
                return sum = 40000*units;
            case "cctv" : 
                // System.out.println("hello");
                return sum = 75000*units;
            case "dish" : 
                // System.out.println("hello");
                return sum = 16000*units;
            case "micro" : 
                // System.out.println("hello");
                return sum = 4500*units;
            case "refri" : 
                // System.out.println("hello");
                return sum = 24000*units;
        }

        return sum;
    }
} 

class Employee{
    protected String name; //name of employees
    protected int[] sales; //array of each sales on every product
    protected int salesBonus, overtimeBonus, totalBonus;
    /*
        1. adding more method and variable are needed
        2.write input in main method
    unfinished
    */
}




public class Company{
    public static void main(String[] args) throws Exception {
        // input every files to every single class
        String product_file = "products.txt";
        String employee_file = "employees.txt";
        String overtime_file = "overtime.txt";
        String error_file = "employees_errors.txt";
        
        // Scanner read = new Scanner(new File(product_file));
        

    }
}
