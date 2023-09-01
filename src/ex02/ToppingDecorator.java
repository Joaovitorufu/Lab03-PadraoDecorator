public class ToppingDecorator implements Cafe{

    Cafe cafe;

    public ToppingDecorator (Cafe cafe){
        this.cafe = cafe;
    }
    @Override
    public double custo() {
        return cafe.custo();
    }

    @Override
    public String descricao() {
        return cafe.descricao();
    }
}
