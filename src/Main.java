public class Main {
    public static void main(String[] args) {
        String str1 = "IDKHM1603633111<<<<<<<<<<<<<<<";
        String str2 = "9501016M2406215KHM<<<<<<<<<<<6";
        String str3 = "MEN<<CHENDA<<<<<<<<<<<<<<<<<<<";

        System.out.println(str1.substring(5, 15));
        System.out.println(str2.substring(2, 4) + "/" + str2.substring(4, 6) + "/19" + str2.substring(0, 2));
        System.out.println(str2.substring(7, 8));
        System.out.println(str3.substring(0, 3));
        System.out.println(str3.substring(5, 11));
        System.out.println(str2.substring(12, 14) + "/" + str2.substring(10, 12) + "/20" + str2.substring(8, 10));
    }
}