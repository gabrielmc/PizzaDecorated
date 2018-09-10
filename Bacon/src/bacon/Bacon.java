package bacon;

import interfaces.IPlugin;
import interfaces.PizzaDecorator;

public class Bacon extends PizzaDecorator implements IPlugin {

    public Bacon() {
        super(null);
    }
    
    @Override
    public void fazerPizza() {
        decorated.fazerPizza();
        System.out.print("| Bacon |");
    }

    @Override
    public void initialize() {
    }
}

