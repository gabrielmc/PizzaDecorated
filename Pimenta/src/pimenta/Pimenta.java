package pimenta;

import interfaces.IPlugin;
import interfaces.PizzaDecorator;

public class Pimenta extends PizzaDecorator implements IPlugin{

    public Pimenta() {
        super(null);
    }
    
    @Override
    public void fazerPizza() {
        decorated.fazerPizza();
        System.out.print("| Pimenta |");
    }

    @Override
    public void initialize() {
    }
}
