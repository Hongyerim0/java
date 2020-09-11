package QUiz;
import java.util.Scanner;
public class calcswitch {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
		System.out.print("연산>>"); 
		int op1=s.nextInt(); 
		String op=s.next(); 
		int op2=s.nextInt(); 
		int res=0;
		switch(op) { 
		case "+": 
			res=op1+op2; 
		break;
		case "-": 
			res=op1*op2; 
			case "*": 
				res=op1*op2;
				case "/": 
					if(op2==0) {
						System.out.print("0으로 나눌수없다");
						s.close(); 
					}
					res=op1/op2;
						break; 
				default: 
						System.out.print("사칙연산이아닙니다."); 
						s.close(); 
						break; 
		} 
		System.out.print(op1+op+op2+"의 계산결과는"+res);
		s.close(); }


}
