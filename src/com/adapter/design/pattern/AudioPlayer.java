package com.adapter.design.pattern;

public class AudioPlayer implements MediaPlayer {

	@Override
	public void play(String audioType, String fileName) {
		if("mp3".equals(audioType)) {
			System.out.println("Playing file : " + fileName);
		}else {
			MediaAdapter mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}
	}

}
