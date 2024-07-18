import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap diem Toan : ");
//        double point = Double.parseDouble(sc.nextLine());
//        System.out.println("nhap diem Ly : ");
//        double point2 = Double.parseDouble(sc.nextLine());
//        System.out.println("nhap diem Hoa : ");
//        double point3 = Double.parseDouble(sc.nextLine());
//        System.out.println("nhap diem Van : ");
//        double point5 = Double.parseDouble(sc.nextLine());
//        System.out.println("nhap diem Tieng Anh : ");
//        double point4 = Double.parseDouble(sc.nextLine());
//        double a = (point + point2 + point3 + point4 + point5)/5;
//        if (a<5){
//            System.out.println("diem trung binh cua hoc sinh la : " + a);
//            System.out.println("hs yeu");
//        } else if (a<6.5) {
//            System.out.println("diem trung binh cua hoc sinh la : " + a);
//            System.out.println("hs tb");
//        }else if (a<8) {
//            System.out.println("diem trung binh cua hoc sinh la : " + a);
//            System.out.println("hs kha");
//        }else if (a<9) {
//            System.out.println("diem trung binh cua hoc sinh la : " + a);
//            System.out.println("hs gioi");
//        }else {
//            System.out.println("diem trung binh cua hoc sinh la : " + a);
//            System.out.println("hs xuat sac");
//        }
        ///////////////////////////////
//        System.out.println("1. kiem tra tinh chan le cua 1 so");
//        System.out.println("2. kiem tra so nguyen to");
//        System.out.println("3. kiem tra 1 so co chia het cho 3 hay khong");
//        System.out.println("4. thoat");
//        int choice = sc.nextInt();
//        while (true) {
//            switch (choice) {
//                case 1:
//                    System.out.println("nhap vao 1 so ngau nhien");
//                    int number = sc.nextInt();
//                    if (number % 2 == 0) {
//                        System.out.println(number + "la so chan");
//                    } else {
//                        System.out.println(number + "khong phai la so chan");
//                    }
//                    break;
//                case 2:
//                    System.out.println("nhap vao 1 so ngau nhien");
//                    int number2 = sc.nextInt();
//                    if (number2 == 1) {
//                        System.out.println(number2 + "la so nguyen to");
//                    }
//                    break;
//                case 3:
//                    System.out.println("kiem tra 1 so co chia het cho 3 hay khong");
//                    break;
//
//                default:
//                    System.out.println("chon lai");
//            }
//            if (choice == 4) {
//                break;
//            }
//        }
        while (true) {
        System.out.println("----------Main---------");
        System.out.println("1. hien thi");
        System.out.println("2. them moi");
        System.out.println("3. xoa");
        System.out.println("4. sua");
        System.out.println("5. thoat");
        //
        int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    NumberManager.printArray();
                    break;
                case 2:
                    int random = new Random().nextInt();
                    NumberManager.addNumber(random);
                    break;
                case 3:
                    System.out.println("nhap index can xoa");
                    int index = sc.nextInt();
                    NumberManager.removeIndex(index);
                    break;
                case 4:
                    System.out.println("nhap index can sua");
                    int index2 = sc.nextInt();
                    System.out.println("nhap so");
                    int number = sc.nextInt();
                    NumberManager.updateArray(index2,number);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("chon lai");
            }
        }

    }
}
