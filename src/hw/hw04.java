package hw;
import java.util.Scanner;
public class hw04 {
//讓使用者輸入一正整數n，計算1/(1*2)+1/(3*4)+1/(5*6)+…+1/[(2n-1)*(2n)]並輸出結果
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("輸入正整數n:");
        float n = scn.nextInt();
        float sum = 0;
        for(float i=1;i<=n;i++){
        	sum=sum+1/((n-1)*n);
	}
System.out.println(sum);
	}
}
