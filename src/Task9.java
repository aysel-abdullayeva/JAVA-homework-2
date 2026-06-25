public class Task9 {
    public static void main(String[] args) {

        String kod = "  abb-2024  ";

        System.out.println(kod.length());                    // ? — gözlənilən: 8  netice: stringin daxilinde 4 elave probel var
        System.out.println(kod.contains("ABB"));              // ? — gözlənilən: true netice: contains case sensitivedir, boyuk ve kiciyi ferqlendirir
        System.out.println(kod.trim().equals("abb-2024"));         // ? — gözlənilən: true netice: == string metodlari ile islemir
        System.out.println(kod.toUpperCase().contains("ABB")); // ? — gözlənilən: true netice: dogrudur


}

}
