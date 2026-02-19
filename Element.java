/**
Die Klasse Element stellt ein einzelnes Element dar.
Sie speichert einen Wert (Object) und ermöglischt den
zugriff auf das nächste Element in der Dynamischen Datenstrukturen.
**/
public class Element{
  private Object value;
  private Element next;
  
  public Element(Object pValue,Element pNext){
    value = pValue;
    next = pNext;
    }
  public Object getValue(){
    return value;
    }
  public void setValue(Object pValue){
    value = pValue;
    }
  public Element getNext(){
    return next;
    }
  public void setNext(Element pNext){
    next = pNext;
    }

  }
