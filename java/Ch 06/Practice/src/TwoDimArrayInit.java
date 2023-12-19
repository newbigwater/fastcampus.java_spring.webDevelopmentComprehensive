public class TwoDimArrayInit {
    public static void main(String[] args) {
        int[][] arr2D = new int [][] {
                {0}
                , {0, 1}
                , {0, 1, 2}
                , {0, 1, 2, 3}
                , {0, 1, 2, 3, 4}
        };

        for(int i = 0; i < arr2D.length; i++)
        {
            System.out.print("ROW[" + i + "] ");
            for(int j = 0; j < arr2D[i].length; j++)
            {
                System.out.print("COL[" + j + "]" + arr2D[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
