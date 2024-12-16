/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;
class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        /*int  //Yes Primitive
        String  //NO NOT PRIMITIVE
        double
        Scanner
        
        PRIMITIVE DATA
        Thse are foundational blocks of data (lower case data)
        int, double, boolean, char, float, long, etc.
        
        String is NOT primitive because it is mad eup of 
        char's 
        
        'h' + 'e' + 'l' + 'l' + 'o' This is equal to "hello"
        
        void set(String ){
            this. = ;
        }
       
        
        boolean x = true;
        boolean y = false;
        //These are the ONLY values a boolean can store. Beyond that, we can store Expressions!
        //These act as answers to YES/NO questions
        
        boolean z = 5>3; //What vlue does z store? 
        boolean a = 3<4; //Less than
        boolean b = 4 == 4; //Equal to
        boolean c = 4 != 5; //NOT equal to
        boolean d = 3 <= 3; //Less than or equal to
        boolean e = 5 >=8; //Greater than or equal to
        
        //These are all the expressions we can use for PRIMITIVE DATA ONLY
        
        Above we compare JUST integers. 
        boolean f = 5.5 !=6.5
        boolean g = true == false;
        
        We cannot use these to compare Strings
        
        FOR STRINGS
        NEW METHOD
        
        .equals()
        boolean h = ("hello").equals("hello");
        
        Strings must use the .equals method to compare.
        This does a letter by letter comparison till finished or different
        
        That's it for booleans.
        They store True or False.
        >
        <
        ==
        <=
        !=
        >=
        
        And strings, 
        .equals()
        
        OKAY NOW FOR IF STATEMENTS
        We can start to CHOOSE our own adventure! LIke a book!
        
        if(SOME QUESTION){
            
        }
        if(5>3){  //Here we can place a question or answer
            //IF THE CONDITION ABOVE IS TRUE
            //THEN THIS CODE RUNS
            
            System.out.print("This runs!");
        }	
        if(a){      //Try running your code using the booleans above
            System.out.print("This runs too!");
            
        if(c){
            System.out.print("aosdjfps");
        }
        
        This whole chunk is called a "BRANCH"
        if(x > 5){
            WHEN x is bigger than 5
        }
        else if(x < 5){
            When x is NOT bigger than 5
            AND 
            x is smaler than 5
        }
        else{
           // When x is equal to 5
           // but not smaller or greater
            System.out.print("This runs THIRD");
        }
        */
        //Take in one scanner integer
        //Then compare it to see if its larger than 10
        

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Number please");
        int num = sc.nextInt();
        
        if(num > 10){
            System.out.println("Your number is bigger than 10");
        }
        else{
            //THIS ELSE CATCHES EVERYTHING ELSE
            System.out.print("Your value isn't greater than 10");
        }
    }
}