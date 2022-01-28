public class NatrualNums {
    public static void main(String[] args) {
        //print every ordered pair of natural nums
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < j+1; j++){
                if (j < 10) {
                    System.out.print("(" + i + "," + j + ") ");
                }else {
                    break;
                }
            }
            System.out.println();
        }
    }
}
