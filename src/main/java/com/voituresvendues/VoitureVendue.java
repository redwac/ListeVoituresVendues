package com.voituresvendues;

import java.util.Base64;
import java.util.UUID;

public class VoitureVendue {
	
	private UUID reference ;
    private String marque;
    private String modele;
    private String dateDeVente;
    private String prix;
    private String client;
    
	public UUID getReference() {
		return reference;
	}
	public void setReference(UUID uuid) {
		this.reference = uuid;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getDateDeVente() {
		return dateDeVente;
	}
	public void setDateDeVente(String dateDeVente) {
		this.dateDeVente = dateDeVente;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	
	/* fonction pour l'encodage
	 * 
	 public static String encode(String str){
		Base64.Encoder encoder = Base64.getEncoder();
		byte[] encoded = encoder.encode(str.getBytes());
		return new String(encoded);
		}
	*/
    
    

}
