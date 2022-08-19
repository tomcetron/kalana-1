import java.util.ArrayList;
import java.util.Arrays;


public class Main {
		
	public static void main(String[] args) {
		
		ReviewDatabase rd = new ReviewDatabase(15);
		
		// 2 instance od tridy Author
		Author aut1 = new Author("Brooks Entertainment", "shon.brooks@yahoo.com");
		Author aut2 = new Author("Anacreon", "anacreon@tucson.com");
		
		
		// 3 instance od tridy Game
		
		Game g1 = new Game("Slender", Genre.ACTION);
		Game g2 = new Game("Boovie",  Genre.STRATEGY);
		Game g3 = new Game("Quadrax",  Genre.LOGICAL);
		
		
		// 6 instanci od tridy Review
		Review rev1 = new Review(new Game("Minecraft", Genre.STRATEGY), new Author("Microsoft", "microsoft@microsoft.com"), 12);
		rd.addNew(rev1);
		
		Review rev2 = new Review(new Game("FarCry1", Genre.RPG), new Author("Ubisoft", "ubisoft@mubisoft.com"), 90);
		rd.addNew(rev2);
		
		Review rev3 = new Review(new Game("Dark Souls", Genre.ADVENTURE), new Author("Darker", "prehist@gmail.com"), 60);
		rd.addNew(rev3);
		
		Review rev4 = new Review(new Game("CounterStrike", Genre.ACTION), new Author("Darker", "cs@gmail.com"), 91);
		rd.addNew(rev4);
		
		Review rev5 = new Review(new Game("GoodGameEmpire", Genre.STRATEGY), new Author("Whoever", "goodgame@gmail.com"), 94);
		rd.addNew(rev5);
		
		Review rev6 = new Review(new Game("AgeOfEmpires", Genre.STRATEGY), new Author("Age", "age@gmail.com"), 14);
		rd.addNew(rev6);
		
		
		
		// volani 2. metody
		System.out.println(rd.getGameWithHighestScore());
		
		//System.out.println(rd.getReviewCount());
		
		// volani 3. metody
		Game[] vyslednePoleDleGenre = rd.getAllGames("STRATEGY");
		System.out.println(Arrays.toString(vyslednePoleDleGenre));
		
		
		// volani 4. metody
		System.out.println(rd.getAverageScoreForGameWithName("Dark Souls"));
		
		// volani 5. metody
		Review[] res = rd.getAllReviews("Darker");
		System.out.println(Arrays.toString(res));
		
		
		/*
		 * String[] outputCountries = ms.getAvailableCountries();
		 * System.out.println(Arrays.toString(outputCountries));
		 * System.out.println("---------------------------");
		 * 
		 * Item[] getitems = ms.getItems(1585.23);
		 * System.out.println(Arrays.toString(getitems));
		 * System.out.println("---------------------------");
		 */		
		
	}

}
