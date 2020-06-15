package com.voituresvendues;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import java.beans.XMLEncoder;
import java.beans.XMLDecoder;

public class Main {

    public static void main(String[] args) {
    	
    	
    	
    	UUID uuid = UUID.randomUUID();
	// write your code here
    	ReadFileXml readFileXml = new ReadFileXml();
        readFileXml.afficherSurConsole();
        //System.out.println(rf);
        System.out.println("\n");
        readFileXml.afficherVentesTotal();


            System.out.println("vous voullez ajouter une nouvelle voiture ? o/n");
            Scanner scanner = new Scanner(System.in);
            String ligneSuivante = scanner.nextLine();
            //System.out.println(ligneSivant);

            List<VoitureVendue> listeVoituresVendues = new ArrayList();
            
            VoitureVendue voitureVendue = new VoitureVendue();

            while (ligneSuivante.equals("o")){
            //if(ligneSivant.equals("o"))

            	
                
                
                
                
                System.out.println("donnez la marque du voiture ");
             
                voitureVendue.setMarque(scanner.nextLine());
                
                voitureVendue.setReference(uuid);

                System.out.println("donnez le modèle du voiture ");

                voitureVendue.setModele(scanner.nextLine()); 

                System.out.println("donnez la date de vente du voiture ");

                voitureVendue.setDateDeVente(scanner.nextLine()); 

                System.out.println("donnez le prix du vente ");

                voitureVendue.setPrix(scanner.nextLine());

                System.out.println("donnez le nom du client ");
                //vtr = new Scanner(System.in);
                voitureVendue.setClient(scanner.nextLine());
               
                listeVoituresVendues.add(voitureVendue);
                System.out.println("vous voullez ajouter une autres voiture ? o/n");
                //scanner = new Scanner(System.in);
                ligneSuivante = scanner.nextLine();

            }
                System.out.println("\n") ;
                System.out.println("la liste des voitures nouvellement vendues");
                System.out.println("\n");

            	 String clientencode = voitureVendue.getClient();
                 String clt = Base64.getEncoder().encodeToString(clientencode.getBytes());
                 
                
                for (int index=0; index < listeVoituresVendues.size(); index++){
               
                	

             //Object v =new VoitureVendu();
             VoitureVendue voitureVendueAAfficher = listeVoituresVendues.get(index);
             System.out.println("le référence du voiture est : " + voitureVendueAAfficher.getReference());
             System.out.println("la marque du voiture est : " + voitureVendueAAfficher.getMarque());
             System.out.println("le modéle du voiture est : " + voitureVendueAAfficher.getModele());
             System.out.println("la date du vente est :" + voitureVendueAAfficher.getDateDeVente());
             System.out.println("le prix de vente est : " + voitureVendueAAfficher.getPrix());
             System.out.println("le nom du client est : " + voitureVendueAAfficher.getClient());
             System.out.println("le nom du client encodé est : " + clt );
             
             System.out.println("\n");


            }


    }
}

