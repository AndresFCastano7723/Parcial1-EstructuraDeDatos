/*
Código hecho por:
Andrés Felipe Castaño Pinilla - 20231578079
*/
package Ejecutar;

public class Listas {
    public Nodo primero = null;
    public Nodo ultimo = null;
    
    public Listas(){
    }
    
    public void anadir(Nodo nuevo){
        if(nuevo != null){
            if(primero == null){
                primero = nuevo;
                ultimo = nuevo;
            }else{
                if(nuevo.valor < primero.valor){
                    nuevo.sig = primero;
                    primero = nuevo;
                }else{
                    if(nuevo.valor < ultimo.valor){
                        Nodo post = primero.sig;
                        Nodo pre = primero;
                        while(post != null){
                            if(nuevo.valor < post.valor){
                                nuevo.sig = post;
                                pre.sig = nuevo;
                                break;
                            }else{
                                pre = pre.sig;
                                post = post.sig;
                            }
                        }
                    }else{
                        ultimo.sig = nuevo;
                        ultimo = nuevo;
                    }
                }
            }
        }
    }
    
    public void imprimir(){
        Nodo correr = primero;
        while(correr != null){
            correr.imprimir();
            correr = correr.sig;
        }
    }

}
