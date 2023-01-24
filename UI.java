package LockedMe;


import java.io.IOException;
import java.util.Scanner;




public class UI {

    public static void displayMenu()
    {
        System.out.println("Welcome To the LockedMe Registry.");
        System.out.println("My name is Nana Brown, How may I help You?");
        System.out.println("You can Choose one of the options below.");
        System.out.println("1. Display Records");
        System.out.println("2. Edit Records");
        System.out.println("3. Exit Store");
   }
    
    
    
    public static void displaySecondMenu()
    {

        System.out.println("1. Create Records");
        System.out.println("2. Delete Records");
        System.out.println("3. Search Records");

    }
    
    
   
    @SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
        /// highly cohesive

        Scanner act = new Scanner(System.in);

        while(true) { // current context
            displayMenu();
            int choice1 = act.nextInt();
            switch(choice1) {
            
                case 1:
                	
                	Service.listAllfiles();

                    break;
                    
                case 2: 
                	displaySecondMenu();
                    int choice2 = act.nextInt();
                    switch(choice2) {
                        case 1:
                        	
                        	System.out.println("What would you like to name your file?");
                        	String fnameadd = act.next();
                        	Service.addfile(fnameadd);

                            break;
                        
                        case 2: 
                        	
                        	System.out.println("What file would you liek to delete?");
                        	String fnamedel = act.next();
                        	Service.deletefile(fnamedel);
                        	
                            break;
                        
                        case 3:
                        	System.out.println("");
                    	    System.out.println("Exiting Store");
                    	    System.out.println("Sorry to see you go");
                    	    System.out.println("Visit us again ");
                    	    System.exit(0);
                        	break;
                      

                    }break;
                
                case 3:
                	System.out.println("");
            	    System.out.println("Exiting Store");
            	    System.out.println("Sorry to see you go");
            	    System.out.println("Visit us again ");
            	    System.exit(0);
                	break;
              

            }break;
            
        }
    }

}