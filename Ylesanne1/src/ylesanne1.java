public class ylesanne1 {
    public static void main(String[] args) {
        int size = 10;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if(col > row){
                    System.out.format("%2d", size - 1 - col);
                } else {
                    System.out.format("%2d", size - 1 - row);
                }
            }
            System.out.println();
        }
    }
}