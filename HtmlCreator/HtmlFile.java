import java.util.*;
import java.io.*;

public class HtmlFile{
    static void createhtmlfileclass1(String name,int type) throws IOException{
		Writer osw = new OutputStreamWriter(new FileOutputStream(name+type+".html"));
		osw.write("<!DOCTYPE html>" +
                  "<head>" +
                  "<title>"
                  +name
                  +": 概要"
                  +"</title>" +
                  "<meta http-equiv=\"Content-Type\"" +
                  "content=\"text/html;charset=UTF-8\">" +
                  "<meta http-equiv=\"Content-Style-Type\" content=\"text/css\">" +
                  "<link rel=\"stylesheet\" href=\"../../CSS/Top.css\" type=\"text/css\">" +
                  "<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\">" +
                  "</head>" +
                  "<body>" +
                  "<div id=\"Container\">" +
                  "<div id=\"Sidebar\">" +
                  "<div id=\"SideContent1\">" +
                  "<div id=\"SideLogo\">" +
                  "<img src=\"../../img/uniA1-b.jpg\" width=\"184px\">" +
                  "</div>" +
                  "<div id=\"SideName\">" +
                  "Name:" +
                  "</div>" +
                  "<div id=\"SidePoint\">" +
                  "Point:" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "<div id=\"SideContent2\">" +
                  "<a href=\"\">" +
                  "<div id=\"SideMypage\" class=\"Side\">" +
                  "マイページ" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideAnswer\" class=\"Side\">" +
                  "回答する" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "<div id=\"SideContent3\">" +
                  "<a href=\"\">" +
                  "<div id=\"SideClass\" class=\"Side\">" +
                  "授業" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideAbroad\" class=\"Side\">" +
                  "留学" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideCircle\" class=\"Side\">" +
                  "サークル" +
                  "</div>" +
                  "</a>" +
                  "<div id=\"SideNewProject\" class=\"Side\">" +
                  "新企画" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "<div id=\"SideContent4\">" +
                  "<a href=\"\">" +
                  "<div id=\"SideRule\" class=\"Side\">" +
                  "利用規約" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\"><div id=\"SideBeginner\" class=\"Side\">" +
                  "初めての方へ" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideOpinion\" class=\"Side\">" +
                  "ご意見板" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideLogout\" class=\"Side\">" +
                  "ログアウト" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "</div>" +
                  "<div id=\"MainContent\"><div class=\"AbroadList\"><div class=\"AbroadListTitle\"><img src=\"../../img/CircleImg/sky/sky.png\">" +
                  "<p class=\"AbroadName\">"+
                  name+
                  ": 概要"+
                  "</p>" +
                  "</div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\"><p class=\"AbroadListCategory\">わかりやすさ</p><p class=\"AbroadListDifferent\"></p></div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\"><p class=\"AbroadListCategory\">授業ペース</p><p class=\"AbroadListDifferent\"></p></div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">面白さ</p><p class=\"AbroadListDifferent\"></p></div><div class=\"AbroadListCategorySet\">" +
                  "<img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">クイズの回数</p><p class=\"AbroadListDifferent\"></p></div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">宿題の難易度</p><p class=\"AbroadListDifferent\"></p></div><div class=\"AbroadListCategorySet\">" +
                  "<img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\"><p class=\"AbroadListCategory\">宿題のタイプ</p>" +
                  "<p class=\"AbroadListDifferent\"></p></div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">親身度</p><p class=\"AbroadListDifferent\"></p></div>"+
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">授業外学習</p><p class=\"AbroadListDifferent\"></p></div>"+
                  "</div></div><script type=\"text/javascript\" src=\"../../JS/jquery.js\"></script>" +
                  "<script type=\"text/javascript\" src=\"../../JS/moa.js\"></script><script type=\"text/javascript\">" +
                  "</script></body></html>");
		
		
		
		
		osw.close();
		
        
	}

