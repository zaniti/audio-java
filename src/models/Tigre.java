package models;


import java.io.IOException;


import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Tigre extends Wild {
	
	private int poids;
	private String territoire;
	private String sonTigre;
	public Tigre() {
		super();
		
	}
	public Tigre(boolean veg, String food, int noOfLegs, int poids , String territoire, String sonTigre) {
		super(veg, food, noOfLegs);
		this.poids = poids;
		this.territoire = territoire;
		this.sonTigre = sonTigre;
		
	}
	
	@Override
	public String toString() {
		return "Tigre : Weight=" + poids + "Kg, territory=" + territoire+ ", "
				+ super.toString();
	}
	public String getSonTigre() {
		return sonTigre;
	}
	public void setSonTigre(String sonTigre) {
		this.sonTigre = sonTigre;
	}
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	public String getTerritoire() {
		return territoire;
	}
	public void setTerritoire(String territoire) {
		this.territoire = territoire;
	}
	
	
	public void ReadSound(String sonTigre) throws UnsupportedAudioFileException, IOException, 
	LineUnavailableException{
		for(int i = 0;i<3;i++) {
			super.ReadSound(sonTigre);
		}
	}
	
	
	

}
