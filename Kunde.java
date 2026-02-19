public class Kunde {
  private String kundenanfrage;
  
  public Kunde (String kundenanfrage){
    this.kundenanfrage = kundenanfrage;
    } 
  public void ausgabeKundenanfrage(){
    System.out.println("Kundenanfrage: " + kundenanfrage);
    }
  }