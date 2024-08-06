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

### Stat.java

```java
// Name: [Your Name]
// Date: [Date]
// Program Purpose: Define a Stat class with various methods to handle statistical data
// Statement of Academic Honesty: [Your statement]

public class Stat {
    private double[] data;

    // Default constructor
    public Stat() {
        data = new double[]{};
    }

    // Parameterized constructors
    public Stat(double[] d) {
        setData(d);
    }

    public Stat(float[] f) {
        setData(f);
    }

    public Stat(int[] i) {
        setData(i);
    }

    public Stat(long[] lo) {
        setData(lo);
    }

    // Accessor method
    public double[] getData() {
        double[] copy = new double[data.length];
        System.arraycopy(data, 0, copy, 0, data.length);
        return copy;
    }

    // Mutator methods
    public void setData(double[] d) {
        if (d == null) {
            data = new double[]{};
        } else {
            data = new double[d.length];
            System.arraycopy(d, 0, data, 0, d.length);
        }
    }

    public void setData(float[] f) {
        if (f == null) {
            data = new double[]{};
        } else {
            data = new double[f.length];
            for (int i = 0; i < f.length; i++) {
                data[i] = f[i];
            }
        }
    }

    public void setData(int[] i) {
        if (i == null) {
            data = new double[]{};
        } else {
            data = new double[i.length];
            for (int j = 0; j < i.length; j++) {
                data[j] = i[j];
            }
        }
    }

    public void setData(long[] lo) {
        if (lo == null) {
            data = new double[]{};
        } else {
            data = new double[lo.length];
            for (int i = 0; i < lo.length; i++) {
                data[i] = lo[i];
            }
        }
    }

    // Append methods
    public void append(double[] d) {
        if (d == null) {
            return;
        }
        double[] newData = new double[data.length + d.length];
        System.arraycopy(data, 0, newData, 0, data.length);
        System.arraycopy(d, 0, newData, data.length, d.length);
        data = newData;
    }

    public void append(float[] f) {
        if (f == null) {
            return;
        }
        double[] newData = new double[data.length + f.length];
        System.arraycopy(data, 0, newData, 0, data.length);
        for (int i = 0; i < f.length; i++) {
            newData[data.length + i] = f[i];
        }
        data = newData;
    }

    public void append(int[] i) {
        if (i == null) {
            return;
        }
        double[] newData = new double[data.length + i.length];
        System.arraycopy(data, 0, newData, 0, data.length);
        for (int j = 0; j < i.length; j++) {
            newData[data.length + j] = i[j];
        }
        data = newData;
    }

    public void append(long[] lo) {
        if (lo == null) {
            return;
        }
        double[] newData = new double[data.length + lo.length];
        System.arraycopy(data, 0, newData, 0, data.length);
        for (int i = 0; i < lo.length; i++) {
            newData[data.length + i] = lo[i];
        }
        data = newData;
    }

    // Equals method
    public boolean equals(Stat s) {
        if (s == null || this.data.length != s.data.length) {
            return false;
        }
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] != s.data[i]) {
                return false;
            }
        }
        return true;
    }

    // Reset method
    public void reset() {
        data = new double[]{};
    }

    // IsEmpty method
    public boolean isEmpty() {
        return data.length == 0;
    }

    // toString method
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < data.length; i++) {
            sb.append(data[i]);
            if (i < data.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Method to find minimum
    public double min() {
        if (data.length == 0) {
            return Double.NaN;
        }
        double min = data[0];
        for (double v : data) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }

    // Method to find maximum
    public double max() {
        if (data.length == 0) {
            return Double.NaN;
        }
        double max = data[0];
        for (double v : data) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

    // Method to find average
    public double average() {
        if (data.length == 0) {
            return Double.NaN;
        }
        double sum = 0;
        for (double v : data) {
            sum += v;
        }
        return sum / data.length;
    }

    // Method to find mode
    public double mode() {
        if (data.length == 0) {
            return Double.NaN;
        }
        double mode = Double.NaN;
        int maxCount = 0;
        for (double v : data) {
            int count = 0;
            for (double w : data) {
                if (w == v) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = v;
            }
        }
        if (maxCount == 1) {
            return Double.NaN;  // No mode found
        }
        return mode;
    }

    // Method to find variance
    public double variance() {
        if (data.length == 0) {
            return Double.NaN;
        }
        double mean = average();
        double sum = 0;
        for (double v : data) {
            sum += Math.pow(v - mean, 2);
        }
        return sum / data.length;
    }

    // Method to find standard deviation
    public double standardDeviation() {
        return Math.sqrt(variance());
    }
}
