import java.util.Scanner;

class Prog2{
	int a=0, b=0, c=0;
	Prog2(int r){ a = r;}
	Prog2(int l, int h){a=l;b=h;}
	Prog2(int p , int q, int r){a=p;b=q;c=r;}
	
	float area(){
		if(b==0 && c == 0)
			return (float)Math.PI * (a*a);
		else if(c==0)
			return (float)a*b;
		else{
			int s = (a+b+c)/2;
			return (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a=0,b=0,c=0;
		System.out.print("Enter vars:");
		a = sc.nextInt();
		Prog2 ob = new Prog2(a);
		b = sc.nextInt();
		Prog2 ob2 = new Prog2(a,b);
		c = sc.nextInt();
		Prog2 ob3 = new Prog2(a,b,c);
		System.out.println("Circle :"+ob.area()+"\nRect: "+ob2.area()+"\nTriang: "+ob3.area()+"\n");
	}
}
		
		