package bai4;

public class MediaAdapter implements MediaPlayer {
    AdvanceMediaPlayer advanceMediaPlayer = new AdvanceMediaPlayer();

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer.playVlc(fileName);
        } else {
            System.out.println("Định dạng không hợp lệ. " + audioType + " không được hỗ trợ");
        }
    }
}
