import models.Orders;
import models.Tshirts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] size = {"XL","M","L"};
        //CREATING 3 OBJECTS
        Tshirts choice1 = new Tshirts("Gorkhali Batman",572,1235,"Karuna","Graphic text: You either die a hero or live long enough to see yourself be a villain",size);
        Tshirts choice2 = new Tshirts("Iron Bahadur",676,999,"Karuna","Graphic text: I AM IRON MAN",size);
        Tshirts choice3 = new Tshirts("Hulk Mishra",111,333,"Karuna","Graphic text: I AM ANGRY",size);
        Scanner sc = new Scanner(System.in);
        //ASKING USER TO SELECT THE ITEM TO VIEW DETAILS
        System.out.println("1) GORKHALI BATMAN : Rs.1235 ---[CODE:572]\n2) IRON BAHADUR : Rs.999     ---[CODE:676]\n3) HULK MISHRA : Rs.1235     ---[CODE:111]");
        System.out.println("Enter the choice no. (1 or 2 or 3)");
        int choose = sc.nextInt();
        // USING CONDITIONAL TO SHOW DETAILS ACCORDINGLY
        if (choose == 1){
                choice1.describe();
        } else if (choose==2) {
            choice2.describe();
        } else if (choose==3) {
            choice3.describe();
        }
        else {
            System.out.println("---------NO PRODUCT FOUND------------");
        }

        //TASK 2
        // CREATION OF 3 OBJECTS WITH CERTAIN PURCHASED PRODUCTS AND THEIR CODES WITH PRICES
        Orders customer1 = new Orders("Ramu", "97400012",new String[]{"572","676"}, new int[]{1235,999});
        Orders customer2 = new Orders("Hari", "9749090012",new String[]{"572","111"}, new int[]{1235,333});
        Orders customer3 = new Orders("Ranua", "97400012",new String[]{"111","676"}, new int[]{333,999});
        // RUNNING CUSTOM METHOD BY GIVING OPTION FOR USER TO VIEW BILL
        System.out.println("\n\n\nVIEW BILLS OF \n1)Ramu\n2)Hari\n3)Ranua");
        int selector = sc.nextInt();
        if (selector == 1){
            customer1.vat_bill();
        } else if (selector==2) {
            customer2.vat_bill();
        } else if (selector==3) {
            customer3.vat_bill();
        }
        else {
            System.out.println("---------NO CUSTOMER FOUND------------");
        }
    }
}