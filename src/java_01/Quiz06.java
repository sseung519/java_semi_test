package java_01;

public class Quiz06 {
    public static void main(String[] args) {
        /*
        【문항6】 아래 주어진 배열의 총합과 평균(소수점 자리 출력)을 출력하는 코드를 작성하세요. (10점)
        int[] scores = {83, 90, 87};
         */
        int sum = 0;
        int[] scores = {83, 90, 87};
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총합: " + sum + " 평균: " + (double)sum/scores.length);
    }
}
