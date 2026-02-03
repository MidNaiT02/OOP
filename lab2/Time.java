import java.util.Scanner;
public class Time {
	
	private int hour;
	private int minute;
	private int second;

	public Time(int h, int m, int s){
		this.hour=h;
		this.minute=m;
		this.second=s;
	}

	public String toUniversal()
	{
		StringBuilder sb=new StringBuilder();
		if(hour<10) sb.append("0:"+hour+":");
		else sb.append(hour+":");

		if(minute<10) sb.append("0:"+minute+":");
		else sb.append(minute+":");

		if(second<10) sb.append("0:"+second);
		else sb.append(second);

		return sb.toString();
	}

	public String toStandard()
	{	boolean ok=false;
		StringBuilder sb=new StringBuilder();

		if(hour>12)
		{
			ok=true;
			hour=hour-12;
		}
		if(hour<10) sb.append("0:"+hour+":");
		else sb.append(hour+":");

		if(minute<10) sb.append("0:"+minute+":");
		else sb.append(minute+":");

		if(second<10) sb.append("0:"+second);
		else sb.append(second);

		if(!ok) sb.append(" AM");
		else sb.append(" PM");

		return sb.toString();
	}

	public Time add( Time t1, Time t2)
	{
		int newhour=t1.hour+t2.hour;
		int newminute=t1.minute+t2.minute;
		int newsecond=t1.second+t2.second;
		if (newsecond >= 60) {
	        newsecond -= 60;
	        newminute++;
	    }

	    if (newminute >= 60) {
	        newminute -= 60;
	        newhour++;
	    }

	    if (newhour >= 24) {
	        newhour -= 24;
	    }

	    return new Time(newhour, newminute, newsecond);
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter hour,minute and second for first time");
	int h1=sc.nextInt();
	int m1=sc.nextInt();
	int s1=sc.nextInt();
	Time t1=new Time(h1,m1,s1);
	System.out.println(t1.toStandard());
	System.out.println(t1.toUniversal());
	System.out.println("Enter hour,minute and second for second time");
	int h2=sc.nextInt();
	int m2=sc.nextInt();
	int s2=sc.nextInt();
	Time t2=new Time(h2,m2,s2);
	t1.add(t1,t2);
	System.out.println("newtime= "+t1.toUniversal());	
	}
}