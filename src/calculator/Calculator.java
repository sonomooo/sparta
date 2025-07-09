package calculator;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Calculator {
    DecimalFormat df = new DecimalFormat();
    ArrayList<Double> resultBox = new ArrayList<Double>();

    public ArrayList<Double> getResultBox() {
        return resultBox;
    }

    public void setResultBox(ArrayList<Double> resultBox) {
        this.resultBox = resultBox;
    }

    public Double calculator(char operation,
                             Double a, Double b) {

        double result = (double) 0;

        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("0으로는 나눌 수 없습니다.");
                } else {
                    result = (double) a / b;
                }
                break;
            default:
                System.out.println("지원하지 않는 기호입니다.");
        }

        //박스에서 받을 때 문제가 생긴다! 넘어가는 값은 정상적으로 포맷팅됨
        resultBox.add(result);

        return result;
    }

    public void delete(){
        if (!resultBox.isEmpty()){
            resultBox.removeFirst();
        } else{
            System.out.println("삭제할 결과가 없습니다.");
        }
    }

    public void check(){
        for (Double box : resultBox) {
            System.out.println(df.format(box));
        }
    }
}
