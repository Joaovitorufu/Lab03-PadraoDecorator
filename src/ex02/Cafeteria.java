// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Cafeteria {
    public static void main(String[] args) {
            Cafe decaf = new Decaf();
            Cafe espresso = new Espresso();
            Cafe leite = new Leite(espresso);
            Cafe canela = new Canela(decaf);
            Cafe chocolate = new Chocolate(decaf);


        System.out.println(leite.custo());
        System.out.println(leite.descricao());

        System.out.println();

        System.out.println(canela.custo());
        System.out.println(canela.descricao());

        System.out.println();

        System.out.println(chocolate.custo());
        System.out.println(chocolate.descricao());

    }

    }
