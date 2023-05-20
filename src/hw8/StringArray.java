package hw8;

import java.util.Arrays;

public class StringArray {
    private String[] arr;

    public StringArray() {
        arr = new String[0];
    }

    public boolean add(int index, String value) {
        if (index > arr.length || index < 0) return false;

        String[] newArr = new String[arr.length + 1];
        for (int i = 0, j=0; i < newArr.length; ++i, ++j) {
            if (i == index) {
                newArr[i] = value;
                --j;
                continue;
            }
            newArr[i] = arr[j];
        }
        arr = newArr;
        return true;
    }
    public boolean add(String value) {
        return add(arr.length, value);
    }
    public boolean delete(int index) {
        if (index >= arr.length || index<0) return false;

        String[] newArr = new String[arr.length - 1];
        for (int i = 0, j=0; i < newArr.length; ++i, ++j) {
            if (i == index) {
                ++j;
            }
            newArr[i] = arr[j];
        }
        arr = newArr;

        return true;
    }

    public boolean delete(String value) {
        for (int i = 0; i < arr.length; ++i) {
            if(arr[i].equals(value)) {
                return delete(i);
            }
        }
        return false;
    }

    public String get(int index) {
        if (index >= arr.length || index<0) return "-1";
        return arr[index];
    }

    @Override
    public String toString() {
        return "arr=" + Arrays.toString(arr);
    }

    public int size() {
        return arr.length;
    }
}

