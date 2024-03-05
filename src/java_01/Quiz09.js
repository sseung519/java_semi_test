/*
【문항9】 아래의 주어진 두 개의 값을 매개변수로 입력받아 더한 값을 리턴(return)하는 자바스크립트 함수(function)와 뺀 값을
 리턴(return)하는 함수(function) 두 개를 각각 작성하세요. (10점)
 var num1 = 5;
 var num2 = 1;
 */
var num1 = 5;
var num2 = 1;
let result;
function sum(a, b){
    result = num1+num2;
    return result;
}
function sub(a, b){
    result = num1-num2;
    return result;
}

sum();
sub();

