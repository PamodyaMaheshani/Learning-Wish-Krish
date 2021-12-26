package Adapter;

public class AdapterMain {
	
	public static void main(String[] args) {
		
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "I would.mp3");
	    audioPlayer.play("mp4", "What make you beautiful.mp4");
	    audioPlayer.play("vlc", "Tell my why.vlc");
	    audioPlayer.play("avi", "Fire.avi");
	}

}
