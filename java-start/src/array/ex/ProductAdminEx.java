package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        int maxProducts = 10;
        Scanner scanner = new Scanner(System.in);
        int productCount = 0;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요:");
            int cmd = scanner.nextInt();
            scanner.nextLine();

            switch (cmd){
                case 1:
                    if(productCount >= maxProducts) {
                        System.out.println("더 이상 상품을 등록할 수 없습니다.");
                        continue;
                    }
                    productCount += 1;
                    System.out.print("상품 이름을 입력하세요:");
                    productNames[productCount - 1] = scanner.nextLine();
                    System.out.print("상품 가격을 입력하세요:");
                    productPrices[productCount - 1] = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 2:
                    for(int i = 0; i < productCount; i++){
                        System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                    }
                    break;
            }
            if (cmd == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
