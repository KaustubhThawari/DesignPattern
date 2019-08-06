package com.adapter.design.pattern;

public class MediaAdapter implements MediaPlayer {

	AdvanceMediaPlayer advancedMusicPlayer;
	
	public MediaAdapter(String mediaType) {
		if("vlc".equalsIgnoreCase(mediaType)) {
			advancedMusicPlayer = new VLCPlayer();
		}else if("mp4".equalsIgnoreCase(mediaType)) {
			advancedMusicPlayer = new Mp4Player();
		}
	}
	
	@Override
	public void play(String audioType, String fileName) {
		
		if(audioType.equalsIgnoreCase("vlc")){
	         advancedMusicPlayer.playVLC(fileName);
	      }
	      else if(audioType.equalsIgnoreCase("mp4")){
	         advancedMusicPlayer.playMp4(fileName);
	      }else {
	    	  System.out.println("Media tyoe not supported");
	      }
	}

}
