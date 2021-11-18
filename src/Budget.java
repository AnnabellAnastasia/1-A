///**
// * Budjet.java
// * @author annabellawilkins
// * @since november 2021
// * This class ...
// */
//public class Budget {
///*instance variables for Budget attributes
//* */
//    private double hourlyWages;
//    private double rentForLocalApartment;
//    private double internetService;
//    private double groceryBill;
//    private double funAllowance;
//
//    /** constructor Budget initialize five instances variables to parameters
//     *
//     * @param initHourlyWages
//     * @param rent
//     * @param internet
//     * @param initFunAllowance
//     * @param initGroceryBill
//     *
//     */
//    public Budget(double initHourlyWages,
//                  double rent,
//                  double internet,
//                  double initFunAllowance,
//                  double initGroceryBill){
//
//        hourlyWages = initHourlyWages;
//        internetService = internet;
//        rentForLocalApartment = rent;
//        groceryBill = initGroceryBill;
//        funAllowance = initFunAllowance;
//    }
//// The calculateMonthlyExpences() method calculate monthly
//// and weekly expences, workhours and workhours including savings.
//
//    public void calculateMonthlyExpences(int rent,
//                                           double internet,
//                                           double grocery,
//                                           double fun){
//         int monthlyExpences = (int)(rent + internet + grocery + fun);
//         int weeklyExpences = monthlyExpences / 4;
//         int workHours = (int) (monthlyExpences / hourlyWages);
//         int workSafeHours = (int)((monthlyExpences+100) / hourlyWages);
//
//         System.out.println("My hourly wage is " + hourlyWages);
//        System.out.println("My montly expences are " + monthlyExpences);
//        System.out.println("My total montly expences are " + monthlyExpences);
//        System.out.println(workHours + " hours I will have to work to afford my monthly expenses");
//        System.out.println(workSafeHours + " hours I  will have to work to include savings of $100 per month");
//         if (workHours >= 160){
//            System.out.println("Based on my monthly budget, I need a new job!!!!");
//        }else
//            System.out.println("Based on my monthly budget, I can keep current job!!!!");
//
//
//    };
//}

/**
 * Class Budget keeps truck of wage, rent, internet, grocery and fun expences.
 */
public class Budget {
    //instance variable names
    private double wage;
    private double rent;
    private double internet;
    private double grocery;
    private double fun;

    //Instance variable name
    public Budget(double wage, double rent, double internet, double grocery, double fun) {
        this.wage = wage;
        this.rent = rent;
        this.internet = internet;
        this.grocery = grocery;
        this.fun = fun;
    }



//    public void calcExpences(double wage, double rent, double internet, double grocery, double fun) {
//        int monthlyExpences = (int) (rent + internet + grocery + fun);
//        int weeklyExpences = monthlyExpences / 4;
//        int workHours = (int) (monthlyExpences / hourlyWages);
//        int workSafeHours = (int) ((monthlyExpences + 100) / hourlyWages);
//
//        System.out.println("My hourly wage is " + hourlyWages);
//        System.out.println("My montly expences are " + monthlyExpences);
//        System.out.println("My total montly expences are " + monthlyExpences);
//        System.out.println(workHours + " hours I will have to work to afford my monthly expenses");
//        System.out.println(workSafeHours + " hours I  will have to work to include savings of $100 per month");
//        if (workHours >= 160) {
//            System.out.println("Based on my monthly budget, I need a new job!!!!");
//        } else
//            System.out.println("Based on my monthly budget, I can keep current job!!!!");
//    }

}