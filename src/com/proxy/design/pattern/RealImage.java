package com.proxy.design.pattern;

public class RealImage implements Image{
	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFileFromDisk(fileName);
	}

	@Override
	public void display() {
		System.out.println("Display "+ fileName);
		
	}; 
	
	
	public void loadFileFromDisk(String fileName){
		System.out.println("Loading "+ fileName);
	}
	
	
	

}
