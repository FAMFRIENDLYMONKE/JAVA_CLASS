//wap to multiply two nxn matrices

import java.util.Scanner;

class Sample{
    void calc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r,c of 1st matrix");
        int r1 = sc.nextInt();
        int c1= sc.nextInt();
        System.out.println("Enter r,c of 2st matrix");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if(r1 != c2) 
            System.out.println("Not Possible");
        else {       

        int[][] arr1 = new int[r1][c1];
        int[][] arr2 = new int[r2][c2];
        int[][] arr3 = new int[r2][c1];
        
        System.out.println("Enter array 1:");
        for(int i= 0; i< r1; i++)
            for(int j = 0; j< c1; j++)  arr1[i][j] = sc.nextInt();
        
        for(int i= 0; i< r1; i++)
            for(int j = 0; j< c1; j++)  arr1[i][j] = sc.nextInt();
        
        for(int i =0; i< r2; i++){
            for(int j = 0; j < r1; j++)
            {
                for(int k = 0; k < c2; k++)
                {
                    arr3[i][j] += arr1[j][k] * arr2[k][j];
                }
            }
        }

        for(int i= 0; i< r1; i++){
            for(int j = 0; j< c1; j++) {
                System.out.println(arr3[i][j]);
            }
            System.out.println("");
        }
    }
    sc.close();
 }
}
class Prog1{
    public static void main(String args[]){
        Sample mat = new Sample();
        mat.calc();
            
    }
}