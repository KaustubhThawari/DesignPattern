package com.adapter.design.pattern;

public class Mp4Player implements AdvanceMediaPlayer {

	@Override
	public void playVLC(String fileName) {
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing Mp4 file : " + fileName);

	}

}
