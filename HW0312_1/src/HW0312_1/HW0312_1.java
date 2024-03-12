package HW0312_1;

import java.util.Scanner;

public class HW0312_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String st = sc.nextLine();
			String[] token = st.split(" "); //字串切割
			for(int a=token.length-1;a>=0;a--) {
				if(a==token.length-1)
					System.out.print(token[a]);
				else
					System.out.print(" "+token[a]);
			}
			System.out.println();
		}

	}

}
