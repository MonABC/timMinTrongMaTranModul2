import java.util.Scanner;

public class timMinTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int i,j;
        System.out.println("nhap so hang cua ma tran");
        i=input.nextInt();
        System.out.println("nhap so cot cua ma tran");
        j=input.nextInt();

        int maTran[][]=new int[i][j];
        for (int a=0; a<i; a++){
            for (int b=0; b<j; b++){
                System.out.println("maTran["+a+"]["+b+"]=");
                maTran[a][b]=input.nextInt();
            }
        }
        int min=maTran[0][0];
        for (int a=0; a<i; a++){
            for (int b=0; b<j; b++){
                if (min>maTran[a][b]){
                    min=maTran[a][b];
                }
            }
        }
        System.out.println("phan tu nho nhat trong ma tran 2 chieu la: "+min);
    }
}
