package hw;
import java.util.Scanner;
public class hw04 {
//���ϥΪ̿�J�@�����n�A�p��1/(1*2)+1/(3*4)+1/(5*6)+�K+1/[(2n-1)*(2n)]�ÿ�X���G
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("��J�����n:");
        float n = scn.nextInt();
        float sum = 0;
        for(float i=1;i<=n;i++){
        	sum=sum+1/((n-1)*n);
	}
System.out.println(sum);
	}
}
