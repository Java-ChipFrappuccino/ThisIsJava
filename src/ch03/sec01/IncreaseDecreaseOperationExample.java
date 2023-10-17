package ch03.sec01;

	public class IncreaseDecreaseOperationExample {
		public static void main(String[] args) {
			int x = 10;
			int y = 10;
			int z;
			
			x++;
			++x;
			System.out.println("x=" + x);
			System.out.println("\n------------------\n");
			
			y--;
			--y;
			System.out.println("y=" + y);
			System.out.println("\n------------------\n");
			
			z = x++;
			System.out.println("z=" +z);
			System.out.println("x=" +x);
			System.out.println("\n------------------\n");
			
			z = ++x;
			System.out.println("z=" +z);
			System.out.println("x=" +x);
			System.out.println("\n------------------\n");
			
			z = ++x + y++;
			System.out.println("z=" +z);
			System.out.println("x=" +x);
			System.out.println("y=" +y);
		}

}
