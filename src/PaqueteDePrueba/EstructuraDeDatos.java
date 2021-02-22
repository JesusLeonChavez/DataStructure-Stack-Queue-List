package PaqueteDePrueba;

import Cola.QueueDoble;
import List.DoubleLinked;
import Pila.Pila;

public class EstructuraDeDatos {

    public static void main(String[] args) {
        /* PILA
         Pila p = new Pila();
         String s1 = "1";
         String s2 = "2";
         String s3 = "3";
        
         p.Push(s1);
         String resultado = (String) p.top();
         System.out.println(resultado);
        
         p.Push(s2);
         resultado = (String) p.top();
         System.out.println(resultado);
        
         p.Push(s3);
         resultado = (String) p.top();
         System.out.println(resultado);
        
         p.Pop();
         resultado = (String) p.top();
         System.out.println(resultado);
        
         p.Pop();
         resultado = (String) p.top();
         System.out.println(resultado);
        
         p.Pop();
         resultado = (String) p.top();
         System.out.println(resultado);
        
         p.Pop();*/
        
        
        
        
        
        /*COLA
        QueueDoble c = new QueueDoble();

        String s1 = "1";
        String s2 = "2";
        String s3 = "3";

        c.Enqueue(s1);
        c.Enqueue(s2);
        c.Enqueue(s3);

        c.Dequeue();
        c.Dequeue();
        c.Dequeue();
        c.Dequeue();
        
        if(c.Front() != null){
            System.out.println(c.Front().toString());
        }*/
        
        DoubleLinked<String> d1 = new DoubleLinked<String>();
        String s1 = "1";
        String s2 = "2";
        String s3 = "3";
        String s4 = "4";
        
        d1.addLast(s1);
        d1.addLast(s2);
        d1.addLast(s3);
        d1.addLast(s4);
        
        String s5 = "Leonidas";
        d1.add(s5, 2);
        String resultado = "";
        
        DoubleLinked<String> d2 = new DoubleLinked<String>();
        
        while(d1.isEmpty() == false){
            //consultar
            System.out.println(d1.getFirst());
            //consultar lista2
            d2.addLast(d1.getFirst());
            //destruir lista1
            d1.removeFirst();
            
        }
        
        //Asingar la lista 1
        d1 = d2;
        
        System.out.println("");
        System.out.println(d1.get(5));

    }

}
