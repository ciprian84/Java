public class MilesToKm {

	public static void main(String[] args) {

		float miles = 1;
		System.out.println("Miles" + "      " + " Km");
		for (miles = 1; miles <= 10; miles++) {
			float km = (float) (miles * 1.609);
			System.out.println(miles + "      " + km);
		}

	}

}
