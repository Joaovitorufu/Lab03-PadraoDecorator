public class Leite extends ToppingDecorator {
    public Leite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double custo() {
        return cafe.custo()+2.5;
    }

    @Override
    public String descricao() {
        return cafe.descricao()+ " Com leite";
    }
}
