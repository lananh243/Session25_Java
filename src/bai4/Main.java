package bai4;

public class Main {
    public static void main(String[] args) {
        MediaAdapter mediaAdapter = new MediaAdapter();
        mediaAdapter.play("mp3", "song.mp3");
        mediaAdapter.play("mp4", "music.mp4");
        mediaAdapter.play("vlc", "movie.vlc");
    }
}
