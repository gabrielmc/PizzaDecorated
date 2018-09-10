package parmesao;

import interfaces.IPlugin;
import interfaces.PizzaDecorator;

public class Parmesao extends PizzaDecorator implements IPlugin {

    public Parmesao() {
        super(null);
    }
    
    @Override
    public void fazerPizza() {
        decorated.fazerPizza();
        System.out.print("| Parmesão |");
    }

    @Override
    public void initialize() {
    }
}
