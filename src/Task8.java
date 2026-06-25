public class Task8 { public static void main(String[] args) {
    int yas = 25;
    double gelir = 1200.0;
    boolean tarix = true;

// Kredit şərti: yaş 21-65, gəlir 800-dən çox, tarix true olmalı

    boolean yasUygun  = yas >= 21 && yas <=65;   // ① nəticə: false — düzdürmü? sehvdir, bundan elave 21 ve 65 yas sertlere daxil olmalidir
    boolean gelirUygun = gelir > 800;              // ② nəticə: true  — düzdürmü? duzdur
    boolean uygun      = yasUygun && gelirUygun && tarix; // ③ burada ve ya yerine ve olmalidir

    System.out.println("Yaş uyğun:   " + yasUygun);
    System.out.println("Gəlir uyğun: " + gelirUygun);
    System.out.println("Kredit:      " + uygun);


}
}
