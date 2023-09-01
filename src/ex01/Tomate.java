public class Tomate extends ToppingDecorator{

    public Tomate(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double custo() {
        return pizza.custo() + 7.0;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + " com tomate";
    }
}
