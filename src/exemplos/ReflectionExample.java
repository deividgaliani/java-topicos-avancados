package exemplos;

import models.Produto;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionExample {

    public static void main(String[] args) {
        //instancia da classe produto
        Produto p = new Produto("Geladeira", 3000.00);

        //instancia da classe
        Class cl = p.getClass();

        Method[] methods = cl.getDeclaredMethods();

        for (Method m : methods){
            System.out.println(m.getName());
            Parameter[] parameters = m.getParameters();
            for(Parameter parameter : parameters){
                System.out.println("    " + parameter);
            }
        }
    }
}
