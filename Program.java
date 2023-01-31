import java.util.Scanner;

public class Program{
	public static void main (String[] args){
		
		Scanner st = new Scanner(System.in);
		System.out.print("Input a Hight: ");
		int hig = st.nextInt();

		System.out.print("Input a Width: ");
		int wid = st.nextInt();

		System.out.print("Input a X: ");
		int x = st.nextInt();

		System.out.print("Input a Y: ");
		int y = st.nextInt();
		
		rectangle cl = new rectangle(hig, wid, x, y);
		System.out.println(cl);

		System.out.print("Input a N: ");
		int n = st.nextInt();
		
		cl.zoom(n);
		System.out.println(cl);

		System.out.print("X coordinate of the point to be checked: ");
		int x_c = st.nextInt();
	
		System.out.print("Y coordinate of the point to be checked: ");
		int y_c = st.nextInt();

		cl.check(x_c, y_c);
		st.close();
	}
}

class rectangle{

	private int hight;
	private int width;
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int x3;
	private int y3;
	private int x4;
	private int y4;

	public rectangle(int hig, int wid, int x, int y){
		hight = hig;
		width = wid;
		x1 = x;
		y1 = y;
		x2 = x1 + hight;
		y2 = y1; 
		x3 = x2;
		y3 = y2 - width;
		x4 = x3 - hight;
		y4 = y3;
	}
	
	public String toString() {
		String text = "\nHigth: " + hight + "\nWidth: " + width + "\n(" + x1 + "; " + y1 + ")" + "\n(" + x2 + "; " + y2 + ")" + "\n(" + x3 + "; " + y3 + ")" + "\n(" + x4 + "; " + y4 + ")\n";
		return text;
	}
	
	public void zoom (int n) {
		hight = hight * n;
		width = width * n;
		x2 = x1 + hight;
		y2 = y1; 
		x3 = x2;
		y3 = y2 - width;
		x4 = x3 - hight;
		y4 = y3;
	}
	
	public void check (int x, int y){
		if (x1 < x && x < x2 && y1 > y && y > x4){
			System.out.print("NO");
		}
		else{
			System.out.print("NO");
		}
	}
}