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
			System.out.println("點到的號碼為：" + number);
			System.out.print("是否繼續點名（Y/N）：");
			ans = buf.readLine();
			while(!(ans.equals(ansa)) && !(ans.equals(ansb)) ){
				System.out.print("請輸入正確回應:");
				ans = buf.readLine();
					System.out.println(ans);
			}
		}while(ans.equals(ansa));
		System.out.print("程式結束");
	}
}