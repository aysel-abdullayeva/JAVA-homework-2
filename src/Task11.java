public class Task11 {
    public static void main(String[] args) {
        //İstifadəçi parolu:
        String parol = "Abb@2024";

        //Bu parol üçün aşağıdakı yoxlamaları ayrı boolean dəyişənlərə yazıb çap edin:


        //Uzunluğu 8-dən çoxdur? (uzunUygun)

        boolean uzunUygun =parol.length()>8;
        System.out.println("Uzunluq ; " + uzunUygun);

        //"@" simvolu var mı? (xarakterVar)
        boolean contain = parol.contains("@");
        System.out.println(contain);
        //Böyük hərfə çevirdikdə "ABB" ilə başlayırmı? (abbIleBaslayir)

        boolean abbIleBaslayir = parol.toUpperCase().startsWith("ABB");
        System.out.println(abbIleBaslayir);

        //Rəqəm var mı — "2024" hissəsi mövcuddur? (reqemVar)


        boolean reqemVar = parol.contains("2024");
        System.out.println(abbIleBaslayir);


        //Parol güclüdür mi? (yuxarıdakı 4 şərt hamısı true) (gucluParol);

        boolean gucluParol = uzunUygun && contain && abbIleBaslayir && reqemVar;
        System.out.println(gucluParol);

}

}