    static void createhtmlfileclass2(String name,int type) throws IOException{
		Writer osw = new OutputStreamWriter(new FileOutputStream(name+type+".html"));
		osw.write("<!DOCTYPE html>" +
                  "<head>" +
                  "<title>"
                  +name
                  +": 評価"
                  +"</title>" +
                  "<meta http-equiv=\"Content-Type\"" +
                  "content=\"text/html;charset=UTF-8\">" +
                  "<meta http-equiv=\"Content-Style-Type\" content=\"text/css\">" +
                  "<link rel=\"stylesheet\" href=\"../../CSS/Top.css\" type=\"text/css\">" +
                  "<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\">" +
                  "</head>" +
                  "<body>" +
                  "<div id=\"Container\">" +
                  "<div id=\"Sidebar\">" +
                  "<div id=\"SideContent1\">" +
                  "<div id=\"SideLogo\">" +
                  "<img src=\"../../img/uniA1-b.jpg\" width=\"184px\">" +
                  "</div>" +
                  "<div id=\"SideName\">" +
                  "Name:" +
                  "</div>" +
                  "<div id=\"SidePoint\">" +
                  "Point:" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "<div id=\"SideContent2\">" +
                  "<a href=\"\">" +
                  "<div id=\"SideMypage\" class=\"Side\">" +
                  "マイページ" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideAnswer\" class=\"Side\">" +
                  "回答する" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "<div id=\"SideContent3\">" +
                  "<a href=\"\">" +
                  "<div id=\"SideClass\" class=\"Side\">" +
                  "授業" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideAbroad\" class=\"Side\">" +
                  "留学" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideCircle\" class=\"Side\">" +
                  "サークル" +
                  "</div>" +
                  "</a>" +
                  "<div id=\"SideNewProject\" class=\"Side\">" +
                  "新企画" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "<div id=\"SideContent4\">" +
                  "<a href=\"\">" +
                  "<div id=\"SideRule\" class=\"Side\">" +
                  "利用規約" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\"><div id=\"SideBeginner\" class=\"Side\">" +
                  "初めての方へ" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideOpinion\" class=\"Side\">" +
                  "ご意見板" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideLogout\" class=\"Side\">" +
                  "ログアウト" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "</div>" +
                  "<div id=\"MainContent\"><div class=\"AbroadList\"><div class=\"AbroadListTitle\"><img src=\"../../img/CircleImg/sky/sky.png\">" +
                  "<p class=\"AbroadName\">"+
                  name+
                  ": 評価"+
                  "</p>" +
                  "</div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\"><p class=\"AbroadListCategory\">良かった点</p><p class=\"AbroadListDifferent\"></p></div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\"><p class=\"AbroadListCategory\">悪かった点</p><p class=\"AbroadListDifferent\"></p></div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">履修すべき人物像</p><p class=\"AbroadListDifferent\"></p></div><div class=\"AbroadListCategorySet\">" +
                  "<img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">適切な履修時期</p><p class=\"AbroadListDifferent\"></p></div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">注意点＆コツ</p><p class=\"AbroadListDifferent\"></p></div>"+
                  "</div></div><script type=\"text/javascript\" src=\"../../JS/jquery.js\"></script>" +
                  "<script type=\"text/javascript\" src=\"../../JS/moa.js\"></script><script type=\"text/javascript\">" +
                  "</script></body></html>");
		
		
		
		
		osw.close();
		
        
	}
    
    
    static void createhtmlfileabroad1(String name,int type) throws IOException{
		Writer osw = new OutputStreamWriter(new FileOutputStream(name+type+".html"));
		osw.write("<!DOCTYPE html>" +
				"<head>" +
				"<title>"
				+name
                +": 宿舎"
				+"</title>" +
				"<meta http-equiv=\"Content-Type\"" +
				"content=\"text/html;charset=UTF-8\">" +
				"<meta http-equiv=\"Content-Style-Type\" content=\"text/css\">" +
				"<link rel=\"stylesheet\" href=\"../../CSS/Top.css\" type=\"text/css\">" +
				"<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\">" +
				"</head>" +
				"<body>" +
				"<div id=\"Container\">" +
				"<div id=\"Sidebar\">" +
				"<div id=\"SideContent1\">" +
				"<div id=\"SideLogo\">" +
				"<img src=\"../../img/uniA1-b.jpg\" width=\"184px\">" +
				"</div>" +
				"<div id=\"SideName\">" +
				"Name:" +
				"</div>" +
				"<div id=\"SidePoint\">" +
				"Point:" +
				"</div>" +
				"</a>" +
				"</div>" +
				"<div id=\"SideContent2\">" +
				"<a href=\"\">" +
				"<div id=\"SideMypage\" class=\"Side\">" +
				"マイページ" +
				"</div>" +
				"</a>" +
				"<a href=\"\">" +
				"<div id=\"SideAnswer\" class=\"Side\">" +
				"回答する" +
				"</div>" +
				"</a>" +
				"</div>" +
				"<div id=\"SideContent3\">" +
				"<a href=\"\">" +
				"<div id=\"SideClass\" class=\"Side\">" +
				"授業" +
				"</div>" +
				"</a>" +
				"<a href=\"\">" +
				"<div id=\"SideAbroad\" class=\"Side\">" +
				"留学" +
				"</div>" +
				"</a>" +
				"<a href=\"\">" +
				"<div id=\"SideCircle\" class=\"Side\">" +
				"サークル" +
				"</div>" +
				"</a>" +
				"<div id=\"SideNewProject\" class=\"Side\">" +
				"新企画" +
				"</div>" +
				"</a>" +
				"</div>" +
				"<div id=\"SideContent4\">" +
				"<a href=\"\">" +
				"<div id=\"SideRule\" class=\"Side\">" +
				"利用規約" +
				"</div>" +
				"</a>" +
				"<a href=\"\"><div id=\"SideBeginner\" class=\"Side\">" +
				"初めての方へ" +
				"</div>" +
				"</a>" +
				"<a href=\"\">" +
				"<div id=\"SideOpinion\" class=\"Side\">" +
				"ご意見板" +
				"</div>" +
				"</a>" +
				"<a href=\"\">" +
				"<div id=\"SideLogout\" class=\"Side\">" +
				"ログアウト" +
				"</div>" +
				"</a>" +
				"</div>" +
				"</div>" +
				"<div id=\"MainContent\"><div class=\"AbroadList\"><div class=\"AbroadListTitle\"><img src=\"../../img/CircleImg/sky/sky.png\">" +
				"<p class=\"AbroadName\">"+
				name+
                ": 宿舎"+
				"</p>" +
				"</div>" +
				"<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\"><p class=\"AbroadListCategory\">宿舎のタイプ</p><p class=\"AbroadListDifferent\"></p></div>" +
				"<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\"><p class=\"AbroadListCategory\">宿舎の設備</p><p class=\"AbroadListDifferent\"></p></div>" +
				"<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
				"<p class=\"AbroadListCategory\">宿舎の食事</p><p class=\"AbroadListDifferent\"></p></div><div class=\"AbroadListCategorySet\">" +
				"<img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
				"<p class=\"AbroadListCategory\">宿舎でのトラブル</p><p class=\"AbroadListDifferent\"></p></div>" +
				"<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
				"<p class=\"AbroadListCategory\">宿舎でのサポート体制</p><p class=\"AbroadListDifferent\"></p></div><div class=\"AbroadListCategorySet\">" +
				"<img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\"><p class=\"AbroadListCategory\">後輩に伝えたいこと</p>" +
				"<p class=\"AbroadListDifferent\"></p></div>" +
				"</div></div><script type=\"text/javascript\" src=\"../../JS/jquery.js\"></script>" +
				"<script type=\"text/javascript\" src=\"../../JS/moa.js\"></script><script type=\"text/javascript\">" +
				"</script></body></html>");
		
		
		
		
		osw.close();
		

	}
    
