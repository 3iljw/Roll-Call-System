import java.io.*;
public class hw5 {
	public static void main(String[] args)throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int number,n=0;
		String ans="Y",ansa="Y",ansb="N";
		do{	double mun = Math.random();
			number = (int) (mun * 60 ) + 1;
			if(number==3 || number==31 || number==35 || number==46 || number==47 || number==57)
				continue;
			System.out.println("�I�쪺���X���G" + number);
			System.out.print("�O�_�~���I�W�]Y/N�^�G");
			ans = buf.readLine();
			while(!(ans.equals(ansa)) && !(ans.equals(ansb)) ){
				System.out.print("�п�J���T�^��:");
				ans = buf.readLine();
					System.out.println(ans);
			}
		}while(ans.equals(ansa));
		System.out.print("�{������");
	}
}