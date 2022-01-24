package news;

import news.impl.News;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewsUtil {

    Scanner scanner = new Scanner(System.in);
    private final List<News> newsList = new ArrayList<>();
    public void menu(){
        int select;
        do{
            System.out.println("==============MENU==============");
            System.out.println("1. Insert news");
            System.out.println("2. Views list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            System.out.println("________________________________");
            System.out.println("Mời chọn : ");
            select = Integer.parseInt(scanner.nextLine());

            switch (select){
                case 1:
                    News news1 = new News();
                    System.out.println("Nhập vào tiêu đề(title): ");
                    news1.setTitle(scanner.nextLine());
                    System.out.println("Nhập vào ngày xuất bản(publish date): ");
                    news1.setPublishDate(scanner.nextLine());
                    System.out.println("Nhập vào tên tác giả(author): ");
                    news1.setAuthor(scanner.nextLine());
                    System.out.println("Nhập vào nội dung(content): ");
                    news1.setContent(scanner.nextLine());
                    System.out.println("Nhập vào 3 lần đánh giá: ");
                    int[] rateList = new int[3];
                    for (int i = 0; i < 3; i++){
                        rateList[i] = Integer.parseInt(scanner.nextLine());
                    }
                    news1.setRateList(rateList);
                    newsList.add(news1);
                    break;
                case 2:
                    newsList.forEach(News::display);
                    break;
                case 3:
                    newsList.forEach(news -> {
                        news.calculate();
                        news.display();
                    });
                    break;
                case 4:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình");
                    break;
            }
        }while (select != 4);
    }
}
