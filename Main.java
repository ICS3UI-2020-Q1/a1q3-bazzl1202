import java.util.Scanner;
/**
 *
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);

    // declare and intialize variable thats stores cost of chromebook charger
    double chromebookChargers = 34.99;

    // ask user how many chromebook chargers they want
    System.out.println("How many chromebook chargers?");

    //declare and intialize variable that stores number of chrombook chargers
    int numberChromebookChargers = input.nextInt();

    // declare and initalize variable that stores cost of replacement motherboard
    double replacementMotherboard = 127.50;

    //ask user how many replacement motherboards they want
    System.out.println("How many motherboards?");

    //declare and intialize variable that stores number of replacement motherboards
    int numberReplacementMotherboards = input.nextInt();

    // declare and initialize variable that stores cost of computer mouse
    double computerMouse = 18.00;

    // ask user how many computer mice they want
    System.out.println("How many mice?");

    // declare and initialize variable that stores number of computer mice
    int numberComputerMice = input.nextInt();

    //declare and calculate subtotal 
    double subtotal = (chromebookChargers*numberChromebookChargers)+(replacementMotherboard*numberReplacementMotherboards)+(computerMouse*numberComputerMice);

    // tell the user the subtotal
    System.out.println("Subtotal = " + "$" + subtotal);

    //declare and calculate taxes
    double taxes = subtotal*0.13;

    // tell the user the taxes
    System.out.println("Taxes = " + "$" + taxes);

    // declare and calculate total
    double total = subtotal+taxes;

    //tell user the total
    System.out.println("Total = " + "$" + total);

  }
}
