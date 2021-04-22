import java.util.Arrays;
import java.util.Scanner;

public class Code {

    public static void main(String[] args) {

        while (true) {
            cls();
            System.out.println("알고리즘 문제 선택");
            System.out.println("1. 1~n 연속된 수의 합");
            System.out.println("2. 두 수 입력, n~m 의 합");
            System.out.println("3. 별찍기 ,마름모 출력");
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
        cls();

        System.out.print("숫자1 입력: ");
        int num1 = nextInt();
        System.out.print("숫자2 입력: ");
        int num2 = nextInt();

        int sum = 0;

        if (num1 > num2) { //num2에 큰 수를 할당하기.
            int temp = num2;
            num2 = num1;
            num1 = temp;
        }

        for (int i = num1; i < num2 + 1; i++) {
            sum += i;
        }
        System.out.println("합: " + sum);
    }

    public static void Algo3() {
        //마름모
        cls();

        System.out.print("숫자입력: ");
        int num = nextInt();
        int maxLength = num * 2 - 1;
        int avg = maxLength / 2;

        String[] stars = new String[num];

        Arrays.fill(stars, ""); //배열 요소 초기화

        if (num <= 0 || num == 1) {
            System.out.println("pass");
        } else {
            for (int i = 0; i < stars.length; i++) {
                for (int j = 0; j < maxLength; j++) {
                    if (j == avg || j <= avg + i && j >= avg - i) {
                        stars[i] += "*";
                    } else {
                        stars[i] += " ";
                    }
                }
            }
        }
        //윗부분 출력
//        for (int i = 0; i< stars.length; i++) {
//            System.out.println(stars[i]);
//        }
        for (String star : stars) { //향상된 for 문
            System.out.println(star);
        }
        //아래부분 출력, -2하는 이유는 인덱스는 0부터 시작이고 마지막줄은 출력을 안해도 되기 때문.
        for (int i = stars.length - 2; -1 < i; i--) {
            System.out.println(stars[i]);
        }
    }

    public static void Algo4() {
        // 육망성
        cls();

        System.out.print("숫자입력: ");
        int num = nextInt();
        int side = num * 2 + 1;
        int hLen = side * 3 - 2;
        int vLen = side + num * 2;
        int avg = hLen / 2;

        int[][] array1 = new int[vLen][hLen];

//        for (int i = 0; i < vLen; i++) {
//            System.out.println(Arrays.toString(array1[i])); //요소가 전부 0으로 초기화 되어있다. 왜지
//        }

        //정삼각형 맵핑
        for (int i = 0; i < side + 1; i++) {
            for (int j = 0; j < hLen; j++) {
                if (j == avg || j >= avg - i && j <= avg + i) {
                    array1[i][j] += 1;
                }
            }
        }

        //역삼각형 맵핑
        for (int i = vLen - 1; i >= num; i--) {
            for (int j = 0; j < hLen; j++) {
                if (j == avg || j >= avg - (vLen-1-i) && j <= avg + (vLen-1 -i)) {
                    array1[i][j] += 1;
                }
            }
        }
        cls();
        for (int i = 0; i < vLen; i++) {
            for(int j = 0; j < hLen; j++) {
                if(array1[i][j] > 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }


    }

    public static void Algo5() {
        //오망성

    }

    public static void Algo6() {
        //원
    }

    public static void Algo7() {
        //스도쿠
    }

    public static void Algo8() {
        //문자열 입력받고 반복되지 않은 가장 긴 문자열 찾아 길이와 해당 문자열 출력
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


