﻿package ex;
/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021013
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn = new Scanner(System.in);
       System.out.println("輸入正整數n:");
       int n = scn.nextInt();
       int a = 1,sum = 1;
       while(a<=n){
    	   sum*=a;
       a++;    
    			 
       }
       System.out.println(sum);
	}

}
