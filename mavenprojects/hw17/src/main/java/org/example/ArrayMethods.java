package org.example;

public class ArrayMethods {
    public int[] getArrAfterLastFour(int[] arr) throws EmptyArrayException {
        if(arr.length == 0) throw new EmptyArrayException();

        int lastOccurrence = -1;
        for(int i = arr.length - 1; i >= 0; --i) {
            if(arr[i] == 4) {
                lastOccurrence = i;
                break;
            }
        }

        if(lastOccurrence == -1) throw new RuntimeException();

        int[] newArr = new int[arr.length - 1 - lastOccurrence];
        System.arraycopy(arr, lastOccurrence + 1, newArr, 0, arr.length - 1 - lastOccurrence);

        return newArr;
    }

    public boolean isOneFourOnlyInArr(int[] arr) {
        boolean one = false;
        boolean four = false;
        for(int i: arr) {
            if(i != 4 && i != 1) return false;

            if(!one && i == 1) one = true;
            if(!four && i == 4) four = true;
        }

        return one && four;
    }
}
