import java.util.*;
import java.io.*;
public class HtmlCreate {
	public static void main(String[] args) throws IOException, InputMismatchException{
		Scanner sc=new Scanner(System.in);
		HtmlFile filecre=new HtmlFile();
        System.out.println("カテゴリ1~4を選択してください");
        int category=0;
        try{
            category=sc.nextInt();
        }catch(Exception e){
            System.out.println("正しい値を入れてください。最初からやり直しだよ＾＾");
        }
        if(category==1){
            System.out.println("授業名を入れてください");
            String classname="";
            try{
                classname=sc.next();
            }catch(Exception e){
                System.out.println("正しい値を入れてください。最初からやり直しだよ＾＾");
            }
            

            System.out.println("商品のタイプ1,2のいずれかを入力してください。9を入力するとすべてのタイプを作ります。");
            int type=0;
            try{
                type=sc.nextInt();
            }catch(Exception e){
                System.out.println("正しい値を入れてください。最初からやり直しだよ＾＾");
            }
            if(type==1){
                HtmlFile.createhtmlfileclass1(classname,type);
            }else if(type==2){
                HtmlFile.createhtmlfileclass2(classname,type);
            }else if(type==9){
                HtmlFile.createhtmlfileclass1(classname,1);
                HtmlFile.createhtmlfileclass2(classname,2);
            }else{
                
            }

        }else if(category==2){
            System.out.println("大学名を入れてください");
            String uniname="";
            try{
                uniname=sc.next();
            }catch(Exception e){
                System.out.println("正しい値を入れてください。最初からやり直しだよ＾＾");
            }

            System.out.println("商品のタイプ1~4のいずれかを入力してください。9を入力すると全てのタイプを作ります。");
            int type=0;
            try{
                type=sc.nextInt();
            }catch(Exception e){
                System.out.println("正しい値を入れてください。最初からやり直しだよ＾＾");
            }
            
            if(type==1){
                HtmlFile.createhtmlfileabroad1(uniname,type);
            }else if(type==2){
                HtmlFile.createhtmlfileabroad2(uniname,type);
            }else if(type==3){
                HtmlFile.createhtmlfileabroad3(uniname,type);
            }else if(type==4){
                HtmlFile.createhtmlfileabroad4(uniname,type);
            }else if(type==9){
                HtmlFile.createhtmlfileabroad1(uniname,1);
                HtmlFile.createhtmlfileabroad2(uniname,2);
                HtmlFile.createhtmlfileabroad3(uniname,3);
                HtmlFile.createhtmlfileabroad4(uniname,4);
            }else{
                System.out.println("正しい値を入れてください。最初からやり直しだよ＾＾");
        }

        }else if(category==3){
            System.out.println("サークル名を入れてください");
            String circlename="";
            try{
                circlename=sc.next();
            }catch(Exception e){
                System.out.println("正しい値を入れてください。最初からやり直しだよ＾＾");
            }
            
        }else if(category==4){
            System.out.println("企画名を入れてください");
            String projectname="";
            try{
                projectname=sc.next();
            }catch(Exception e){
                System.out.println("正しい値を入れてください。最初からやり直しだよ＾＾");
            }
           
        }else{
            System.out.println("正しい値を入れてね？ふざけてんの？");
        }
        


		
		
	}
}
