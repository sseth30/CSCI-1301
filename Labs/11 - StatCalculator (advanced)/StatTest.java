// For an overview of the program and sample inputs, be sure to check out `StatAdv.md`
// This is an EXAMPLE of a POSSIBLE main method highlighted in `StatAdv.md`

public class StatTest {
	public static void main(String[] args) {
		float[] data1 = {10.0F,10.0F};
		Stat stat1 = new Stat(data1);
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 variance = " + stat1.variance());
		System.out.println("stat1 standard deviation = " + stat1.standardDeviation() + "\n");
		long[] data2 = {80L, 60L};
		stat1.append(data2);
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 variance = " + stat1.variance());
		System.out.println("stat1 standard deviation = " + stat1.standardDeviation() + "\n");
	}

}
