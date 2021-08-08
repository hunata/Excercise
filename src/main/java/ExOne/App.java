package ExOne;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
    baibon();
    bainam();
    baisau();
    baibay();
    baitam();
    baichin();
    baimuoi();

    }
    static void baibon(){
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào năm sinh: ");
        i = sc.nextInt();
        int s = 2021-i;
        System.out.println(" Số tuổi của bạn là: " + s );
    }
    static void bainam(){
        int i; int j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số a: ");
        i = sc.nextInt();
        System.out.print("Nhập vào số b: ");
        j = sc.nextInt();
        int tong = i+j;
        int hieu = i-j;
        int tich = i*j;
        int thuong = i/j;
        System.out.println(" Tổng Số a và b là: " + tong );
        System.out.println(" Tổng Số a và b là: " + hieu );
        System.out.println(" Tổng Số a và b là: " + tich);
        System.out.println(" Tổng Số a và b là: " + thuong );
    }
    static void baisau(){
        String s;int i; int j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tên sản phẩm: ");
        s = sc.nextLine();
        System.out.print("Nhập vào số lượng: ");
        i = sc.nextInt();
        System.out.print("Nhập vào đơn giá: ");
        j = sc.nextInt();
        int tongTien = i*j;
        double vat = tongTien*0.1;
        System.out.println(" Tổng tiền là: " + tongTien );
        System.out.println(" Thuế là: " + vat );
    }
    static void baibay(){
        int t;int ht; int l; int hl; int h; int hh;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào điểm môn toán: ");
        t = sc.nextInt();
        System.out.print("Nhập vào hệ số môn toán: ");
        ht = sc.nextInt();
        System.out.print("Nhập vào điểm môn lý: ");
        l = sc.nextInt();
        System.out.print("Nhập vào hệ số môn lý: ");
        hl = sc.nextInt();
        System.out.print("Nhập vào điểm môn hóa: ");
        h = sc.nextInt();
        System.out.print("Nhập vào hệ số môn hóa: ");
        hh = sc.nextInt();
        int trungbinh = ((t*ht) + (l*hl) + (h*hh))/(ht+hl+hh);
        System.out.println(" Trung bình điểm là: " + trungbinh );
    }
    static void baitam() {
        double i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào bán kính hình tròn: ");
        i = sc.nextFloat();
        double s = (i * i) * Math.PI;
        double d = (i * 2) * Math.PI;
        System.out.println(" Diện tích hình tròn: " + s);
        System.out.println(" Chu vi hình tròn: " + d);
    }
        static void baichin() {
           int i; int sum=0; int bsx;
           Scanner sc = new Scanner(System.in);
           System.out.print("Nhập vào biển số xe: ");
           i = sc.nextInt();
           while (i>0) {
               sum += i%10;
               i /=10;
            }
            bsx = sum%10;
            System.out.print("Nút của biển số xe là: " + bsx);

        }
        static void baimuoi() {
            int i;
            int j;
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập vào số a: ");
            i = sc.nextInt();
            System.out.print("Nhập vào số b: ");
            j = sc.nextInt();
            if (i < j) {
                System.out.println(" Số Min là : " + i);
                System.out.println(" Số Min là : " + j);
            } else {
                if (i > j) {
                    System.out.println(" Số Min là : " + j);
                    System.out.println(" Số Min là : " + i);
                }
                else {
                    System.out.println("hai số bằng nhau");
                }
            }
        }
}
