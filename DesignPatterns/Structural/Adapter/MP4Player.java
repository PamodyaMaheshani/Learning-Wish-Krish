package Adapter;

public class MP4Player implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
				
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing MP4 file. Name: " + fileName);			
		
	}

}
