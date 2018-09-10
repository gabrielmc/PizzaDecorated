package interfaces;


public class PizzaDecorator implements IComponent {
    
    protected IComponent decorated;

    protected PizzaDecorator() {
    }
    
    protected PizzaDecorator(IComponent decorated) {
        this.decorated = decorated;
    }
    
    public void setDecorated(IComponent decorated) {
        this.decorated = decorated;
    }
    
    @Override
    public void fazerPizza() {
        decorated.fazerPizza();
    }
}
