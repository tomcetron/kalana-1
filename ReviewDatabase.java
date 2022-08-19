
import java.util.Arrays;


public class ReviewDatabase {
	
	Review[] reviews; 
	public int lastIndex;
	
	public ReviewDatabase(int velikostPole) {
		lastIndex = -1;
		reviews = new Review[velikostPole];
	}
	
	// 12.a
	public void addNew(Review review) {
		if(lastIndex < reviews.length - 1) 
			reviews[++lastIndex] = review;
	}
	
	
	// metoda navic, vraci pocet vlozenych reviews do pole
	public int getReviewCount() {
		int counter = 0;
		for (int i = 0; i < reviews.length; i++) {
			if(reviews[i] != null) {
				counter++;
			}
		}
		return counter;
	}
	
	// 12.b (v pripade ze by existovalo vice her se stejnym score tak neni navrzeno)
	public Game getGameWithHighestScore() {
		Game game = null;
		int temp = 0;
		int max = reviews[0].getScore();
		for (int i = 0; i < getReviewCount(); i++) {
			if(reviews[i].getScore() > max) {
				max = reviews[i].getScore();
				temp = i;
			}				
		}
		game = reviews[temp].getGame();
		return game;
	}
	
	// 12.c
	public Game[] getAllGames(String requiredGenre) {
		int pocetNalezenychPrvku = 0;
		Game[] pole = new Game[getReviewCount()];
		for (int i = 0; i < pole.length; i++) {
			if(reviews[i].getGame().getGenre().equals(requiredGenre) ) {
				pole[i] = reviews[i].getGame(); 
				pocetNalezenychPrvku++;
			}
		}
		pole = plnePole(pole, pocetNalezenychPrvku);
		return pole;
	}
	
	// 12.d
	public Double getAverageScoreForGameWithName(String gameName) {
			double average = 0.0;
			double rev = 0.0;
			int occur = 0;
			for (int i = 0; i < getReviewCount(); i++) {
				if (reviews[i].getGame().getName().equals(gameName)) {
					occur++;
					rev = rev + reviews[i].getScore();
				}
			}
			average = rev / occur;
		 return average;
	 }

	
	  // zbavi pole prazdnych NULL mist, pro Game data type metodu
	  private Game[] plnePole(Game[] array, int pocetNalezenychPrvku) { 
		  int newIdx = -1;
		  Game[] orezanePole = new Game[pocetNalezenychPrvku];
		  for (int i = 0; i < array.length; i++) { 
			  if(array[i] != null) {
			  orezanePole[++newIdx] = array[i];
			  }
		  }
		  return orezanePole;
	  }
	  
	  // zbavi pole prazdnych NULL mist, pro Review data type metodu
	  private Review[] plnePoleForReview(Review[] array, int pocetNalezenychPrvku) { 
		  int newIdx = -1;
		  Review[] orezanePole = new Review[pocetNalezenychPrvku];
		  for (int i = 0; i < array.length; i++) { 
			  if(array[i] != null) {
			  orezanePole[++newIdx] = array[i];
			  }
		  }
		  return orezanePole;
	  }
	  
	  // 12.e
	  public Review[] getAllReviews(String nickname) {
		  int pocetNalezenychPrvku = 0;
		  Review[] allReviews = new Review[getReviewCount()];
		  for (int i = 0; i < allReviews.length; i++) {
			if(reviews[i].getAuthor().getNickname().equals(nickname)) {
				allReviews[i] = reviews[i];
				pocetNalezenychPrvku++;
			}
		}
		  allReviews = plnePoleForReview(allReviews, pocetNalezenychPrvku);
		  return allReviews;
	  }
	  
	  

	
	  @Override 
	  public String toString() {
		  return "ReviewDatabase [reviews=" + Arrays.toString(reviews) + "\n";
	  }
	 
}