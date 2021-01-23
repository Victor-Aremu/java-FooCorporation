public class FooCorporation {
    public static void main(String[] args) {
        totalPay(7.50, 35 );
        totalPay(8.20, 47 );
        totalPay(10.00, 73 );
    }
    public static void totalPay(double basePay, double hoursWorked){
        double overtime = (hoursWorked % 40) * basePay;
        double salary = hoursWorked * basePay;

        if ((hoursWorked <= 40) && (basePay >= 8.0)){
            System.out.println(salary);
        }
        else if (((hoursWorked > 40)&&(hoursWorked<=60)) && (basePay >= 8.0)){
            System.out.println(salary + overtime);
        }
        else
            System.out.println("Error");
    }
}