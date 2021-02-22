
package Pila;


public interface InterfazPila <E>{
    
    public void Push(E elemento); //añade elementos
    public void Pop(); //extrae el elemento de la cima
    public int Size(); //devuelve el tamaño de la pila
    public boolean isEmpty(); //pregunta si esta vacia
    public E top(); //devuelve el elemento de la cima de la pila
        
}
