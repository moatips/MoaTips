import java.util.*;
import java.io.*;
public class HtmlCreate {
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		HtmlFile filecre=new HtmlFile();
        System.out.println("大学名を入れてください");
        String uniname=sc.next();
        System.out.println("商品のタイプ1~4のいずれかを入力してください");
        int type=sc.nextInt();
        if(type==1){
            HtmlFile.createhtmlfileabroad1(uniname);
        }else if(type==2){
            HtmlFile.createhtmlfileabroad2(uniname);
        }else if(type==3){
            HtmlFile.createhtmlfileabroad3(uniname);
        }else if(type==4){
            HtmlFile.createhtmlfileabroad4(uniname);
        }else{
            System.out.println("正しい値を入れてください");
        }



		
		
	}
}
