package java_02;

public class Quiz01_02 {
    /*
    【문항1】 아래에 정의된 Student클래스에 다음과 같이 정의된 두 개의 메서드 getTotal()과 getAverage() 코드를 작성하세요.(10점)
     */
    String name = "김철수"; //학생 이름
    int ban = 1; //반
    int no = 10; //번호
    int kor = 90; //국어점수
    int eng = 70; //영어점수
    int math = 85; //수학점수
    int[] subArr = {kor, eng, math};
    public int getTotal(){
        int sum = 0;
        for (int i = 0; i < subArr.length; i++) {
            sum+= subArr[i];
        }
        return sum;
    }

    public double getAverage(){
        double average = (double)getTotal()/subArr.length;
        return average;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