    static void createhtmlfileabroad2(String name,int type) throws IOException{
		Writer osw = new OutputStreamWriter(new FileOutputStream(name+type+".html"));
		osw.write("<!DOCTYPE html>" +
                  "<head>" +
                  "<title>"
                  +name
                  +": 大学"
                  +"</title>" +
                  "<meta http-equiv=\"Content-Type\"" +
                  "content=\"text/html;charset=UTF-8\">" +
                  "<meta http-equiv=\"Content-Style-Type\" content=\"text/css\">" +
                  "<link rel=\"stylesheet\" href=\"../../CSS/Top.css\" type=\"text/css\">" +
                  "<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\">" +
                  "</head>" +
                  "<body>" +
                  "<div id=\"Container\">" +
                  "<div id=\"Sidebar\">" +
                  "<div id=\"SideContent1\">" +
                  "<div id=\"SideLogo\">" +
                  "<img src=\"../../img/uniA1-b.jpg\" width=\"184px\">" +
                  "</div>" +
                  "<div id=\"SideName\">" +
                  "Name:" +
                  "</div>" +
                  "<div id=\"SidePoint\">" +
                  "Point:" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "<div id=\"SideContent2\">" +
                  "<a href=\"\">" +
                  "<div id=\"SideMypage\" class=\"Side\">" +
                  "マイページ" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideAnswer\" class=\"Side\">" +
                  "回答する" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "<div id=\"SideContent3\">" +
                  "<a href=\"\">" +
                  "<div id=\"SideClass\" class=\"Side\">" +
                  "授業" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideAbroad\" class=\"Side\">" +
                  "留学" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideCircle\" class=\"Side\">" +
                  "サークル" +
                  "</div>" +
                  "</a>" +
                  "<div id=\"SideNewProject\" class=\"Side\">" +
                  "新企画" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "<div id=\"SideContent4\">" +
                  "<a href=\"\">" +
                  "<div id=\"SideRule\" class=\"Side\">" +
                  "利用規約" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\"><div id=\"SideBeginner\" class=\"Side\">" +
                  "初めての方へ" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideOpinion\" class=\"Side\">" +
                  "ご意見板" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideLogout\" class=\"Side\">" +
                  "ログアウト" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "</div>" +
                  "<div id=\"MainContent\"><div class=\"AbroadList\"><div class=\"AbroadListTitle\"><img src=\"../../img/CircleImg/sky/sky.png\">" +
                  "<p class=\"AbroadName\">"+
                  name+
                  ": 大学"+
                  "</p>" +
                  "</div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\"><p class=\"AbroadListCategory\">おすすめ授業</p><p class=\"AbroadListDifferent\"></p></div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\"><p class=\"AbroadListCategory\">授業の雰囲気</p><p class=\"AbroadListDifferent\"></p></div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">留学生全体の雰囲気</p><p class=\"AbroadListDifferent\"></p></div><div class=\"AbroadListCategorySet\">" +
                  "<img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">留学生へのサポート</p><p class=\"AbroadListDifferent\"></p></div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">特色的なサークル</p><p class=\"AbroadListDifferent\"></p></div>"+
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">おすすめのサークル</p><p class=\"AbroadListDifferent\"></p></div>"+
                  "<div class=\"AbroadListCategorySet\">" +
                  "<img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\"><p class=\"AbroadListCategory\">後輩に伝えたいこと</p>" +
                  "<p class=\"AbroadListDifferent\"></p></div>" +
                  "</div></div><script type=\"text/javascript\" src=\"../../JS/jquery.js\"></script>" +
                  "<script type=\"text/javascript\" src=\"../../JS/moa.js\"></script><script type=\"text/javascript\">" +
                  "</script></body></html>");
		
		
		
		
		osw.close();
		
        
	}
    
