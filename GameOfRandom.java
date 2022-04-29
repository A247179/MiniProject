package tutorial;
import java.util.Scanner;
import java.util.Random;
class GameOfRandom{
	public static void main(String [] args) {
	Random random=new Random();
	int x=random.nextInt(10);
	int a=random.nextInt(10);
	int b=random.nextInt(10);
	int c=random.nextInt(10);
	int d=random.nextInt(10);
	int y=0;
	int z=0;
	int u=0;
	int v=0;
	int p=0;
	int TotalScore=0;
	Scanner sc=new Scanner(System.in);
	boolean flag=false;
	System.out.println(x);
	System.out.println("--------Enter Your Random Number And Guess Correctly: --------");
	System.out.println("--------Hint: Number Lies Between "+(x-10)+" To "+(x+23)+" --------");
	System.out.println();
	while(y<10) {
    System.out.println("---For Level 1---");
    System.out.println();
	System.out.print("--------Your Number Is: ");
	int num1=sc.nextInt();
	if(num1==x) {
		System.out.println("--------Congratulation! Your Guess Is Correct--------");
		System.out.println();
		TotalScore+=10;
		System.out.println("--------Your Total Score Is: "+TotalScore);
		System.out.println();
		System.out.println();
		System.out.println("-------Congratulation! Level 1 Completed--------");
		flag=true;
		break;
	            }
	else {
		System.out.println("--------Sorry! Your Guess Is Incorrect--------");
		System.out.println();
	     }
	if(y==9) {
	System.out.println("---------Sorry You Try All Your Rest Attempt Please Try Again Later!--------");
	         }
	y++;
	   }
	if(flag==true) {
		System.out.println(a);
		System.out.println("--------Hint: Number Lies Between "+(a-10)+" To "+(a+10)+" --------");
		System.out.println();
	while(z<10) {
	    System.out.println("---For Level 2---");
	    System.out.println();
		System.out.print("--------Your Number Is: ");
		int num1=sc.nextInt();
		if(num1==a) {
			System.out.println("--------Congratulation! Your Guess Is Correct--------");
			System.out.println();
			TotalScore+=10;
			System.out.println("--------Your Total Score Is: "+TotalScore);
			System.out.println();
			System.out.println();
			System.out.println("-------Congratulation! Level 2 Completed--------");
			flag=true;
			break;
		            }
		else {
			System.out.println("--------Sorry! Your Guess Is Incorrect--------");
			System.out.println();
		     }
		if(z==9) {
		System.out.println("---------Sorry You Try All Your Rest Attempt Please Try Again Later!--------");
		         }
		z++;
		   }
	    }
	
	if(flag==true) {
		System.out.println(b);
		System.out.println("--------Hint: Number Lies Between "+(b-10)+" To "+(b+10)+" --------");
		System.out.println();
	while(u<10) {
	    System.out.println("---For Level 3---");
	    System.out.println();
		System.out.print("--------Your Number Is: ");
		int num1=sc.nextInt();
		if(num1==b) {
			System.out.println("--------Congratulation! Your Guess Is Correct--------");
			System.out.println();
			TotalScore+=10;
			System.out.println("--------Your Total Score Is: "+TotalScore);
			System.out.println();
			System.out.println();
			System.out.println("-------Congratulation! Level 3 Completed--------");
			break;
		            }
		else {
			System.out.println("--------Sorry! Your Guess Is Incorrect--------");
			System.out.println();
		     }
		if(u==9) {
		System.out.println("---------Sorry You Try All Your Rest Attempt Please Try Again Later!--------");
		         }
		u++;
		   }
	    }
	if(flag==true) {
		System.out.println(c);
		System.out.println("--------Hint: Number Lies Between "+(c-10)+" To "+(c+10)+" --------");
		System.out.println();
	while(v<10) {
	    System.out.println("---For Level 4---");
	    System.out.println();
		System.out.print("--------Your Number Is: ");
		int num1=sc.nextInt();
		if(num1==c) {
			System.out.println("--------Congratulation! Your Guess Is Correct--------");
			System.out.println();
			TotalScore+=10;
			System.out.println("--------Your Total Score Is: "+TotalScore);
			System.out.println();
			System.out.println();
			System.out.println("-------Congratulation! Level 4 Completed--------");
			break;
		            }
		else {
			System.out.println("--------Sorry! Your Guess Is Incorrect--------");
			System.out.println();
		     }
		if(v==9) {
		System.out.println("---------Sorry You Try All Your Rest Attempt Please Try Again Later!--------");
		         }
		v++;
		   }
	    }
	if(flag==true) {
		System.out.println(d);
		System.out.println("--------Hint: Number Lies Between "+(d-10)+" To "+(d+10)+" --------");
		System.out.println();
	while(p<10) {
	    System.out.println("---For Level 5---");
	    System.out.println();
		System.out.print("--------Your Number Is: ");
		int num1=sc.nextInt();
		if(num1==d) {
			System.out.println("--------Congratulation! Your Guess Is Correct--------");
			System.out.println();
			TotalScore+=10;
			System.out.println("--------Your Total Score Is: "+TotalScore);
			System.out.println();
			System.out.println();
			System.out.println("-------Congratulation! Level 5 Completed--------");
			System.out.println("--------You Passed All Level");
			break;
		            }
		else {
			System.out.println("--------Sorry! Your Guess Is Incorrect--------");
			System.out.println();
		     }
		if(p==9) {
		System.out.println("---------Sorry You Try All Your Rest Attempt Please Try Again Later!--------");
		         }
		p++;
		   }
	    }
	}
}