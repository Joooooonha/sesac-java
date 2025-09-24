public class Problem4 {
    /**
     * 강제 타입 변환 (캐스팅)
     *
     * 다음 값들을 강제 타입 변환하여 출력하는 프로그램을 작성하세요.
     *
     * double 값 3.14를 int로 변환
     * int 값 300을 byte로 변환
     * char 값 'A'를 int로 변환
     * int 값 65를 char로 변환
     * 값 손실이나 변화가 있는지 확인하고 설명하세요.
     *
     * 예상 출력:
     *
     * 3.14 → 3 (소수점 손실)
     * 300 → 44 (오버플로우 발생)
     * 'A' → 65 (ASCII 코드)
     * 65 → 'A' (ASCII 문자)
     */
    public static void main(String[] args) {
        int i = (int) 3.14;
        byte b = (byte) 300;
        int i2 = (int) 'A';
        char c = (char) 65;

        System.out.println("i = " + i);
        System.out.println("b = " + b);
        System.out.println("i2 = " + i2);
        System.out.println("c = " + c);
    }
}
