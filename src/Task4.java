public class Task4 {
    public static void main(String[] args) {
        int a = 15, b = 40;


        System.out.println("a nın dəyəri , a= " + a);
        System.out.println("b nin dəyəri , b= " + b);


        int temp = a;
        a = b;
        b = temp;


        System.out.println("Dəyişən əvəzləndi");
        System.out.println("a nın dəyəri , a= " + a);
        System.out.println("b nin dəyəri , b= " + b);


    }
}
