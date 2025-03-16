import java.util.Scanner;

class Example {	
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Prices of items
        double Basmathi1 = 250.00, Dhal1 = 180.00, Suger1 = 150.00, 
        Highland1 = 1200.00, Youghurt1 = 50.00, Flour1 = 120.00, Soap1 = 160.00;

        // Variables for quantity input
        double Basmathi, Dhal, Suger, Highland, Youghurt, Flour, Soap;

        System.out.println();         
      	System.out.println("================================================================================="); 
	System.out.println("__	    __  _		              _          _ __  __            _	");
	System.out.println("\\ \\        / / | |			     | |        (_)  \\/  |          | |");
	System.out.println(" \\ \\  /\\  / /__| |  ___ ___  _ __ ___   ___  | |_ ___	 _| \\  / | __ _ _ __| |_ ");
	System.out.println("  \\ \\/  \\/ / _ \\ |/  __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\  | | |\\/| |/ _` | '__| __|");
	System.out.println("   \\  /\\  /  __/ |  (_| (_) | | | | | |  __/ | || (_) | | | |  | | (_| | |  | |_  ");
	System.out.println("    \\/  \\/ \\___|_|\\___ \\___/|_| |_| |_|\\___|  \\__\\___/  |_|_|  |_|\\__,_|_|   \\__|");
	System.out.println(""); 
	System.out.println("=================================================================================");
        System.out.println();

        // Input customer details
        System.out.print("Enter Customer Phone Number  -  ");
        String phoneNumber = scanner.nextLine();
        System.out.println(); 
        System.out.print("Enter Customer Name\t     -  ");
        String name = scanner.nextLine();
        System.out.println();
        System.out.println("=================================================================================");
	System.out.println();

        // Taking input for quantities
        System.out.print("Basmathi Qty(Kg)  - "); 
        Basmathi = scanner.nextDouble();
	System.out.println();
        System.out.print("Dhal Qty(Kg)      - ");
        Dhal = scanner.nextDouble();
	System.out.println();
        System.out.print("Suger Qty(Kg)     - ");
        Suger = scanner.nextDouble();
	System.out.println();
        System.out.print("Highland Qty(Kg)  - ");
        Highland = scanner.nextDouble();
	System.out.println();
        System.out.print("Youghurt Qty(Kg)  - ");
        Youghurt = scanner.nextDouble();
	System.out.println();
        System.out.print("Flour Qty(Kg)     - ");
        Flour = scanner.nextDouble();
	System.out.println();
        System.out.print("Soap Qty(Kg)      - ");
        Soap = scanner.nextDouble();
	System.out.println();

        // Calculate total price
        double price = (Basmathi * Basmathi1) + (Dhal * Dhal1) + (Suger * Suger1) +
                       (Highland * Highland1) + (Youghurt * Youghurt1) + (Flour * Flour1) + (Soap * Soap1);
        double discount = price * 0.10;
        double realprice = price - discount;

        System.out.println(" +----------------------------------------------------------------+						");
 		System.out.println(" |		    _   __  __	        _____ _______		  |							");
		System.out.println(" |                 (_) |  \\/  |   /\\   |  __ \\__   __|	          |	                     ");
		System.out.println(" |                  _  | \\  / |  /  \\  | |__) | | |  	       	  |			          ");
		System.out.println(" |                 | | | |\\/| | / /\\ \\ |  _  /  | |     	  |	                     ");
		System.out.println(" |                 | | | |  | |/ ____ \\| | \\ \\  | |		  |	                   ");
		System.out.println(" |		   |_| |_|  |_/_/    \\_\\_|  \\_\\ |_|		  |		            ");
		System.out.println(" |		       255,Galle Road,Panadura.	         	  |			         ");
		System.out.println(" |								  |");
		System.out.println(" +----------------------------------------------------------------+	");
		System.out.println(" | \t \t \t # Tel  : " + phoneNumber + "                      |");
        	System.out.println(" | \t \t \t # Name : " + name + "\t \t \t  |");
		System.out.println(" +-----------------------+----------+----------------+------------+	");
		System.out.println(" |                       |   QTY    |   Unit Price   |    Price   |	");
		System.out.println(" +-----------------------+----------+----------------+------------+	");
        System.out.printf(" |%-15s %8s %5.1f %4s %10.2f %5s %9.2f %2s %n", " # Basmathi", "|", Basmathi,"|", Basmathi1,"|", Basmathi * Basmathi1, "|");
        System.out.printf(" |%-15s %8s %5s %4s %10s %5s %9s %2s %n", "", "|", "","|", "","|", "", "|");
        System.out.printf(" |%-15s %8s %5.1f %4s %10.2f %5s %9.2f %2s %n", " # Dhal",     "|", Dhal,"|", Dhal1,"|", Dhal * Dhal1, "|");
        System.out.printf(" |%-15s %8s %5s %4s %10s %5s %9s %2s %n", "", "|", "","|", "","|", "", "|");
        System.out.printf(" |%-15s %8s %5.1f %4s %10.2f %5s %9.2f %2s %n", " # Suger",    "|", Suger,"|", Suger1,"|", Suger * Suger1, "|");
        System.out.printf(" |%-15s %8s %5s %4s %10s %5s %9s %2s %n", "", "|", "","|", "","|", "", "|");
        System.out.printf(" |%-15s %8s %5.1f %4s %10.2f %5s %9.2f %2s %n", " # Highland", "|", Highland,"|", Highland1,"|", Highland * Highland1, "|");
        System.out.printf(" |%-15s %8s %5s %4s %10s %5s %9s %2s %n", "", "|", "","|", "","|", "", "|");
        System.out.printf(" |%-15s %8s %5.1f %4s %10.2f %5s %9.2f %2s %n", " # Youghurt", "|", Youghurt,"|", Youghurt1, "|", Youghurt * Youghurt1, "|");
        System.out.printf(" |%-15s %8s %5s %4s %10s %5s %9s %2s %n", "", "|", "","|", "","|", "", "|");
        System.out.printf(" |%-15s %8s %5.1f %4s %10.2f %5s %9.2f %2s %n", " # Flour",    "|", Flour,"|", Flour1,"|", Flour * Flour1, "|");
        System.out.printf(" |%-15s %8s %5s %4s %10s %5s %9s %2s %n", "", "|", "","|", "","|", "", "|");
        System.out.printf(" |%-15s %8s %5.1f %4s %10.2f %5s %9.2f %2s %n", " # Soap",     "|", Soap,"|", Soap1,"|", Soap * Soap1,"|");
        System.out.printf(" |%-15s %8s %5s %4s %10s %5s %9s %2s %n", "", "|", "","|", "","|", "", "|");
        System.out.println(" +-----------------------+----------+----------------+------------+	");
        System.out.printf(" |%33s | Total          | %10.2f |%n", "", price);
	System.out.println(" | \t \t \t \t    +----------------+------------+ "); 
	System.out.printf(" |%33s | Discount (10%%) | %10.2f |%n", "", discount);
	System.out.println(" | \t \t \t \t    +----------------+------------+ "); 
	System.out.printf(" |%33s | Final Price    | %10.2f |%n", "", realprice);
	System.out.println(" +----------------------------------+----------------+------------+	");
    
        scanner.close();
    }
}
