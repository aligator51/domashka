public class CLDemo {

	public static void main(String[] args) {
		
		System.out.println("Была передана комманда длинной в " + args.length + " аргумента(ов)");

		System.out.println("Аргументы:");
		for(int i = 0; i < args.length; i ++) {
			System.out.println("arg[" + i + "]: " + args[i]);
		}
	}

}

