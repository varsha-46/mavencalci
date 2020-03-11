package EPAM_ASSIGNMENT.Calculator;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
	static Double add(double a,double b) {
		return a+b;
	}
	static Double sub(double a,double b) {
		return a-b;
	}
	static Double mul(double a,double b) {
		return a*b;
	}
	static Double div(double a,double b) {
		return a/b;
	}
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	Scanner sc=new Scanner(System.in);
    	char c=sc.next(".").charAt(0);
    	switch(c) {
    	case '+':System.out.println(add(3,4));
    	break;
    	case '-':System.out.println(sub(3,2));
    	break;
    	case '*':System.out.println(mul(3,4));
    	break;
    	case '/':System.out.println(div(32,4));
    	break;
    	default:
    		break;
    	
    	}
    }
}
