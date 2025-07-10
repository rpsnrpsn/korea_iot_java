package org.example;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
        // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP <shortcut actionId="Debug"/>을(를) 눌러 코드 디버그를 시작하세요. 1개의 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 중단점을 설정해 드렸습니다
            // 언제든 <shortcut actionId="ToggleLineBreakpoint"/>을(를) 눌러 중단점을 더 추가할 수 있습니다.
            System.out.println("i = " + i);
        }

        // 1. 상수 선언 방법
        // final 키워드를 사용하여 선언
        // final 데이터타입 변수명 = 데이터값;

        // 2. 상수 명명 규칙
        // : UPPER_SNAKE_CASE 사용
        // : 모든 문자 대문자 + 연결은 _ 언더스코어 사용
        final int RESIDENT_NUMBER = 1234567;
        // RESIDENT_NUMBER = 999999; - 상수는 재할당 불가

        // === 변수(상수)명을 활용한 데이터값 호출 === //
        int numberValue = 10;

        // 변수명 호출 시 변수(공간) 안의 데이터값이 출력
        System.out.println(numberValue);

    }
}