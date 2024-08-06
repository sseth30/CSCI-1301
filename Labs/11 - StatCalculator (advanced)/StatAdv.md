# `Stat.java` Program (Advanced)

>[!IMPORTANT]
The `Stat.java` Java program is designed to represent a statistical dataset with various methods to manipulate and obtain statistical information about the data. This lab builds upon the previous lab, Lab 10, expanding its functionality by overloading methods and handling various data types.

## Program Description

The program defines a `Stat` class with private instance variables, accessor and mutator methods, and methods to compute properties such as minimum, maximum, mode, average, variance, and standard deviation. The class is modified to handle arrays of `int`, `long`, `float`, and `double` types and to handle empty arrays and null values gracefully.

## Key Features

- **Instance Variable**: `data` (type: `double[]`)
- **Constructors**: `Stat()`, `Stat(double[] d)`, `Stat(float[] f)`, `Stat(int[] i)`, `Stat(long[] lo)`
- **Accessor and Mutator Methods**: `getData()`, `setData(double[] d)`, `setData(int[] i)`, `setData(long[] lo)`, `setData(float[] f)`
- **Append Methods**: `append(double[] d)`, `append(int[] i)`, `append(long[] lo)`, `append(float[] f)`
- **Other Methods**: `toString()`, `equals(Stat s)`, `reset()`, `isEmpty()`, `min()`, `max()`, `average()`, `mode()`, `variance()`, `standardDeviation()`

## Example Usage

### `StatTest.java` (main code example) -

```java
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

```
### `StatTest.java` (output) -
```java
stat1 data = [10.0, 10.0]
stat1 min = 10.0
stat1 max = 10.0
stat1 average = 10.0
stat1 mode = 10.0
stat1 variance = 0.0
stat1 standard deviation = 0.0

stat1 data = [10.0, 10.0, 80.0, 60.0]
stat1 min = 10.0
stat1 max = 80.0
stat1 average = 40.0
stat1 mode = 10.0
stat1 variance = 950.0
stat1 standard deviation = 30.822070014844883

