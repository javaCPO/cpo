


import java.io.*;
public class  SalleCinema {
	
	public SalleCinema(){
		if(tarif<0 || nbnbPlaces<0 || nbPlacesVendues<0 ){
			throw new Exception();
		}else {
			
		this.tarif=tarif;
		film=this.film;
		this.nbPlaces=nbPlaces;
		this.nbPlacesVendues=nbPlacesVendues;
		}}
	
	public string getfilm() {return film;}
	public float gettarif() {return tarif;}
	public void settarif(float tarif){this.tarif = tarif;}
	public float getnbPlaces() {return nbPlaces;}
	
	 public string film;
	 private int nbPlaces;
	 private  float tarif;
	 public int nbPlacesVendues; 
	 
	 
	 public void vendrePlace()
	 {
		 if((estPlein())==false)
			 nbPlace++;
	 }
	 
	 estPleine(){
		 if(nbPlaces==nbPlacesVendues)
			 {return true ; }
		 return false;
	 }
	 
	  public int nbPlacesDisponibles()
	  {
		  return (nbPlaces-nbPlacesVendues);
	  }
	  
	  public float tauxRemplissage(){
		  return (nbPlacesVendues/nbPlaces);
	  }
	  
	 public float chiffreAffaires()
	 {
		return (nbPlacesVendues*tarif); 
	 }
	 
	 @Override
	  public string tostring()
	  {
		 return "tarif= " + String.valueOf(this.tarif) + ", nombre de plance= \n"
				 + String.valueOf(this.nbPlaces) + ", Taux remplissage= \n" +tauxRemplissage()+
				 ", Chiffre d'affaire= \n" +chiffreAffaires()+;  
	  }
	
}
