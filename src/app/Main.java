package app;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


import models.Tigre;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		
		Tigre tigre = new Tigre(false,"Meat",4,100,"Les iles de l'Inde","C:\\Users\\Admin\\Music\\tigre.wav");
		System.out.println(tigre.toString());
		System.out.println("Tigre sound : ");
		
		tigre.ReadSound(tigre.getSonTigre());
		
		

	}

}
