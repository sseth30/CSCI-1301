// For an overview of the program and sample inputs, be sure to check out `StatAdv.md`

public class Stat {
    private double[] data;


    public Stat() {
        this.data = new double[0];
    }

    
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

    // Generic method to set data ensuring data encapsulation.
    private void setDataGeneric(double[] newData) {
        this.data = (newData == null) ? new double[0] : newData.clone();
    }


    // Set data methods for different data types converting them to double.
 // Set data methods for different data types converting them to double and handling null.
    public void setData(double[] d) {
        setDataGeneric(d); // Directly use the generic method
    }

    public void setData(int[] i) {
        if (i != null) {
            double[] newData = new double[i.length];
            for (int index = 0; index < i.length; index++) {
                newData[index] = i[index];
            }
            setDataGeneric(newData);
        } else {
            setDataGeneric(null);
        }
    }

    public void setData(float[] f) {
        if (f != null) {
            double[] newData = new double[f.length];
            for (int i = 0; i < f.length; i++) {
                newData[i] = f[i];
            }
            setDataGeneric(newData);
        } else {
            setDataGeneric(null);
        }
    }

    public void setData(long[] lo) {
        if (lo != null) {
            double[] newData = new double[lo.length];
            for (int i = 0; i < lo.length; i++) {
                newData[i] = lo[i];
            }
            setDataGeneric(newData);
        } else {
            setDataGeneric(null);
        }
    }



    // Returns a safe copy of data, protecting internal array integrity.
    public double[] getData() {
        return data.clone();
    }

    public boolean equals(Stat s) {
        if (s == null || s.data.length != this.data.length) {
            return false;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] != s.data[i]) {
                return false;
            }
        }
        return true;
    }

    public void reset() {
        this.data = new double[0]; 
    }


    public void append(double[] additionalData) {
        if (additionalData != null) {
            double[] newData = new double[data.length + additionalData.length];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            for (int i = 0; i < additionalData.length; i++) {
                newData[data.length + i] = additionalData[i];
            }
            data = newData;
        }
    }


    public void append(int[] i) {
        if (i != null) {
            double[] additionalData = new double[i.length];
            for (int j = 0; j < i.length; j++) {
                additionalData[j] = i[j];
            }
            append(additionalData);
        }
    }

    public void append(float[] f) {
        if (f != null) {
            double[] additionalData = new double[f.length];
            for (int i = 0; i < f.length; i++) {
                additionalData[i] = f[i];
            }
            append(additionalData);
        }
    }

    public void append(long[] lo) {
        if (lo != null) {
            double[] additionalData = new double[lo.length];
            for (int i = 0; i < lo.length; i++) {
                additionalData[i] = lo[i];
            }
            append(additionalData);
        }
    }

    public boolean isEmpty() {
        return data.length == 0;
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < data.length; i++) {
            result += data[i];
            if (i < data.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    public double min() {
        if (isEmpty()) return Double.NaN;
        double min = data[0];
        for (double num: data) {
            if (num < min) min = num;
        }
        return min;
    }

    public double max() {
        if (isEmpty()) return Double.NaN;
        double max = data[0];
        for (double num: data) {
            if (num > max) max = num;
        }
        return max;
    }

    public double average() {
        if (isEmpty()) return Double.NaN;
        double sum = 0;
        for (double num: data) {
            sum += num;
        }
        return sum / data.length;
    }

    public double mode() {
        if (isEmpty()) return Double.NaN;
        if (data.length == 1) return data[0];

        double mode = data[0];
        int maxCount = 1;
        for (int i = 0; i < data.length; i++) {
            int count = 1;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] == data[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = data[i];
            } else if (count == maxCount && mode != data[i]) {
                mode = Double.NaN;
            }
        }
        return maxCount > 1 ? mode : Double.NaN;
    }


    public double variance() {
        if (isEmpty()) return Double.NaN;
        double mean = average();
        double sum = 0;
        for (double num: data) {
            sum += (num - mean) * (num - mean);
        }
        return sum / data.length;
    }

    public double standardDeviation() {
        return Math.sqrt(variance());
    }
}
