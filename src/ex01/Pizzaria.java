

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Pizzaria {
    public static void main(String[] args) {
        Pizza massaFina = new MassaFinaPizza();
        Pizza massaEspessa = new MassaEspessaPizza();
        Pizza mar = new Ovo(massaFina);
        Pizza que = new Queijo(massaEspessa);
        Pizza quei = new Queijo(massaFina);

        System.out.println(mar.custo());
        System.out.println(mar.getDescricao());

        System.out.println(que.custo());
        System.out.println(que.getDescricao());

        System.out.println(quei.custo());
        System.out.println(quei.getDescricao());


    }
}
