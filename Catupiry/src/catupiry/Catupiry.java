package catupiry;

import interfaces.IPlugin;
import interfaces.PizzaDecorator;

public class Catupiry extends PizzaDecorator implements IPlugin{

    public Catupiry() {
        super(null);
    }
    
    @Override
    public void fazerPizza() {
        decorated.fazerPizza();
        System.out.print("| Catupiry |");
    }

    @Override
    public void initialize() {
    }

}
