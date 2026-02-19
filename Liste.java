public class Liste{
  private Queue anfrage;
  
  public Liste(){
    anfrage = new Queue();
    }
  public void neueAnfrage(Kunde pKunde) {
    anfrage.enqueue(pKunde);
    pKunde.ausgabeKundenanfrage();
  }
  public void ausgabekundeanfrage(){
    if (!anfrage.isEmpty()) {
      Kunde test = (Kunde) (anfrage.front());
      test.ausgabeKundenanfrage();
      anfrage.dequeue();
    } // end of if
    else {
      System.out.println("Keine Kundenanfragen in der Liste!");
    } // end of if-else
    }
  public void ausgabealleAnfragen(){
    while (!anfrage.isEmpty()) { 
      ausgabekundeanfrage();
    } // end of while
    }
  public static void main(String[]args) {
    Kunde eins = new Kunde("Anfrage");
    Kunde zwei = new Kunde("Preis");
    Liste test = new Liste();
    test.neueAnfrage(eins);
    test.neueAnfrage(zwei);
    System.out.println();
    test.ausgabealleAnfragen();
  }
  }