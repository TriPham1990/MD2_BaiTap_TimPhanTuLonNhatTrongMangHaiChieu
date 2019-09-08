public class MaxArrayTwoWay {
    public static void maxArrayTwoWay(int[][] arrays) {
        int indexRow = 0;
        int indexColumn = 0;
        int max = arrays[indexRow][indexColumn];

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (arrays[i][j] > max) {
                    max = arrays[i][j];
                    indexRow = i;
                    indexColumn = j;
                }
            }
        }

        System.out.println("Largest value of the array : " + arrays[indexRow][indexColumn]);
        System.out.println("At position");
        System.out.println("Row = " + indexRow);
        System.out.println("Column = " + indexColumn);
    }
}
