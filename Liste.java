/**
Die Klasse Liste verwaltet Kundenanfragen mithilfe einer Queue.
Neue Anfragen werden der Queue hinzugefügt, einzelne Anfragen
können ausgegeben und entfernt werden, und es besteht die
Möglichkeit, alle gespeicherten Anfragen nacheinander
abzuarbeiten.
**/
public class Liste{
  private Queue anfrage;
  
  public Liste(){
    anfrage = new Queue();
    }
  public void neueAnfrage(Kunde pKunde){
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
  }

