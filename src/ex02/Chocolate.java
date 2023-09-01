public class Chocolate extends ToppingDecorator{
    public Chocolate(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String descricao() {
        return cafe.descricao()+ " com chocolate";
    }

    @Override
    public double custo() {
        return cafe.custo()+ 6.0;
    }
}
