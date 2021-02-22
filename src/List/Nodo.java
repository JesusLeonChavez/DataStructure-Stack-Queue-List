
package List;


public class Nodo <E>{
    //Atributos
    E elemento;
    Nodo<E> prev;
    Nodo<E> next;
    
    //Constructor
    public Nodo(){
        elemento = null;
        prev = null;
        next = null;
    }

    //Metodos especiales
    public E getElemento() {
        return elemento;
    }

    public void setElemento(E elemento) {
        this.elemento = elemento;
    }

    public Nodo<E> getPrev() {
        return prev;
    }

    public void setPrev(Nodo<E> prev) {
        this.prev = prev;
    }

    public Nodo<E> getNext() {
        return next;
    }

    public void setNext(Nodo<E> next) {
        this.next = next;
    }      
}
