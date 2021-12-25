import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String chuoi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("chuoi can nhap la :");
        chuoi = scanner.nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(chuoi);
        int soTutrongchuoi = stringTokenizer.countTokens();
        System.out.println("Số từ trong chuỗi : " + chuoi+ " la : " + soTutrongchuoi);
        char c ;
        System.out.println(" ky tu can nhap la :");
        c = scanner.next().charAt(0);
        int count = 0;
        for (int i=0; i < chuoi.length(); i++){
            if (chuoi.charAt(i) == c){
                count++ ;
            }
        }
        System.out.println("so lan xua hien cua " + c+ " la : " + count);

        System.out.println(chuoi.length());
        int doDai = chuoi.length();
        for (int i =0; i < doDai; i++){
            System.out.println("vi tri " + i + " la : " + chuoi.charAt(i));
        }
    }
}
