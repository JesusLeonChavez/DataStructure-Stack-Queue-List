
package Cola;


public class QueueDoble<E> implements InterfazQueueDoble<E>{
    //Atributos
    ColaDobleNodo<E> head;
    ColaDobleNodo<E> tail;
    int size;
    
    //Metodos especiales
    public QueueDoble(){
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int Size() {
        return size;
    }

    @Override
    public boolean IsEmpty() {
        if(this.Size() == 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public E Front() {
        E elemento;
        if(this.IsEmpty()){
            elemento = null;
            System.out.println("La cola esta vacia");          
        }else{
            elemento = this.head.getElemento();
        }
        
        return elemento; 
    }

    @Override
    public E Tail() {
         E elemento;
        if(this.IsEmpty()){
            elemento = null;
            System.out.println("La cola esta vacia");          
        }else{
            elemento = this.tail.getElemento();
        }
        
        return elemento; 
    }

    @Override
    public void Enqueue(E elemento) {
        if(this.IsEmpty()){
            ColaDobleNodo<E> newnodo = new ColaDobleNodo<E>();
            newnodo.setElemento(elemento);
            newnodo.setNext(null);
            newnodo.setPrev(null);
            this.head = newnodo;
            this.tail = newnodo;
            this.size = 1;
        }else{
            ColaDobleNodo<E> newnodo = new ColaDobleNodo<E>();
            newnodo.setElemento(elemento);
            newnodo.setPrev(tail);
            newnodo.setNext(null);
            this.tail.setNext(newnodo);
            tail = newnodo;
            this.size++;
        }
    }

    @Override
    public void Dequeue() {
        if(this.IsEmpty()){
            System.out.println("La cola esta vacia");
        }else{
            head = head.getNext();
            this.size--;
        }
    }   
}
