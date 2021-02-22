
package List;


public interface InterfaceDoubleLinkedList<E> {
    
    public void addFirst(E elemento); //añade elemento al principio
    public void addLast(E elemento); //añade elemento al final
    public void add(E elemento, int index); //añade elemento en posicion
    public void removeFirst(); //elimina el primer elmenento
    public void removeLast(); //elimina el ultimo elemento
    public void remove(int index); //elimina elemento index
    public boolean isEmpty(); //esta vacio?
    public int size(); //tamaño
    public E getFirst(); //devuelve el primer elemento
    public E getLast(); //devuelve el ultimo elemento
    public E get(int index); //devuelve el elemento index
    public boolean contains(E elemento); //contiene este elemento
    
}