    static void createhtmlfileabroad3(String name,int type) throws IOException{
		Writer osw = new OutputStreamWriter(new FileOutputStream(name+type+".html"));
		osw.write("<!DOCTYPE html>" +
                  "<head>" +
                  "<title>"
                  +name
                  +": 現地"
                  +"</title>" +
                  "<meta http-equiv=\"Content-Type\"" +
                  "content=\"text/html;charset=UTF-8\">" +
                  "<meta http-equiv=\"Content-Style-Type\" content=\"text/css\">" +
                  "<link rel=\"stylesheet\" href=\"../../CSS/Top.css\" type=\"text/css\">" +
                  "<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\">" +
                  "</head>" +
                  "<body>" +
                  "<div id=\"Container\">" +
                  "<div id=\"Sidebar\">" +
                  "<div id=\"SideContent1\">" +
                  "<div id=\"SideLogo\">" +
                  "<img src=\"../../img/uniA1-b.jpg\" width=\"184px\">" +
                  "</div>" +
                  "<div id=\"SideName\">" +
                  "Name:" +
                  "</div>" +
                  "<div id=\"SidePoint\">" +
                  "Point:" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "<div id=\"SideContent2\">" +
                  "<a href=\"\">" +
                  "<div id=\"SideMypage\" class=\"Side\">" +
                  "マイページ" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideAnswer\" class=\"Side\">" +
                  "回答する" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "<div id=\"SideContent3\">" +
                  "<a href=\"\">" +
                  "<div id=\"SideClass\" class=\"Side\">" +
                  "授業" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideAbroad\" class=\"Side\">" +
                  "留学" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideCircle\" class=\"Side\">" +
                  "サークル" +
                  "</div>" +
                  "</a>" +
                  "<div id=\"SideNewProject\" class=\"Side\">" +
                  "新企画" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "<div id=\"SideContent4\">" +
                  "<a href=\"\">" +
                  "<div id=\"SideRule\" class=\"Side\">" +
                  "利用規約" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\"><div id=\"SideBeginner\" class=\"Side\">" +
                  "初めての方へ" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideOpinion\" class=\"Side\">" +
                  "ご意見板" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideLogout\" class=\"Side\">" +
                  "ログアウト" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "</div>" +
                  "<div id=\"MainContent\"><div class=\"AbroadList\"><div class=\"AbroadListTitle\"><img src=\"../../img/CircleImg/sky/sky.png\">" +
                  "<p class=\"AbroadName\">"+
                  name+
                  ": 現地"+
                  "</p>" +
                  "</div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\"><p class=\"AbroadListCategory\">日本で買っとくべき物</p><p class=\"AbroadListDifferent\"></p></div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\"><p class=\"AbroadListCategory\">携帯＆PC関連トラブル</p><p class=\"AbroadListDifferent\"></p></div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">留学先の治安</p><p class=\"AbroadListDifferent\"></p></div><div class=\"AbroadListCategorySet\">" +
                  "<img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">留学先の気候</p><p class=\"AbroadListDifferent\"></p></div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">留学先の食文化</p><p class=\"AbroadListDifferent\"></p></div>"+
                  "<div class=\"AbroadListCategorySet\">" +
                  "<img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\"><p class=\"AbroadListCategory\">日本食を食べる機会</p>" +
                  "<p class=\"AbroadListDifferent\"></p></div>" +
                  
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">現地人の日本への理解</p><p class=\"AbroadListDifferent\"></p></div>"+
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">在留邦人への関わり</p><p class=\"AbroadListDifferent\"></p></div>"+
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">後輩に伝えたいこと</p><p class=\"AbroadListDifferent\"></p></div>"+
                  
                  "</div></div><script type=\"text/javascript\" src=\"../../JS/jquery.js\"></script>" +
                  "<script type=\"text/javascript\" src=\"../../JS/moa.js\"></script><script type=\"text/javascript\">" +
                  "</script></body></html>");
		
		
		
		
		osw.close();
		
        
	}

