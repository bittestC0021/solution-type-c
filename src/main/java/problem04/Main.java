package problem04;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		String cal[] = new String[18];
		int intcal[] = new int[18];
		String tmpcal[] = new String[18];
		int cnt=1;
		for(int i=0; i<18; i+=2) {
			
			cal[i]=Integer.toString(cnt)+"*"+Integer.toString(random(9));
			cal[i+1]=Integer.toString(cnt)+"*"+Integer.toString(random(9));
			cnt++;
		}
		for(int i=0; i<18; i+=2) {
			System.out.print(cal[i]+", ");
			System.out.println(cal[i+1]);
		}

	}
	public static int random(int len) {
		int random = new Random().nextInt(len)+1;
		return random;
	}
	
}
