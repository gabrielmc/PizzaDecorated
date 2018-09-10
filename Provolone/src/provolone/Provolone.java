package provolone;

import interfaces.IPlugin;
import interfaces.PizzaDecorator;

public class Provolone extends PizzaDecorator implements IPlugin {

    public Provolone() {   
        super(null);
    }
    
    @Override
    public void fazerPizza() {
        decorated.fazerPizza();
        System.out.print("| Provolone |");
    }

    @Override
    public void initialize() {
    }

}
