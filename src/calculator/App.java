package calculator;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> resultBox = new ArrayList<Double>();
        Calculator calculator = new Calculator();
        DecimalFormat df = new DecimalFormat("#.##");


        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            Double a = scanner.nextDouble();
            scanner.nextLine();


            System.out.print("두 번째 숫자를 입력하세요: ");
            Double b = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("사칙연산 기호를 입력하세요: ");

            char operation = scanner.next().charAt(0);
            scanner.nextLine();

            System.out.println("결과 = " + df.format(calculator.calculator(operation,a,b)));

            System.out.println("더 계산하시겠습니까?  (exit입력 시 종료), 마지막 기록 삭제시 delete을 입력, 전체 조회시 check를 입력");
            String nextAction = scanner.nextLine();

            if (nextAction.equals("exit")){
                break;
            } else if (nextAction.equals("delete")){
                  calculator.delete();
                System.out.println("최근 결과가 삭제되었습니다.");
            } else if (nextAction.equals("check")){
                calculator.check();
            }
        }
        }


}
