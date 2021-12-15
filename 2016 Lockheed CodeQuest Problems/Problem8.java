import java.util.*;

public class Problem8 {
	public static class Song implements Comparable<Song> {
		String name, artist;

		public Song(String name, String artist) {
			this.name = name;
			this.artist = artist;
		}

		public String toString() {
			return name + " - " + artist;
		}

		public int compareTo(Song other) {
			if (this.name.equals(other.name)) {
				return this.artist.compareTo(other.artist);
			} else {
				return this.name.compareTo(other.name);
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for (int i = 0; i < cases; i++) {
			ArrayList<Song> songs = new ArrayList<Song>();
			int numSongs = in.nextInt();
			in.nextLine();
			for (int j = 0; j < numSongs; j++) {
				String individualSong[] = in.nextLine().split(" - ");
				String individualSong1[] = individualSong[1].split(" ");
				String artist = "";
				if (individualSong1[0].equals("The")) {
					for (int k = 1; k < individualSong1.length; k++) {
						artist += individualSong1[k] + " ";
					}
				}
				else {
					artist = individualSong[1];
				}
				songs.add(new Song(individualSong[0], artist));
			}
			Collections.sort(songs);
			for (Song s : songs) {
				System.out.println(s);
			}

		}
	}
}
