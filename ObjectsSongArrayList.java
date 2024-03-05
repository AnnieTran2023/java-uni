import java.util.ArrayList;

class Song {
	private String name;
	private String artist;
	private int year;

	public Song(String name, String artist, int year) {
		this.name = name;
		this.artist = artist;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String toString() {
		return String.format("%s: %s (%d)", artist, name, year);
	}

}
public class ObjectsSongArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Song> songLists = new ArrayList<Song>();
		
		songLists.add(new Song("Easy on Me", "Adele", 2021));
		songLists.add(new Song("Shivers", "Ed Sheeran", 2021));
		songLists.add(new Song ("Holy Ghost Fire", "Larkin Poe", 2020));
		
		System.out.println("=== List of songs ===");
		for (Song song : songLists) {
			System.out.println(song);
		}
	}

}
