package randomProblem;

public class matrix {
    public static void main(String[] args){
        int[][] mat={{1,4,7},{2,5,8},{3,6,9}} ;
        for(int i=0;i<mat[0].length;i++){
            for(int j=0;j<mat.length;j++){
//                if(i == j)
                System.out.print(mat[i][j] + " ");
            }
        }
    }

}
