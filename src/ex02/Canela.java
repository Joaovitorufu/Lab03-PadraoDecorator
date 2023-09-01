public class Canela extends ToppingDecorator{
    public Canela(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String descricao() {
        return cafe.descricao()+" Com canela";
    }

    @Override
    public double custo() {
        return cafe.custo()+ 4.0;
    }
}
