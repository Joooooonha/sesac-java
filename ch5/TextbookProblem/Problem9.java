import java.util.Arrays;
import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        int [] scores = new int[0]; //쓰기 전에 초기화;; 까먹음
        int totalStudent = 0;


        do {
            System.out.println("-----------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-----------------------------------------------");

            System.out.println("선택> ");
            choice = sc.nextInt();

            if(choice == 1) {
                System.out.println("학생수> ");
                totalStudent = sc.nextInt();
                scores = new int[totalStudent];
            }
            else if(choice == 2) {
                if (totalStudent < 1) {
                    System.out.println("1명 이상 학생 수 입력");
                } else {
                    for (int i = 0; i < totalStudent; i++) {
                        System.out.printf("scores[%d]> ", i);
                        scores[i] = sc.nextInt();
                    }
                }
            }
             else if(choice == 3) {
                if(totalStudent<1)
                    System.out.println("1명 이상 학생 수 입력");
                else{
                    for(int i=0;i<totalStudent;i++){
                        System.out.printf("scores[%d]: %d \n",i,scores[i]);
                    }
                }
            }
             else if(choice == 4) {
                int max = Arrays.stream(scores).max().getAsInt();
                double avg = Arrays.stream(scores).average().getAsDouble();
                System.out.printf("최고 점수: %d\n평균 점수: %.1f\n", max, avg);
            }
        }while (choice != 5);
        System.out.println("프로그램 종료");
    }
}
