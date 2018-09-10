package classes;

import interfaces.IComponent;
import interfaces.PizzaDecorator;

public class MassaPizza extends PizzaDecorator { 

    public MassaPizza(IComponent decorated) {
        super(decorated);
    }
    
     public MassaPizza() {
        super(null);
    }

    @Override
    public void fazerPizza() {
        System.out.print("| Massa de pão, Queijo, Molho | ");
    } 
}