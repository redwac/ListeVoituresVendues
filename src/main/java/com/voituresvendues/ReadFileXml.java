package com.voituresvendues;


import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;


public class ReadFileXml {
	
	public ReadFileXml() {
    }
    int sommeVente ;

    public void afficherSurConsole(){

        try
        {

//creating a constructor of file class and parsing an XML file
            File file = new File("C:\\Users\\Toshiba\\Desktop\\DOC\\JAVA\\S1_GIT\\ReadDataXlm\\voitures_vendus.xml");
//an instance of factory that gives a document builder
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//an instance of builder to parse the specified xml file
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList =  doc.getElementsByTagName("voiture");
            
// nodeList is not iterable, so we are using for loop

            for (int itr = 0; itr < nodeList.getLength(); itr++)
            {
                Node node =   nodeList.item(itr);
                System.out.println("\nNode Name :" + node.getNodeName());


                if (node.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element eElement = (Element) node;
                    int montant = Integer.parseInt(eElement.getElementsByTagName("prix").item(0).getTextContent());
                    sommeVente = sommeVente + montant;
                    System.out.println("la réference de voiteure est : "+ eElement.getElementsByTagName("reference").item(0).getTextContent());
                    System.out.println("la marque de voiture est : "+ eElement.getElementsByTagName("marque").item(0).getTextContent());
                    System.out.println("Le modéle de voiture est : "+ eElement.getElementsByTagName("modele").item(0).getTextContent());
                    System.out.println("date_de_vente de voiture est : "+ eElement.getElementsByTagName("date_de_vente").item(0).getTextContent());
                    System.out.println("prix : "+ eElement.getElementsByTagName("prix").item(0).getTextContent());
                    System.out.println("client : "+ eElement.getElementsByTagName("client").item(0).getTextContent());


                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void afficherVentesTotal(){
        System.out.println("totale des ventes de voitures est : "+sommeVente+" DH");
    }


}
