package secondCalculator;

import calculator.Calculator;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        Calculator2 calculator2 = new Calculator2();

        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            Double a = scanner.nextDouble();
            scanner.nextLine();


            System.out.print("두 번째 숫자를 입력하세요: ");
            Double b = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("사칙연산 기호를 입력하세요: ");

            String input = scanner.nextLine().trim();

            OperatorType operatorType = OperatorType.fromSymbol(input);

            System.out.println("결과 = " + arithmeticCalculator.calculate(a,b,operatorType));

            System.out.println("더 계산하시겠습니까?  (exit입력 시 종료), 마지막 기록 삭제시 delete을 입력, 전체 조회시 check를 입력, 입력한 값보다 큰 결과값을 출력하려면 big을 입력");
            String nextAction = scanner.nextLine();

            if (nextAction.equals("exit")){
                break;
            } else if (nextAction.equals("delete")){
                  calculator2.delete();
                System.out.println("최근 결과가 삭제되었습니다.");
            } else if (nextAction.equals("check")){
                calculator2.check();
            } else if (nextAction.equals("big")){
                System.out.println("비교할 숫자를 입력하세요");
                Double matchNum = scanner.nextDouble();
                scanner.nextLine();
                calculator2.big(matchNum);
            }
        }
        }

}
