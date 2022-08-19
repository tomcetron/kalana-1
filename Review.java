
public class Review {
	
	private Game game;
	private Author author;
	private int score;
	
	public Review(Game game, Author author, int score) {
		this.game = game;
		this.author = author;
		this.score = score;
	}
	
	

	public Game getGame() {
		return game;
	}

	public Author getAuthor() {
		return author;
	}


	public int getScore() {
		return score;
	}
	
	public String getInfo() {
		return "Game:" + game + ", author is: " + author +  ", score is: " + score;
	}


	@Override
	public String toString() {
		return "Review [game=" + game + ", author=" + author + ", score=" + score + "]";
	}





}
