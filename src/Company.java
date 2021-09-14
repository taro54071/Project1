import java.util.Scanner;

class Employee{
    protected String name; //name of employees
    protected int[] sales; //array of each sales on every product
                           // {10,10,10,10,10}
    protected int salesBonus = 0, overtimeBonus = 0;
    protected int totalBonus = salesBonus + overtimeBonus;
    /*
        1. adding more method and variable are needed
        2.write input in main method
    unfinished
    */
    //temp function(string product, int[] sales)
}

class Product extends Employee {
    // protected String ac, cctv, dish, micro, refri;
    // this is hard coded so we comment it.
    protected int price;
    protected int totalSalesUnit, totalSalesBaht;
    /* 1. adding more method and variables are needed
       2. write input in main method
        Test
adfadadsfasdf
    unfinished
    */

    }
} 






public class Company{
    public static void main(String[] args) throws Exception {
        // input every files to every single class
        //
        String product_file = "products.txt";
        String employee_file = "employees.txt";
        String overtime_file = "overtime.txt";
        String error_file = "employees_errors.txt";
        
        System.out.println("Hello world");
        // Scanner read = new Scanner(new File(product_file));
        // this is another test bitch

    }
}


