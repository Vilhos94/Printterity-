public class App {
    public static void main(String[] args) throws Exception {
       System.out.println("Hei olen tulostin ohjelma");
       String tekija = "Ville-Mikko Hakamäki";
       System.out.print("Ohjelman tekijä: ");
       System.out.println(tekija);
       
       //Lukujen määritelmät/ Double koska jakolaskusta ei tule tasalukua
       
       double luku1;
       double luku2;
       double tulo;
       double tulo2;
       double tulo3;
       double tulo4;
       luku1 = 7;
       luku2 = 2;
       
       //Muuttujien arvot
       
       System.out.println(luku1);
       System.out.println(luku2);
       System.out.println("luku1-muuttujan arvo on " + luku1);
       System.out.println("luku2-muuttujan arvo on " + luku2);
       
       //Laskutoimitukset
       
       tulo = luku1 * luku2;
        System.out.println("luku1 * luku2 = " + tulo);
        tulo2 = luku1 / luku2;
        System.out.println("luku1 / luku2 = " + tulo2);
        tulo3 = luku1 + luku2;
        System.out.println("luku1 + luku2 = " + tulo3);
        tulo4 = luku1 - luku2;
        System.out.println("luku1 - luku2 = " + tulo4);
    }          
}