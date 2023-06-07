package hw14;

public class ArrayValueCalculator {
    public int doCalc(String[][] mtx) throws ArraySizeException, ArrayDataException {
        if(mtx.length!=4) throw new ArraySizeException();

        for(String[] strings: mtx) {
            if(strings.length != 4) throw new ArraySizeException();
        }

        int sum = 0;
        for(int i = 0; i < mtx.length; ++i) {
            for(int j = 0; j < mtx[i].length; ++j) {
                try {
                    sum += Integer.parseInt(mtx[i][j]);
                } catch (Exception e) {
                    throw new ArrayDataException(String.format("Помилка. Комірка [%s][%s]=\"%s\"", i, j, mtx[i][j]));
                }
            }
        }
        return sum;
    }
}
