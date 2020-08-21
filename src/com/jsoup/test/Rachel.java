package com.jsoup.test;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Rachel {
	
	 public static void main(String[] args) {
				try {
					Document doc =  Jsoup.connect("https://search.daum.net/search?nil_suggest=btn&w=tot&DA=SBC&q=%EB%A0%88%EC%9D%B4%EC%B2%BC+%EB%A7%A5%EC%95%84%EB%8B%B4%EC%8A%A4").get();
					Elements container = doc.select("div.type_thumb_s160 dl");
					Elements title = doc.select("div.type_thumb_s160 dl dt");
					Elements data = doc.select("div.type_thumb_s160 dl dd");
					
					for(int i=0; i<container.size(); i++) {
						String titleText = title.get(i).text();
						String dataText = data.get(i).text();
						System.out.println(titleText+" : "+dataText);
					}
	
					
		
					
					
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			
	 }
}
