public class Problem2 {
    /**
     * 기본 타입의 크기와 범위
     *
     * 각 기본 타입의 크기(바이트)와 범위를 출력하는 프로그램을 작성하세요.
     *
     * byte, short, int, long
     * float, double
     * char, boolean
     * 예상 출력:
     *
     * byte: 1바이트, 범위: -128 ~ 127
     * short: 2바이트, 범위: -32768 ~ 32767
     * int: 4바이트, 범위: -2147483648 ~ 2147483647
     * ...
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("byte: " + Byte.BYTES + "바이트, 범위: " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.BYTES + "바이트, 범위: " + Short.MIN_VALUE + " ~ " + Short.MIN_VALUE);
        System.out.println("int: "+ Integer.BYTES+"바이트, 범위: " + Integer.MIN_VALUE + " ~ " + Integer.MIN_VALUE);
        System.out.println("int: "+ Long.BYTES+"바이트, 범위: " + Long.MIN_VALUE + " ~ " + Long.MIN_VALUE);
        System.out.println("float: "+ Float.BYTES+"바이트, 범위: " + Float.MIN_VALUE + " ~ " + Float.MIN_VALUE);
        System.out.println("double: "+ Double.BYTES+"바이트, 범위: " + Double.MIN_VALUE + " ~ " + Double.MIN_VALUE);
        System.out.println("int: "+ Character.BYTES+"바이트, 범위: " + Character.MIN_VALUE + " ~ " + Character.MIN_VALUE);
        System.out.println("boolean: 1바이트, 범위: -128 ~ 127");
    }
}
