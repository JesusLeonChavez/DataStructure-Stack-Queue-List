package Pila;

public class NodoPila<E> {

    private E elemento;
    private NodoPila<E> prev; //apuntador al anterior
    
    public NodoPila(){
        elemento = null;
        prev = null;
    }

    public E getElemento() {
        return elemento;
    }

    public void setElemento(E elemento) {
        this.elemento = elemento;
    }

    public NodoPila<E> getPrev() {
        return prev;
    }

    public void setPrev(NodoPila<E> prev) {
        this.prev = prev;
    }    
}
