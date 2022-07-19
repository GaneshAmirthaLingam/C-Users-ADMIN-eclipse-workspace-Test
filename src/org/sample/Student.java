package org.sample;

public class Student {
	
	
	
public static void main(String[] args) {


int a[]= {35,20,7,45,9,6};
System.out.println(a);
int [] len = new int [6];
System.out.println(len);
len[0]=35;
len[1]=20;
len[2]=7;
len[3]=45;
len[4]=9;
len[5]=6;
System.out.println(len);
for (int i = 0; i < a.length; i++) {
	if (i%2>=10) {
		System.out.println("smaller number + order");
		
	}else if(i%2<=50) {
		System.out.println("bigger number + order");
		
	}
}









}
}
