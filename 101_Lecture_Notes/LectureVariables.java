/* 
    Lecture note example - Variables (String, int, double)
*/

class LectureVariables{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        String name;     //Constructed
        name = new String("Joe");    //Initializing
        String name2 = new String ("Bob");
        int num;
        num = 3;
        double money; 
        money = 45.79;
        
        System.out.println(name + " lives in Tennessee");
        System.out.println(name + " has " + num + " pets!");
        System.out.println(name + " has $" + money + " dollars to feed his " + num + " pets");
	}
}