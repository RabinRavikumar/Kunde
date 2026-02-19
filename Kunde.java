/**
Die Klasse Kunde repräsentiert eine einzelne Kundenanfrage im System. 
Sie speichert den Inhalt der Anfrage als Text und stellt
eine Methode zur Verfügung, um diese Anfrage auszugeben.
**/
public class Kunde {
  private String kundenanfrage;
  
  public Kunde (String kundenanfrage){
    this.kundenanfrage = kundenanfrage;
    } 
  public void ausgabeKundenanfrage(){
    System.out.println("Kundenanfrage: " + kundenanfrage);
    }

  }
