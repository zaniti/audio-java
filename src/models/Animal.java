package models;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Animal {
	private boolean vegetarian;
	private String food;
	private int noOfLegs;
	
	public Animal() {}
	
	public Animal(boolean veg, String food, int noOfLegs) {
		this.vegetarian = veg;
		this.food = food;
		this.noOfLegs = noOfLegs;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Vegetarian ? " + vegetarian + ", Food=" + food + ", Number of legs=" + noOfLegs + ". ";
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	

	public void ReadSound(String effectSource) throws UnsupportedAudioFileException, IOException, 
			LineUnavailableException{
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(effectSource));
			Clip clip = AudioSystem.getClip();
			clip.open(audioIn);
			clip.start();
			System.out.println(effectSource+" sound is start ! ");
			System.out.println("s : "+clip.isActive());
			while(clip.isActive()) {
			//System.out.println("hola "+effectSource);
			}
			clip.close();
			System.out.println(effectSource+" sound is end ! ");
			}

}
