public class Task13 {
    public static void main(String[] args) {

        String metn = " Java proqramlaşdırma dili çox güclüdür! ";

        int evvel = metn.length();
        int sonra = metn.trim().length();
        System.out.println(evvel);
        System.out.println(sonra);


        boolean javaVar      = metn.contains("Java"); // var
        boolean javaBoyukVar = metn.contains("JAVA");  //yoxdur
        System.out.println(javaVar);
        System.out.println(javaBoyukVar);

        String evezlenme = metn.replace("proqramlaşdırma", "programming");
        System.out.println(evezlenme);

        String ilk4 = metn.trim().substring(0, 4);
        System.out.println(ilk4);

        boolean nidaVar = metn.contains("!");
        System.out.println(nidaVar);

        String metnKicikle = metn.trim().toLowerCase();
        System.out.println(metnKicikle);

    }

}
