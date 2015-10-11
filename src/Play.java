import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;


public class Play {
	public static void main(String[] args) throws IOException{
		 int[] pick={23,43,12,43,54,2,47,87,21,1};
		 System.out.println("Each participant should chose a value between 0-9");
		 BufferedReader buffer= new BufferedReader(new InputStreamReader(System.in));
	     System.out.println("Participant -1 ");
		 int  val1=Integer.parseInt(buffer.readLine());
		 System.out.println("Participant -2 ");
		 int val2=Integer.parseInt(buffer.readLine());
		 if(pick[val1]>pick[val2])
			 System.out.println("Participant -1 is the winner");
		 if(pick[val2]>pick[val1])
			 System.out.println("Participant -1 is the winner");
	}

}
