/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        printAnimal();
        greeting("solomon");
        greeting("poaisjfd");
        double pay=raiseSalary(3.28746848, 90100); //return stores data in raiseSalary, need to create a variable or system.out.print it
        System.out.println(pay);
        pay = raiseSalary(pay,5);
        System.out.print(pay);
        
    }
    
    public static void greeting(String name){
        System.out.println("greetings "+name);
    }
    
    public static double raiseSalary(double salary, int percent){
        double raisedSalary = salary + (salary * (percent/100.0));
        return raisedSalary;
    }
	
	public static void printAnimal(){
	    System.out.println("__v_");
	    System.out.println("(____\\/{");
	    System.out.println("");
	}
	
}
