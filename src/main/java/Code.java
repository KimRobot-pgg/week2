import java.util.Scanner;

public class Code {


    public static void main(String[] args) {


        while (true) {
            cls();
            System.out.println("알고리즘 문제 선택");
            System.out.println("1. 1~n 연속된 수의 합");
            System.out.println("2. 두 수 입력, n~m 의 합");
            System.out.println("3. 별찍기 숫자입력,마름모 출력");
            System.out.println("4. 별찍기응용1 육망성");
            System.out.println("5. 별찍기응용2 오망성");
            System.out.println("6. 별찍기응용3 원");
            System.out.println("7. 스도쿠");
            System.out.println("8. 초급알고리즘. 가장 긴 문자열");
            System.out.println("9. exit");
            System.out.print(">숫자 입력: ");
            int num = nextInt();

            switch (num) {
                case 1:
                    Algo1();
                case 2:
                    Algo2();
                case 3:
                    Algo3();
                case 4:
                    Algo4();
                case 5:
                    Algo5();
                case 6:
                    Algo6();
                case 7:
                    Algo7();
                case 8:
                    Algo8();
                case 9:
                    break;
                default:
                    System.out.println("틀린입력");
            }

            if (num == 9) {
                break;
            }
        }

    }


    public static void Algo1() {
        //숫자 하나 입력, 1~n 의 합
        cls();

        System.out.print("숫자 하나 입력:");
        int num = nextInt();
        int sum = 0;

        for (int i = 1; i < num + 1; i++) {
            sum += i;
        }
        System.out.println("합: " + sum);
    }

    public static void Algo2() {
        //두수 입력, n~m 합


    }

    public static void Algo3() {

    }

    public static void Algo4() {

    }

    public static void Algo5() {

    }

    public static void Algo6() {

    }

    public static void Algo7() {

    }

    public static void Algo8() {

    }

    public static void cls() {
        // 콘솔 공백출력
        for (int i = 0; i < 2; i++) {
            System.out.println();
        }
    }
    public static int nextInt() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}


