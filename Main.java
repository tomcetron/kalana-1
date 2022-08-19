import java.util.ArrayList;
import java.util.Arrays;


public class Main {
		
	public static void main(String[] args) {
		
		ReviewDatabase rd = new ReviewDatabase(20);
		
		// 2 instance od tridy Author
		Author aut1 = new Author("Brooks Entertainment", "shon.brooks@yahoo.com");
		Author aut2 = new Author("Anacreon", "anacreon@tucson.com");
		
		
		// 3 instance od tridy Game
		Game g1 = new Game("Slender", Genre.ACTION);
		Game g2 = new Game("Boovie",  Genre.STRATEGY);
		Game g3 = new Game("Quadrax",  Genre.LOGICAL);
		
		
		// 6 instanci od tridy Review
		Review rev1 = new Review(new Game("Minecraft", Genre.STRATEGY), new Author("Tonda", "tonik@centrum.cz"), 12);
		rd.addNew(rev1);
		
		Review rev2 = new Review(new Game("FarCry3", Genre.RPG), new Author("Tonda", "tonik@centrum.cz"), 93);
		rd.addNew(rev2);
		
		Review rev3 = new Review(new Game("Dark Souls", Genre.ADVENTURE), new Author("Darker", "emogiii@gmail.com"), 60);
		rd.addNew(rev3);
		
		Review rev4 = new Review(new Game("CounterStrike", Genre.ACTION), new Author("Darker", "emogiii@gmail.com"), 60);
		rd.addNew(rev4);
		
		Review rev5 = new Review(new Game("CounterStrike", Genre.STRATEGY), new Author("Fantomas", "emogiii@gmail.com"), 55);
		rd.addNew(rev5);
		
		Review rev6 = new Review(new Game("AgeOfEmpires", Genre.STRATEGY), new Author("Levius", "leviusek@gmail.com"), 14);
		rd.addNew(rev6);
		
		
		
		// volani 2. metody
		System.out.println("METODA GETGAMEWITHHIGHESTSCORE()");
		System.out.println(rd.getGameWithHighestScore());
		
		System.out.println("-----------------");
		
		// volani 3. metody
		System.out.println("METODA GETALLGAMES(GENRE)");
		Game[] vyslednePoleDleGenre = rd.getAllGames("STRATEGY");
		System.out.println(Arrays.toString(vyslednePoleDleGenre));
		
		System.out.println("-----------------");
		
		// volani 4. metody
		System.out.println("METODA GETAVERAGESCOREFORGAMEWITHNAME(NAME)");
		System.out.println(rd.getAverageScoreForGameWithName("CounterStrike"));
		
		System.out.println("-----------------");
		
		// volani 5. metody
		System.out.println("METODA GETALLREVIEWS(NAME)");
		Review[] res = rd.getAllReviews("Darker");
		System.out.println(Arrays.toString(res));
		
		
		
	}

}