    static void createhtmlfileabroad4(String name,int type) throws IOException{
		Writer osw = new OutputStreamWriter(new FileOutputStream(name+type+".html"));
		osw.write("<!DOCTYPE html>" +
                  "<head>" +
                  "<title>"
                  +name
                  +": 休暇"
                  +"</title>" +
                  "<meta http-equiv=\"Content-Type\"" +
                  "content=\"text/html;charset=UTF-8\">" +
                  "<meta http-equiv=\"Content-Style-Type\" content=\"text/css\">" +
                  "<link rel=\"stylesheet\" href=\"../../CSS/Top.css\" type=\"text/css\">" +
                  "<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\">" +
                  "</head>" +
                  "<body>" +
                  "<div id=\"Container\">" +
                  "<div id=\"Sidebar\">" +
                  "<div id=\"SideContent1\">" +
                  "<div id=\"SideLogo\">" +
                  "<img src=\"../../img/uniA1-b.jpg\" width=\"184px\">" +
                  "</div>" +
                  "<div id=\"SideName\">" +
                  "Name:" +
                  "</div>" +
                  "<div id=\"SidePoint\">" +
                  "Point:" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "<div id=\"SideContent2\">" +
                  "<a href=\"\">" +
                  "<div id=\"SideMypage\" class=\"Side\">" +
                  "マイページ" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideAnswer\" class=\"Side\">" +
                  "回答する" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "<div id=\"SideContent3\">" +
                  "<a href=\"\">" +
                  "<div id=\"SideClass\" class=\"Side\">" +
                  "授業" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideAbroad\" class=\"Side\">" +
                  "留学" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideCircle\" class=\"Side\">" +
                  "サークル" +
                  "</div>" +
                  "</a>" +
                  "<div id=\"SideNewProject\" class=\"Side\">" +
                  "新企画" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "<div id=\"SideContent4\">" +
                  "<a href=\"\">" +
                  "<div id=\"SideRule\" class=\"Side\">" +
                  "利用規約" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\"><div id=\"SideBeginner\" class=\"Side\">" +
                  "初めての方へ" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideOpinion\" class=\"Side\">" +
                  "ご意見板" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideLogout\" class=\"Side\">" +
                  "ログアウト" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "</div>" +
                  "<div id=\"MainContent\"><div class=\"AbroadList\"><div class=\"AbroadListTitle\"><img src=\"../../img/CircleImg/sky/sky.png\">" +
                  "<p class=\"AbroadName\">"+
                  name+
                  ": 休暇"+
                  "</p>" +
                  "</div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\"><p class=\"AbroadListCategory\">休日の過ごし方</p><p class=\"AbroadListDifferent\"></p></div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\"><p class=\"AbroadListCategory\">長期休暇の季節と日数</p><p class=\"AbroadListDifferent\"></p></div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">長期休暇の過ごし方</p><p class=\"AbroadListDifferent\"></p></div><div class=\"AbroadListCategorySet\">" +
                  "<img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">長期休暇の旅行</p><p class=\"AbroadListDifferent\"></p></div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">旅行先の見所＆名物</p><p class=\"AbroadListDifferent\"></p></div><div class=\"AbroadListCategorySet\">" +
                  "<img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\"><p class=\"AbroadListCategory\">後輩に伝えたいこと</p>" +
                  "<p class=\"AbroadListDifferent\"></p></div>" +
                  "</div></div><script type=\"text/javascript\" src=\"../../JS/jquery.js\"></script>" +
                  "<script type=\"text/javascript\" src=\"../../JS/moa.js\"></script><script type=\"text/javascript\">" +
                  "</script></body></html>");
		
		
		
		
		osw.close();
		
        
	}
    static void createhtmlfilecircle(String name) throws IOException{
		Writer osw = new OutputStreamWriter(new FileOutputStream(name+".html"));
		osw.write("<!DOCTYPE html>" +
                  "<head>" +
                  "<title>"
                  +name
                  +"</title>" +
                  "<meta http-equiv=\"Content-Type\"" +
                  "content=\"text/html;charset=UTF-8\">" +
                  "<meta http-equiv=\"Content-Style-Type\" content=\"text/css\">" +
                  "<link rel=\"stylesheet\" href=\"../../CSS/Top.css\" type=\"text/css\">" +
                  "<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\">" +
                  "</head>" +
                  "<body>" +
                  "<div id=\"Container\">" +
                  "<div id=\"Sidebar\">" +
                  "<div id=\"SideContent1\">" +
                  "<div id=\"SideLogo\">" +
                  "<img src=\"../../img/uniA1-b.jpg\" width=\"184px\">" +
                  "</div>" +
                  "<div id=\"SideName\">" +
                  "Name:" +
                  "</div>" +
                  "<div id=\"SidePoint\">" +
                  "Point:" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "<div id=\"SideContent2\">" +
                  "<a href=\"\">" +
                  "<div id=\"SideMypage\" class=\"Side\">" +
                  "マイページ" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideAnswer\" class=\"Side\">" +
                  "回答する" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "<div id=\"SideContent3\">" +
                  "<a href=\"\">" +
                  "<div id=\"SideClass\" class=\"Side\">" +
                  "授業" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideAbroad\" class=\"Side\">" +
                  "留学" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideCircle\" class=\"Side\">" +
                  "サークル" +
                  "</div>" +
                  "</a>" +
                  "<div id=\"SideNewProject\" class=\"Side\">" +
                  "新企画" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "<div id=\"SideContent4\">" +
                  "<a href=\"\">" +
                  "<div id=\"SideRule\" class=\"Side\">" +
                  "利用規約" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\"><div id=\"SideBeginner\" class=\"Side\">" +
                  "初めての方へ" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideOpinion\" class=\"Side\">" +
                  "ご意見板" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideLogout\" class=\"Side\">" +
                  "ログアウト" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "</div>" +
                  "<div id=\"MainContent\"><div class=\"AbroadList\"><div class=\"AbroadListTitle\"><img src=\"../../img/CircleImg/sky/sky.png\">" +
                  "<p class=\"AbroadName\">"+
                  name+
                  "</p>" +
                  "</div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\"><p class=\"AbroadListCategory\">メンバー数</p><p class=\"AbroadListDifferent\"></p></div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\"><p class=\"AbroadListCategory\">活動日</p><p class=\"AbroadListDifferent\"></p></div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">活動場所</p><p class=\"AbroadListDifferent\"></p></div><div class=\"AbroadListCategorySet\">" +
                  "<img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">活動目的</p><p class=\"AbroadListDifferent\"></p></div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">活動内容</p><p class=\"AbroadListDifferent\"></p></div><div class=\"AbroadListCategorySet\">" +
                  "<img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\"><p class=\"AbroadListCategory\">年間行事</p>" +
                  "<p class=\"AbroadListDifferent\"></p></div>" +
                  "</div></div><script type=\"text/javascript\" src=\"../../JS/jquery.js\"></script>" +
                  "<script type=\"text/javascript\" src=\"../../JS/moa.js\"></script><script type=\"text/javascript\">" +
                  "</script></body></html>");
		
		
		
		
		osw.close();
		
        
	}
    static void createhtmlfileproject(String name) throws IOException{
		Writer osw = new OutputStreamWriter(new FileOutputStream(name+".html"));
		osw.write("<!DOCTYPE html>" +
                  "<head>" +
                  "<title>"
                  +name
                  +"</title>" +
                  "<meta http-equiv=\"Content-Type\"" +
                  "content=\"text/html;charset=UTF-8\">" +
                  "<meta http-equiv=\"Content-Style-Type\" content=\"text/css\">" +
                  "<link rel=\"stylesheet\" href=\"../../CSS/Top.css\" type=\"text/css\">" +
                  "<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\">" +
                  "</head>" +
                  "<body>" +
                  "<div id=\"Container\">" +
                  "<div id=\"Sidebar\">" +
                  "<div id=\"SideContent1\">" +
                  "<div id=\"SideLogo\">" +
                  "<img src=\"../../img/uniA1-b.jpg\" width=\"184px\">" +
                  "</div>" +
                  "<div id=\"SideName\">" +
                  "Name:" +
                  "</div>" +
                  "<div id=\"SidePoint\">" +
                  "Point:" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "<div id=\"SideContent2\">" +
                  "<a href=\"\">" +
                  "<div id=\"SideMypage\" class=\"Side\">" +
                  "マイページ" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideAnswer\" class=\"Side\">" +
                  "回答する" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "<div id=\"SideContent3\">" +
                  "<a href=\"\">" +
                  "<div id=\"SideClass\" class=\"Side\">" +
                  "授業" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideAbroad\" class=\"Side\">" +
                  "留学" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideCircle\" class=\"Side\">" +
                  "サークル" +
                  "</div>" +
                  "</a>" +
                  "<div id=\"SideNewProject\" class=\"Side\">" +
                  "新企画" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "<div id=\"SideContent4\">" +
                  "<a href=\"\">" +
                  "<div id=\"SideRule\" class=\"Side\">" +
                  "利用規約" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\"><div id=\"SideBeginner\" class=\"Side\">" +
                  "初めての方へ" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideOpinion\" class=\"Side\">" +
                  "ご意見板" +
                  "</div>" +
                  "</a>" +
                  "<a href=\"\">" +
                  "<div id=\"SideLogout\" class=\"Side\">" +
                  "ログアウト" +
                  "</div>" +
                  "</a>" +
                  "</div>" +
                  "</div>" +
                  "<div id=\"MainContent\"><div class=\"AbroadList\"><div class=\"AbroadListTitle\"><img src=\"../../img/CircleImg/sky/sky.png\">" +
                  "<p class=\"AbroadName\">"+
                  name+
                  "</p>" +
                  "</div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\"><p class=\"AbroadListCategory\">休日の過ごし方</p><p class=\"AbroadListDifferent\"></p></div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\"><p class=\"AbroadListCategory\">長期休暇の季節と日数</p><p class=\"AbroadListDifferent\"></p></div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">長期休暇の過ごし方</p><p class=\"AbroadListDifferent\"></p></div><div class=\"AbroadListCategorySet\">" +
                  "<img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">長期休暇の旅行</p><p class=\"AbroadListDifferent\"></p></div>" +
                  "<div class=\"AbroadListCategorySet\"><img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\">" +
                  "<p class=\"AbroadListCategory\">旅行先の見所＆名物</p><p class=\"AbroadListDifferent\"></p></div><div class=\"AbroadListCategorySet\">" +
                  "<img class=\"AbroadListCategoryimg\" src=\"../../img/CircleImg/sky/sky_s1.png\"><p class=\"AbroadListCategory\">後輩に伝えたいこと</p>" +
                  "<p class=\"AbroadListDifferent\"></p></div>" +
                  "</div></div><script type=\"text/javascript\" src=\"../../JS/jquery.js\"></script>" +
                  "<script type=\"text/javascript\" src=\"../../JS/moa.js\"></script><script type=\"text/javascript\">" +
                  "</script></body></html>");
		
		
		
		
		osw.close();
		
        
	}

       
}

