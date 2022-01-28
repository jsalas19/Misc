public class ExamReview {
    public static void main(String[] args) {
        int[][] array = {
                {0,1,2},
                {3,4,5},
                {6,7,8},
        };

        int[][] array2 = {
                {0,2},
                {5},
                {6,7,8},
        };

        int[] array3 = {0,1,2,3,4,5,6,7};
        int n = add(array);
        System.out.println("first problem: " + n);

        int z = colCounter(array2, 2);
        System.out.println("second problem: " + z);

        double h = halfaverage(array3);
        System.out.println("third problem: " + h);

        int y = addRowCol(array,2,0);
        System.out.println("fourth problem: " + y);


    }

    public static int add(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length;i++){
            sum += array[i][i];
        }
        return sum;
    }

    public static int colCounter(int[][] array2, int index){
        int sum = 0;
        for(int i =0; i<array2.length;i++){
            for (int j = 0; j< array2[i].length;j++){
                if(j==index){
                    sum += 1;
                }
            }
        }
        return sum;
    }

    public static double halfaverage(int[] array3){
        int k = array3.length/2;
        double sum = 0;
        for (int i = 0; i<k; i++){
            sum += array3[i];
        }
        return sum/k;
    }

    public static int addRowCol(int[][] array, int row, int col){
        int sum = 0;
        for (int i = 0; i<array.length;i++){
            if(i == row){
                sum += array[i][col];
            }
            for(int j = 0; j<array[i].length;j++){
                if(j == col){
                    sum += array[row][j];
                }
            }
        }
        return sum;
    }
}
