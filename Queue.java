/**
Die Klasse Queue implementiert eine Warteschlange:
Elemente werden am Ende der Queue eingefügt (enqueue)
und am Anfang der Queue entfernt (dequeue).
**/
public class Queue{
  private Element first;
  private Element last;
  
  public Queue(){
    first = null;
    last = null
    }
  //Gibt den  ersten Wert des Elements der Queue zurück.
  public Object front(){
    if (isEmpty()) {
      return null;
    } // end of if
    return first.getValue();
    }
  //Fügt ein Element in die Queue ein.
  public void enqueue(Object pObject){
    if (pObject!=null) {
      Element element=new Element(pObject,null);
      if (isEmpty()) {
        first=element;
      } else {
        last.setNext(element);
      } // end of if-else
      last=element;
    }
    }
  // löscht das Erste Element in der Queue.
  public void dequeue(){
    if (!isEmpty()) {
      first=first.getNext();
      if (first==null) {
        last=first;
      } // end of if
    }
  }
  //Prüft ob die Queue leer ist.
  public boolean isEmpty(){
    return first==null;
    }        
  }

