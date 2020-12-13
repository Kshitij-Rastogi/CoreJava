import java.io.IOException;
import java.util.Scanner;

public class MusicImage {
    String releasedAs;
    String artist;
    String songName;
    String genre;
    String yearOfRelease;
    String numberOfSongs;
    String duration;

    public String getReleasedAs() {
        return releasedAs;
    }

    public void setReleasedAs(String releasedAs) {
        this.releasedAs = releasedAs;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getNumberOfSongs() {
        return numberOfSongs;
    }

    public void setNumberOfSongs(String numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String fileName = "data/music-catalog.csv";
        ReadFile rf = new ReadFile();
        DoublyLinkedList list = rf.readFile(fileName);
        list.forwardTraverse();
        list.backwardTraverse();
        list.displayPreferred(sc);
    }

    
}