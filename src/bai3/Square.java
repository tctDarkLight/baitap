package bai3;

import java.util.Scanner;

public class Square {

    private static Scanner scanner = new Scanner(System.in);

    private float side;

    private float getSide() {
        return side;
    }

    private void setSide(float side) {
        this.side = side;
    }

    public void input() {
        do {
            System.out.println("Nhập vào độ dài cạnh hình vuông: ");
            side = scanner.nextFloat();
            if (side <= 0) {
                System.out.println("Độ dài cạnh vừa nhập không hợp lệ!");
            }
        } while (side <= 0);
    }

    public void showSide(){
        System.out.println("Độ dài cạnh của hình vuông là: " + side);
    }

    public void perimeter(){
        System.out.println("Chu vi hinh vuông là: " + side * 4);
    }

    public void acreage(){
        System.out.println("Diện tích hình vuông là: " + side * side);
    }

    public void info() {
        System.out.println("--------------------");
        System.out.println("Thông tin của hình vuông: ");
        this.showSide();
        this.perimeter();
        this.acreage();
    }
}
