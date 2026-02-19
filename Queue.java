public class Queue{

  private Element first;
  private Element last;
  
  public Queue(){
  
    }
    
  public Object front(){
    if (isEmpty()) {
      return null;
    } // end of if
    return first.getValue();
    }
    
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
    
  public void dequeue(){
    if (!isEmpty()) {
      first=first.getNext();
      if (first==null) {
        last=first;
      } // end of if
    }
  }
    
  public boolean isEmpty(){
    return first==null;
    }        


  }