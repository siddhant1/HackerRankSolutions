import java.util.Scanner;

public class HackerRankEndOfFIle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i=1;
		while(scanner.hasNext()==true)
		{    
			
			String input = scanner.nextLine();
			
			System.out.println(i+" "+input);
			i++;
		}
	}

}
