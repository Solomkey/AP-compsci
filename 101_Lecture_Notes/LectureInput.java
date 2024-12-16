/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();  //Bob gets stored in variable "name"
        
        System.out.println("Hello "+name);
        
        System.out.println("Please enter a number");
        int number = sc.nextInt(); //number is the variable that is stored
        
        
        System.out.println("Please enter another number");
        int number2 = sc.nextInt();
        sc.nextLine();
        
        System.out.println("The sum of these 2 numbers is: " + (number+number2));
        
        System.out.println("Whats your favorite food");
        String food = sc.nextLine();
    
        
        
	}
}