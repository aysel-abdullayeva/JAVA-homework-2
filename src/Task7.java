public class Task7 {
    public static void main(String[] args) {
        // Aşağıdakı hər cümləni bir boolean dəyişəninə çevirin və çap edin.
        // Dəyişən adını mənalı seçin.

        // "Temperatur 36-dan çox, 37.5-dən azdır" —
        double temp = 36.8;
        boolean temperaturAraligi = temp >= 36 && temp <= 37.5;


        System.out.println("boolean gosterir:" + temperaturAraligi);


        // "Sürət 0-dan çox, 120-dən az VƏ YA yanacaq 0-dan çoxdur" — int surет = 95, yanacaq = 0
        int surет = 95, yanacaq = 0;
        boolean suretVeYanacaq = surет >= 0 && surет <= 120 || yanacaq > 0;

        System.out.println("2ci boolean gosterir: " + suretVeYanacaq);

        // "Hesab aktiv deyil VƏ ya balans mənfidir" —
        boolean aktiv = false;
        double balans = -50.0;
        boolean hesabVeBalans = aktiv = false || balans < 0;

        System.out.println("3cu boolean gosterir: " + hesabVeBalans);


        // "Ad boş deyil (uzunluğu 0-dan çoxdur) VƏ yaş 18-dən böyükdür" —
        String ad = "Anar";
        int yas = 22;

        boolean uygunluq = ad.length()>0 && yas > 18;
        System.out.println("4cu boolean: " + uygunluq);
    }

}
