public class Game {
	
	private String name;
	private String genre;


	public Game(String name, Genre genres) {
		this.name = name;
		this.genre = genres.toString();
	}

	public String getName() {
		return name;
	}

	public String getGenre() {
		return genre;
	}
	
	
	
	public String getInfo() {
		return "Name is: " + name + " genre is: " + genre + "."; 
	}
	
	
	@Override
	public String toString() {
		return "Game [name=" + name + ", genre=" + genre + "]";
	}
	

}
