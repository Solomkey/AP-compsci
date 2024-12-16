package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three){
		
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	public static void specialSquare(int x){
		int found=0;
		int y=1;
		while(found<x){
			int sum = y*(y+1)/2;
			int root=(int)Math.sqrt(sum);
			
			if(root*root==sum){
				System.out.println(sum);
				found++;
			}
			y++;
		}
	}
}

