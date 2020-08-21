package com.jsoup.test;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Exchange {

	public static void main(String[] args) {
		
		try {
			Document doc =  Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%ED%99%98%EC%9C%A8").get();
			Elements table= doc.select("table.rate_table_info");//테이블
			Elements body= table.select("tbody tr");//내용
			
			for(int i=0; i<body.size(); i++) {	
				String title = body.get(i).select("th a").text();
				String content = body.get(i).select("td").first().text();
				System.out.println(title +"\t==>"+ content);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
