package com.adapter.design.pattern;

public class VLCPlayer implements AdvanceMediaPlayer {

	@Override
	public void playVLC(String fileName) {
		System.out.println("Playing VLC file : " + fileName);

	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub

	}

}
