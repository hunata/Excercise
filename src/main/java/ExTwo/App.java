package ExTwo;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
    baiMot();
        baiHai();
        baiBa();
        baiBon();
        baiNam();
        baiSau();
        baiBay();
        baiTam();
        baiChin();
        baiMuoi();
        baiMuoiMot();
    }

    static void baiMot() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên: ");
        int i = sc.nextInt();
        switch (i) {
            case 1:
                System.out.print("Một");
                break;
            case 2:
                System.out.print("Hai");
                break;
            case 3:
                System.out.print("Ba");
                break;
            case 4:
                System.out.print("Bốn");
                break;
            case 5:
                System.out.print("Năm");
                break;
            case 6:
                System.out.print("Sáu");
                break;
            case 7:
                System.out.print("Bảy");
                break;
            case 8:
                System.out.print("Tám");
                break;
            case 9:
                System.out.print("Chín");
                break;
            default:
                System.out.print("Không đọc được số này");
                break;
        }
    }

        static void baiHai(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chữ cái ");
        char c = sc.next().charAt(0);
        if (c >= 'A' && c<='Z'){
            String str = String.valueOf(c);
            System.out.print(str.toLowerCase());
        }
        else if (c >= 'a' && c<='a'){
            String str = String.valueOf(c);
            System.out.print(str.toUpperCase());
        }
        else System.out.print("Chữ không hợp lệ");
    }
    static void baiBa() {
//        Giải phương trình bậc nhất ax + b = 0.
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào a: ");
        int a = sc.nextInt();
        System.out.print("Nhập vào b: ");
        int b = sc.nextInt();
        if (a == 0 && b == 0) {
            System.out.print("Phương trình có vô số nghiệm");
        } else if (a == 0 && b != 0) {
            System.out.print("Phương trình vô nghiệm");
        } else System.out.print("Phương trình có nghiệm là x =" + -b / a);
    }

    static void baiBon() {
//        Giải phương trình bậc nhất ax2 + b + c  = 0.
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào a: ");
        float a = sc.nextFloat();
        System.out.print("Nhập vào b: ");
        float b = sc.nextFloat();
        System.out.print("Nhập vào c: ");
        float c = sc.nextFloat();

        float delta = (b*b) - 4*a*c;
        float deltaSqrt = (float)Math.sqrt(delta);
        if (delta >0){
            System.out.print("Phương trình có nghiệm x1 = " + (-b + deltaSqrt / 2.0F*a) + " ,x2 = " + (-b - deltaSqrt / 2.0F*a));
        }
        else if (delta == 0){
            System.out.print("Phương trình có nghiệm kép x1 = x2 =  " + (-b/(2.0F*a)));
        }
        else System.out.print("Phương trình vô nghiệm");
    }
    static void baiNam() {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[4];
        System.out.println("Nhập vào 4 số : ");
        for (int i = 0; i < 4; i++)
            a[i] = sc.nextInt();
        int min = a[0];
        int max = a[0];
        for (int i = 0; i<4; i++){
            if (a[i] < min){
            min = a[i];
            }
            if (a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Số lớn nhất là: " + max);
        System.out.println("Số nhỏ nhất là: " + min);
    }
    static void baiSau() {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[4];
        System.out.println("Nhập vào 4 số : ");
        for (int i = 0; i < 4; i++)
            a[i] = sc.nextInt();
        int tmp = a[0];
        for (int i = 0; i < 3; i++)
            for (int j = i + 1; j < 4; j++)
                if (a[i] > a[j]) {
                    tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
        for (int i =0; i< a.length; i++)
     System.out.println("Dãy số sắp xếp theo thứ tự tăng dần: " + a[i]);
    }
    static void baiBay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số km : ");
        float f = sc.nextFloat();
        Float a, b, c, d, promote ;
        a = f * 15000F;
        b = 15000F + (f-1)*13500F;
        c = 15000F + 4 * 13500F + (f - 5) * 11000;
        d = 15000F + 4 * 13500F + (f - 5) * 11000;
        promote = d * 0.1F;

        if (f <=1){
            System.out.println("Giá tiền là : " + a);
        }
        else if (f>1 && f <=5){
            System.out.println("Giá tiền là : " + b);
        }
        else if (f>=6 && f <120) {
            System.out.println("Giá tiền là : " + c);
        } else if (f>=120)   {
            System.out.println("Giá tiền là : " + (d-promote));
        }
    }

    static void baiTam() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tháng: ");
        int month = sc.nextInt();
        System.out.println("Nhập vào năm: ");
        int year = sc.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng này có 31 ngày:");break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng này có 31 ngày:");break;
            case 2:
                if ((year % 4 == 0 && year %100 != 0) || (year % 400 == 0)) {
                    System.out.println("Tháng này có 29 ngày:");
                } else System.out.println("Tháng này có 28 ngày:");
            default:
                System.out.println("ko có ngày tháng nay");break;
        }
    }
    static void baiChin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào canh a: ");
        int a = sc.nextInt();
        System.out.println("Nhập vào canh a: ");
        int b = sc.nextInt();
        System.out.println("Nhập vào canh a: ");
        int c = sc.nextInt();
        if(a+b>c || a+c>b || b+c >a) {
            if (a == b && b == c) {
                System.out.println("Đây là tam giác đều");
            } else if (a == b || b == c || a == c) {
                System.out.println("Đây là tam giác cân");
            } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("Đây là tam giác vuông");
            } else System.out.println("Đây là tam giác nhọn");
        }
        else System.out.println("Đây không phải là tam giác");
    }
    static void baiMuoi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào năm: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year %100 != 0) || (year % 400 == 0)){
            System.out.println("Đây là năm nhuận");
        }
        else System.out.println("Đây không phải năm nhuận");
    }
    static void baiMuoiMot() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào ngày: ");
        int day = sc.nextInt();
        System.out.println("Nhập vào tháng: ");
        int month = sc.nextInt();
        System.out.println("Nhập vào năm: ");
        int year = sc.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if ((day > 0 && day < 32) && (year > 0 && year < 3000)) {
                    System.out.println("Ngày " + day + "/" + month + "/" + year + " hợp lệ");
                    preDay(day,month,year);
                    nextDay(day,month,year);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if ((day > 0 && day < 31) && (year > 0 && year < 3000)) {
                    System.out.println("Ngày " + day + "/" + month + "/" + year + " hợp lệ");
                    preDay(day,month,year);
                    nextDay(day,month,year);
                }
                break;
  //              && ((day > 0 && day < 30) && (year > 0 && year < 3000)
            case 2:
                if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && day ==29 ) {
                    System.out.println("Ngày " + day + "/" + month + "/" + year + " hợp lệ");
                    preDay(day,month,year);
                    nextDay(day,month,year);
                } else if (day >0 && day <29){
                System.out.println("Ngày " + day + "/" + month + "/" + year + "hợp lệ");
                preDay(day,month,year);
                nextDay(day,month,year);
                }
                else System.out.println("Ngày " + day + "/" + month + "/" + year + " không hợp lệ");
                break;
            default:
                System.out.println("ko có ngày tháng nay");
                break;
        }
    }
    public static void preDay(int day , int month, int year) {
        if (day == 1) {
            switch (month) {
                case 1:
                    System.out.println("Ngày trước đó là: " + (day + 30) + "/" + (month + 11) + "/" + (year - 1));
                    break;
                case 3:
                    if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && (day > 0 && day < 30)) {
                        System.out.println("Ngày trước đó là: " + (day + 28) + "/" + (month - 1) + "/" + year);
                    } else
                        System.out.println("Ngày trước đó là: " + (day + 27) + "/" + (month - 1) + "/" + year);
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                case 9:
                case 11:
                    System.out.println("Ngày trước đó là: " + (day + 30) + "/" + (month - 1) + "/" + year); break;
                case 5:
                case 7:
                case 10:
                case 12:
                    System.out.println("Ngày trước đó là: " + (day + 29) + "/" + (month - 1) + "/" + year); break;
            }
        }
        if(day !=1){
            System.out.println("Ngày trước đó là: " + (day -1) + "/" + (month) + "/" + year);
        }
    }
    public static void nextDay(int day , int month, int year) {
            switch (month) {
                case 2:
                    if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && (day == 29)) {
                        System.out.println("Ngày sau đó là: " + (day - 28) + "/" + (month + 1) + "/" + year);
                    } else if(day == 28) {
                        System.out.println("Ngày sau đó là: " + (day - 27) + "/" + (month + 1) + "/" + year);
                    } else System.out.println("Ngày sau đó là: " + (day +1) + "/" + (month + 1) + "/" + year);
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 11:
                case 12:
                    if (day ==31) {
                        System.out.println("Ngày sau đó là: " + (day - 30) + "/" + (month + 1) + "/" + year);
                    } else System.out.println("Ngày sau đó là: " + (day + 1) + "/" + month + "/" + year);break;
                case 4:
                case 6:
                case 9:
                case 10:
                    if (day==30) {
                        System.out.println("Ngày trước đó là: " + (day - 29) + "/" + (month + 1) + "/" + year);
                    } else  System.out.println("Ngày trước đó là: " + (day +1) + "/" + (month + 1) + "/" + year);break;
            }
        }
}