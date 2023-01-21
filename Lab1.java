

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {

        try {
            String resName = "Brampton Hamburgers";
            String a = "Type of Burgers";
            String b = "Price";
            String c = "1. Veggie Burger";
            double d = 5.95;
            String e = "2. Deluxe Veggie Burger";
            double f = 7.95;
            String g = "3. Chicken Burger";
            double h = 6.45;
            String i = "4. Cheese Chicken Burger";
            double j = 8.50;
            String k = "5. Cheese Bacon Burger";
            double l = 9.25;
            String m = "6. Deluxe Bacon Burger";
            double n = 10.95;
            String o = "7. Healthy Organic Burger";
            double p = 12.45;
            String q = "8. Quit";


            Scanner input = new Scanner(System.in);

            List<Double> arrSplit2 = new ArrayList<>();

            System.out.println(String.format("%31s", resName));
            System.out.println(a + String.format("%25s", b));
            System.out.println(c + String.format("%20s", "$") + d);
            System.out.println(e + String.format("%13s", "$") + f);
            System.out.println(g + String.format("%19s", "$") + h);
            System.out.println(i + String.format("%12s", "$") + j);
            System.out.println(k + String.format("%14s", "$") + l);
            System.out.println(m + String.format("%14s", "$") + n);
            System.out.println(o + String.format("%11s", "$") + p);
            System.out.println(q);

            for (int x = 1; x <= 5; x++) {
                System.out.println("Order of Customer "+ x);
                double sum = 0;

                while (true) {
                    System.out.print("Enter the item from menu: ");
                    String userInput = input.nextLine();
                    if (userInput.equals("1")) {
                        System.out.print("Quantity of item selected: ");
                        int quantity = input.nextInt();
                        double itemCost = d * quantity;
                        sum += itemCost;
                    } else if (userInput.equals("2")) {
                        System.out.print("Quantity of item selected: ");
                        int quantity = input.nextInt();
                        double itemCost = f * quantity;
                        sum += itemCost;
                    } else if (userInput.equals("3")) {
                        System.out.print("Quantity of item selected: ");
                        int quantity = input.nextInt();
                        double itemCost = h * quantity;
                        sum += itemCost;
                    } else if (userInput.equals("4")) {
                        System.out.print("Quantity of item selected: ");
                        int quantity = input.nextInt();
                        double itemCost = j * quantity;
                        sum += itemCost;
                    } else if (userInput.equals("5")) {
                        System.out.print("Quantity of item selected: ");
                        int quantity = input.nextInt();
                        double itemCost = l * quantity;
                        sum += itemCost;
                    } else if (userInput.equals("6")) {
                        System.out.print("Quantity of item selected: ");
                        int quantity = input.nextInt();
                        double itemCost = n * quantity;
                        sum += itemCost;
                    } else if (userInput.equals("7")) {
                        System.out.print("Quantity of item selected: ");
                        int quantity = input.nextInt();
                        double itemCost = p * quantity;
                        sum += itemCost;
                    } else if (userInput.equals("8")) {
                        break;
                    } else if (userInput.length() == 0) {
                        throw new ArrayIndexOutOfBoundsException("Value entered is out of range!");
                    } else {
                        throw new ArrayIndexOutOfBoundsException("Value entered is out of range!");
                    }
                }
                double VAT = (sum * 13 / 100) + sum;
                if (VAT > 50 && VAT <=100) {
                    double sumAftDis = VAT - (5.00 / 100.00 * VAT);
                    arrSplit2.add(sumAftDis);

                }
                else if (VAT > 100) {
                    double sumAftDis = VAT - (10.00 / 100.00 * VAT);
                    arrSplit2.add(sumAftDis);
                }
                else {
                    double sumAftDis = VAT;
                    arrSplit2.add(sumAftDis);
                }
            }
            for (int y = 0; y < 5;y++) {
                System.out.println("The bill of Customer "+(y+1)+" is "+arrSplit2.get(y)+".");
            }
        }



        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+e.getMessage());

        }



    }
}
