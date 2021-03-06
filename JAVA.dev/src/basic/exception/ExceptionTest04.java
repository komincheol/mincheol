package basic.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest04 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("1~99사이의 정수를 입력하세요>");
		int n = -1;
		try{
		n= sc.nextInt();
		System.out.println("n:"+n);
		if(!(n<1||99<n)){ throw new InputMismatchException("잘못된 입력입니다.");
		}
		System.out.println("입력된 값은 "+n);
		}catch (Exception e){
			System.out.println("에러:"+e.getMessage());
		}
	}
}
