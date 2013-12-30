
public class RandomNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = (int) (Math.random() * 10);
		int k = (int) (10 + Math.random() * 11); //genereaza un int intre 10 si 19 inclusiv
		int z = (int) (10 + Math.random() * 40);

		System.out.println(i);
		System.out.println(k);
		System.out.println(z);
		
		int x = 3, y = 4;
		if (y>0)
			x++;
		System.out.println(x);
	}

}
