/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3tadpilas;

import java.util.ArrayList;
import java.util.Stack;

/**
Ejercicio 1 Implemente la clase pila, se trata de una pila de enteros, 
la misma debe contener

los métodos: push(), pop(), pilaVacia(), PilaLlena(), verElemento()
Cree un objeto de la clase y verifique sus métodos.

Ejercicio 2

Agregue a la clase un método invierteSimple que usando la pila original 
y 2 pilas vacía deje en la pila original los elementos invertidos

Agregue a la clase un método invierteEficiente que usando la pila 
original y 1 pila vacía y una variable deje en la pila original los 
elementos invertidos
 */
public class Pila {
    private ArrayList<Integer> pila;
    private int size;

    public Pila(int size) {
        this.pila = new ArrayList<Integer>();
        this.size = size;
    }
    
    //    private Stack<Integer> test;
    
    public void push(int entero){
        if(!PilaLlena()){
            pila.add(entero);
        }else{System.out.println("La pila esta llena y no se puede agregar mas elementos");}
    }
    public Integer pop(){
        if(!pilaVacia()){
            int retorno = verElemento();
            pila.removeLast();
            return retorno;
        }
        System.out.println("La pila esta vacia y no se puede quitar mas elementos");
        return null;
        
//        return pila.get(pila.size()-1);
    }
    public boolean pilaVacia(){
        return pila.isEmpty();
    }
    public boolean PilaLlena(){
        return pila.size() == this.size;

    }
    public Integer verElemento(){
        if(!pilaVacia()){
            System.out.println(pila.getLast());
              return pila.getLast();
        }
        System.out.println("La pila esta vacia y no se puede quitar mas elementos");
        return null;
    }
    
    public Pila invierteEficiente(){
        Pila p2 = new Pila(this.size);
        for (int i = 0; i < this.size; i++) {
            p2.push(pop());
        }
        return p2;
    }
    
    public void invierteSimple(){
        Pila p2 = new Pila(this.size);
        Pila p3 = new Pila(this.size);
        for(int i = 0; i < this.size; i++){
            p2.push(pop());
        }
        for(int i=0; i< this.size; i++){
            p3.push(p2.pop());
        }
        for(int i=0; i< this.size; i++){
            push(p3.pop());
        }
    }

    @Override
    public String toString() {
        if(!pilaVacia()){
        return "Pila {" + pila + '}';
        }
        return "";
    }
    

    
}
