
package Cola;


public class ColaDobleNodo<E> {
    //Atributos
    private E elemento;
    private ColaDobleNodo<E> prev;
    private ColaDobleNodo<E> next;

    //Metodos especiales
    public ColaDobleNodo(){
        elemento = null;
        prev = null;
        next = null;
    }
    
    public E getElemento() {
        return elemento;
    }

    public void setElemento(E elemento) {
        this.elemento = elemento;
    }

    public ColaDobleNodo<E> getPrev() {
        return prev;
    }

    public void setPrev(ColaDobleNodo<E> prev) {
        this.prev = prev;
    }

    public ColaDobleNodo<E> getNext() {
        return next;
    }

    public void setNext(ColaDobleNodo<E> next) {
        this.next = next;
    }
      
}
