import java.util.Arrays;

/**
 * Fixed-capacity array operations: insert, delete, search, and display.
 */
public class ArrayOperations {
    private final int[] data = new int[100];
    private int size = 0;

    public boolean insert(int value) {
        if (size >= data.length) {
            System.out.println("Array is full.");
            return false;
        }
        data[size++] = value;
        return true;
    }

    public boolean delete(int value) {
        int index = search(value);
        if (index == -1) return false;
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return true;
    }

    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) return i;
        }
        return -1;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.println(Arrays.toString(Arrays.copyOf(data, size)));
    }

    public int[] getValues() {
        return Arrays.copyOf(data, size);
    }

    public int size() {
        return size;
    }
}
