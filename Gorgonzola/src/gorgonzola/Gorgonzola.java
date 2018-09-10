package gorgonzola;

import interfaces.IPlugin;
import interfaces.PizzaDecorator;

public class Gorgonzola extends PizzaDecorator implements IPlugin {

    public Gorgonzola() {
        super(null);
    }
    
    @Override
    public void fazerPizza() {
        decorated.fazerPizza();
        System.out.print("| Gorgonzola |");
    }

    @Override
    public void initialize() {
    }
}
