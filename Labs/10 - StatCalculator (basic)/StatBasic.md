# `Stat.java` Program (Basic)

>[!IMPORTANT]
The `Stat.java` Java program is designed to represent a statistical dataset with various methods to manipulate and obtain statistical information about the data. It is part of Lab 10, which focuses on classes, objects, and methods, fundamental concepts of Object-Oriented Programming (OOP).
>This lab may be considered a more elementary version of Lab 11.

## Program Description

The program defines a `Stat` class with private instance variables, accessor and mutator methods, and methods to compute basic statistical properties such as minimum, maximum, mode, and average. The program also helps compare data from more than one data set.

## Key Features

- **Instance Variable**: `data` (type: `double[]`)
- **Constructors**: `Stat()`, `Stat(double[] d)`
- **Accessor and Mutator Methods**: `getData()`, `setData(double[] d)`
- **Other Methods**: `toString()`, `equals(Stat s)`, `min()`, `max()`, `average()`, `mode()`

## Example Usage

### `StatTest.java` (main code example) -

```java
public class StatTest {
	public static void main(String[] args) {
		double[] data = {-5.3, 2.5, 88.9, 0, 0.0, 28, 16.5, 88.9, 109.5, -90, 88.9};
		double[] data2 = {100.34, 50.01, 50.01, -8};
		Stat stat1 = new Stat();
		System.out.println("stat1 data = " + stat1.toString());
		stat1 = new Stat(data);
		System.out.println("stat1 has been altered.");
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode() + "\n");
		Stat stat2 = new Stat();
		stat2.setData(data2);
		Stat stat3 = new Stat(stat1.getData());
		System.out.println("stat2 data = " + stat2.toString());
		System.out.println("stat3 data = " + stat3.toString());
		System.out.println();
		System.out.println("stat1 is equal to stat2 using \"equals()\"? " +
		stat1.equals(stat2));
		System.out.println("stat1 is equal to stat3 using \"equals()\"? " +
		stat1.equals(stat3));
		System.out.println("stat1 is equal to stat3 using \"==\"? " + (stat1 == stat3));
	}

}
```
### `StatTest.java` (output) -
```java
stat1 data = [0.0]
stat1 has been altered.
stat1 data = [-5.3, 2.5, 88.9, 0.0, 0.0, 28.0, 16.5, 88.9, 109.5, -90.0, 88.9]
stat1 min = -90.0
stat1 max = 109.5
stat1 average = 29.80909090909091
stat1 mode = 88.9

stat2 data = [100.34, 50.01, 50.01, -8.0]
stat3 data = [-5.3, 2.5, 88.9, 0.0, 0.0, 28.0, 16.5, 88.9, 109.5, -90.0, 88.9]

stat1 is equal to stat2 using "equals()"? false
stat1 is equal to stat3 using "equals()"? true
stat1 is equal to stat3 using "=="? false

