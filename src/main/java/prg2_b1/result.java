package prg2_b1;

public class result {
	public static String display(int m) {
		if(m%2==0)
			return "even";
		else
			return "odd";
	}
	public static void main(String[] args) {
		System.out.print(display(4));
	}

}
