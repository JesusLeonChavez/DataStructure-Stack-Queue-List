package Pila;

public class Pila<E> implements InterfazPila<E> {
    //Atributos
    int size;
    NodoPila<E> cima;
    
    //Constructor
    public Pila(){
        size = 0;
        cima = null;
    }
    
    //Metodos
    @Override
    public void Push(E elemento) {
        if(this.isEmpty()){
            NodoPila<E> p1 = new NodoPila<E>();
            p1.setElemento(elemento);
            p1.setPrev(null);
            cima = p1;
            this.size = 1;
        }else{
            NodoPila<E> p1 = new NodoPila<E>();
            p1.setElemento(elemento);
            p1.setPrev(cima);
            cima = p1;
            this.size = size + 1;
        }
    }

    @Override
    public void Pop() {
        if(this.isEmpty()){
            System.out.println("La pila esta vacia");
        } else{
            cima = cima.getPrev();
            this.size--;
        }
              

    }

    @Override
    public int Size() {
        return this.size; 
    }

    @Override
    public boolean isEmpty() {
        if(this.Size() == 0){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public E top() {
        E elemento;
        if(this.isEmpty()){
            elemento = null;
            System.out.println("La pila esta vacia");
        }else{
            elemento = cima.getElemento();
        }
        
        return elemento;
    }

}
