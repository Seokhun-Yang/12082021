public class Array {
    public static void main(String[] args) {
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
        weeks[0] = "월";
        weeks[1] = "화";
        weeks[2] = "수";
        weeks[3] = "목";
        weeks[4] = "금";
        weeks[5] = "토";
        weeks[6] = "일";

        System.out.println(weeks[3]); // 네번째 항목인 목 출력

        for (int i = 0; i < weeks.length; i++){
            System.out.println(weeks[i]); // 월~일 까지 모두 출력
        }
    }

}

