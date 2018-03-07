package intro.Task01_4;

public class OneDimArray {
    private double[] array;

    public OneDimArray(int size, double borderValue) {
        array = new double[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * borderValue;
        }
    }

    public double findMax() {
        double max = 0;
        double sum;
        for (int i = 0; i < array.length / 2 + 1; i++) {
            sum = array[i] + array[array.length - 1 - i];
            if (sum > max)
                max = sum;
        }
        return max;
    }

    public static void main(String[] args) {
        OneDimArray newArray = new OneDimArray(5, 6.0);
        for (double i : newArray.array) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + newArray.findMax());
    }


}
