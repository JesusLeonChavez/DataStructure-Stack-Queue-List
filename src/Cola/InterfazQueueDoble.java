
package Cola;


public interface InterfazQueueDoble<E> {
    
    public int Size(); // duelve el tamaño
    public boolean IsEmpty(); // si esta vacia
    public E Front(); // devuelve el primer elemento
    public E Tail(); // devuelve el ultimo elemento
    public void Enqueue(E elemento); // poner en la cola
    public void Dequeue(); //quitar de la cola
    
}
