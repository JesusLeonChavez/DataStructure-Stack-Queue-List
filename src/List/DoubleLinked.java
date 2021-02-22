
package List;



public class DoubleLinked<E> implements InterfaceDoubleLinkedList<E> {
    //atributos
    int size;
    Nodo<E> head;
    Nodo<E> tail;
    
    //Metodos especiales
    public DoubleLinked(){
        size = 0;
        head = null;
        tail = null;
    }

    @Override
    public void addFirst(E elemento) {
        //esto añade por la cabecera (izquierda)
        if(this.isEmpty()){
            Nodo<E> newnodo = new Nodo<E>();
            newnodo.setElemento(elemento);
            newnodo.setNext(null);
            newnodo.setPrev(null);
            this.head = newnodo;
            this.tail = newnodo;
            this.size = 1;
        }else{
            Nodo<E> newnodo = new Nodo<E>();
            newnodo.setElemento(elemento);
            newnodo.setNext(this.head);
            newnodo.setPrev(null);
            this.head.setPrev(newnodo);
            this.head = newnodo;  
            this.size++;
        }
    }

    @Override
    public void addLast(E elemento) {
        if(this.isEmpty()){
            Nodo<E> newnodo = new Nodo<E>();
            newnodo.setElemento(elemento);
            newnodo.setNext(null);
            newnodo.setPrev(null);
            this.head = newnodo;
            this.tail = newnodo;
            this.size = 1;
        }else{
            Nodo<E> newnodo = new Nodo<E>();
            newnodo.setElemento(elemento);
            newnodo.setNext(null);
            newnodo.setPrev(this.tail);
            this.tail.setNext(newnodo);
            this.tail = newnodo;  
            this.size++;
        }
    }

    @Override
    public void add(E elemento, int index) {
        if(index == 0){
            
            this.addFirst(elemento);
            
        }else if(index == this.size){
            
            this.addLast(elemento);
            
        }else if(index > this.size()){
            
            System.out.println("El indice es incorrecto");
            
        }else{
            
            DoubleLinked<E> nuevalista = new DoubleLinked<E>();
            int contador = 0;
                    
            while(this.isEmpty() == false){
                
                if(index == contador){
                    nuevalista.addLast(elemento);
                    contador++;
                }else{
                    nuevalista.addLast(this.getFirst());
                    this.removeFirst();
                    contador++;
                }
                
            }
            
            this.head = nuevalista.head;
            this.tail = nuevalista.tail;
            this.size = nuevalista.size;
                    
        }
    }

    @Override
    public void removeFirst() {
        if(this.isEmpty()){
            System.out.println("La lista esta vacia");
        }else{
            this.head = head.getNext();
            this.size--;
        }
    }

    @Override
    public void removeLast() {
        if(this.isEmpty()){
            System.out.println("La lista esta vacia");
        }else{
            this.tail = tail.getPrev();
            this.size--; 
        }
    }

    @Override
    public void remove(int index) {
        if(index == 0){
            
            this.removeFirst();
            
        }else if(index == this.size-1){
            
            this.removeLast();
            
        }else if(index > this.size()){
            
            System.out.println("El indice es incorrecto");
            
        }else{
            
            DoubleLinked<E> nuevalista = new DoubleLinked<E>();
            int contador = 0;
                    
            while(this.isEmpty() == false){
                
                if(index == contador){ 
                    this.removeFirst();
                    contador++;
                }else{
                    nuevalista.addLast(this.getFirst());
                    this.removeFirst();
                    contador++;
                }
                
            }
            
            this.head = nuevalista.head;
            this.tail = nuevalista.tail;
            this.size = nuevalista.size;
                    
        }
        
    }

    @Override
    public boolean isEmpty() {
        if(this.size == 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getFirst() {
        E elemento;
        if(this.isEmpty()){
            elemento = null;
            System.out.println("La lista esta vacia");
        }else{
            elemento = head.getElemento();
        }
        return elemento;        
    }

    @Override
    public E getLast() {
        E elemento;
        if(this.isEmpty()){
            elemento = null;
            System.out.println("La lista esta vacia");
        }else{
            elemento = tail.getElemento();
        }
        return elemento;  
    }

    @Override
    public E get(int index) {
        E elemento = null;
        
        if(index == 0){
            
            elemento = this.getFirst();
            
        }else if(index == this.size){
            
            this.getLast();
            
        }else if(index > this.size()){
            
            System.out.println("El indice es incorrecto");
            
        }else{
            
            DoubleLinked<E> nuevalista = new DoubleLinked<E>();
            int contador = 0;
                    
            while(this.isEmpty() == false){
                
                if(index == contador){ 
                    elemento = this.getFirst();
                    nuevalista.addLast(this.getFirst());
                    this.removeFirst();
                    contador++;
                }else{
                    nuevalista.addLast(this.getFirst());
                    this.removeFirst();
                    contador++;
                }
                
            }
            
            this.head = nuevalista.head;
            this.tail = nuevalista.tail;
            this.size = nuevalista.size;
                    
        }
        
        return elemento;
    }

    @Override
    public boolean contains(E elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
