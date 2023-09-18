import java.util.*;


class Sample{
	int l=0,b=0,h=0;
	Sample(int c, int d, int f){
		l=c;b=d;h=f;
	}
	int calc(){
		int s = (l+b+h)/2;
		return (int)Math.sqrt(s*(s-l)*(s-b)*(s-h));
	}
}
class Prog1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter l, b, h"+"\n");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Sample ob = new Sample(a,b,c);
		System.out.print("Area ="+ob.calc()+"\n");
	}
}
	