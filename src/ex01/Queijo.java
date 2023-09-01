public class Queijo extends ToppingDecorator{

    public Queijo(Pizza pizza) {

        super(pizza);
    }
    public double custo() {

        return pizza.custo() + 5.0;
    }

    @Override
    public String getDescricao() {

        return pizza.getDescricao()+" com queijo";
    }
}
