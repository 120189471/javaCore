package programlist3;

import java.util.Scanner;

/**
 * Created by Dix on 2015/12/16.
 * 杨辉三角显示
 * 1。输入显示的行数
 * 2。创建杨辉三角
 * 如果是输入行数小于2行，每个输入1
 * 如果输入超过三行，
 * 每行的YH[n][i]（i〉0，i< n-1）=YH[n-1][i]+YH[n-1][i-1]
 * 每行的YH[n][0]==YH[n][n]==1
 * 3。输出杨辉三角
 * 外循环输入行
 * 内循环输入列
 */
public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入杨辉三角的行数(在0~66范围内)");
        int rows = sc.nextInt();
        System.out.println("输出" + rows + "行杨辉三角");

        //创建杨辉三角
        long[][] YH = new long[rows][rows];

        //输入内容
       /* for (int x =0;x<=rows;x++){
            for (int y=0;y<x;y++){
                if(x<3){
                    YH[x][y]=1;
                }else if(y==0){
                    YH[x][y] =1;

                }else if(x==y){
                    YH[x][y]=1;
                }else{
                    YH[x][y]=YH[x-1][y]+YH[x-1][y-1];
                }
            }
        }*/

        if (rows <= 0&&rows<=66) {
            System.out.println("您输入的长度有误");
        } else /*if (rows <= 2 && rows > 0) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j <= i; j++) {
                    YH[i][j] = 1;

                }
            }
        } else if (rows > 2) */{
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j <= i; j++) {
                    YH[i][0] = 1;
                    YH[i][i] = 1;
                    if (i >= 2 &&j!=0&&j!=i) {
                        YH[i][j]=YH[i-1][j]+YH[i-1][j-1];
                    }
                }
            }
        }

        System.out.println("-------------------");
        //输出杨辉三角
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y <= x; y++) {
                // System.out.println(x+"  "+y);
                System.out.print(" " + YH[x][y] + " ");
                //System.out.println(YH[x][y]);
            }
            System.out.println();
        }

    }

}