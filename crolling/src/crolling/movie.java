package crolling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class movie {
	public static void main(String[] args) throws IOException{
		
		String url = "https://movie.naver.com/movie/sdb/rank/rmovie.nhn?sel=pnt&date=20200515";
				
		Document document = Jsoup.connect(url).get();
		Elements movies = document.select("div.tit5");
		
		//System.out.println(movies);
		for (Element movie : movies){
			// System.out.println(movie.select("a"));
			System.out.println("https://movie.naver.com" + movie.select("a").attr("href"));
			System.out.println(movie.text());
			
		}
	}
}
