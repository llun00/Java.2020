//draft
import org.w3c.dom.ls.LSOutput;

public class Chess {

    public void knightMove(int x, int y, int indexX, int indexY){
        int[][] moves = new int[][];


        if (x > 8 || y > 8 || x < 1 || y < 1){
            System.out.println("конец доски");
            return;
        }
        if (x == 1){
            moves[indexX][indexY] = x + 2;
            moves[indexX][indexY + 1] = y + 1;
            return knightMove(x + 2, y + 1, indexX + 1, indexY + 1);

        }
        if (x == 8){
            moves[indexX][indexY] = x - 2;
            moves[indexX][indexY + 1] = y - 1;
            return knightMove(x - 2, y - 1, indexX + 1, indexY + 1);

        }

        if (y == 8){

        }

        if (y == 1){

        }

        if (moves ;)

        public static void main(String[] args) {
            System.out.println( );




        }
    }


}
