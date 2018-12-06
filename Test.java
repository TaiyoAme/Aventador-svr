
public class Test {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		for (int i = a; i <7; i++) {
			for (int j = b; j<7; j++) {
				System.out.print(i+""+j+" ");
				
				
			}
			System.out.println();
			a++;
			b++;
		}
		Window w = new Window();
		w.startView();
	}	

}
