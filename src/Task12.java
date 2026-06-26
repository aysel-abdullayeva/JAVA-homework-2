public class Task12 {
    public static void main(String[] args) {


        String tamAd = "nigar əliyeva";
        int bosluq = tamAd.indexOf(" ");
        System.out.println(bosluq);

        String ad    = tamAd.substring(0, bosluq);
        String soyAd = tamAd.substring(bosluq + 1);
        System.out.println(ad);
        System.out.println(soyAd);

        String adinFormati = ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase();
        System.out.println(adinFormati);
        String soyAdinFormati = soyAd.substring(0, 1).toUpperCase() + soyAd.substring(1).toLowerCase();
        System.out.println(soyAdinFormati);

        String boyukAd = tamAd.toUpperCase();
        System.out.println(boyukAd);



    }
}
