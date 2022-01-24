package bai2;

import java.util.Scanner;

public class TienDien {
    private static Scanner scanner = new Scanner(System.in);

    public static void tinhTienDien(){
        float kWh;
        do{
            System.out.println("Nhập vào số KWh điện đã sử dụng: ");
            kWh = scanner.nextFloat();
            if (kWh < 0) {
                System.out.println("Số kWh bạn vừa nhập không hợp lệ");
            }
        }while (kWh < 0);

        float tien = 0;
        if(kWh >= 0 && kWh < 25){
            tien = kWh * 1000;
        }else if (kWh >= 25 && kWh < 75){
            tien = kWh * 1250;
        }else if (kWh >= 75 && kWh < 150){
            tien = kWh * 1800;
        }else {
            tien = kWh * 2500;
        }

        System.out.println("Số tiền điện bạn phải đóng trong tháng này là: " + tien + " VND");
    }
}
