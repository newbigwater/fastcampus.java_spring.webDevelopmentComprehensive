public class ArrayTest {
    public static void main(String[] args) {
        // Q. 정수 5개를 저장할 배열을 생성하고 모든 원소에 10 저장 후 출력
        // Q. 배열 길이
        int [] nArr1 = new int[5];
        for(int i = 0; i < 5; i++) {
            nArr1[i] = 10;
        }
        int [] nArr2 = new int[] {10, 10, 10, 10, 10};

        System.out.println("nArr1["+ nArr1.length + "] = "
                + nArr1[0]+ "\t"
                + nArr1[1]+ "\t"
                + nArr1[2]+ "\t"
                + nArr1[3]+ "\t"
                + nArr1[4]+ "\t"
        );
        System.out.println("nArr2["+ nArr2.length + "] = "
                + nArr2[0]+ "\t"
                + nArr2[1]+ "\t"
                + nArr2[2]+ "\t"
                + nArr2[3]+ "\t"
                + nArr2[4]+ "\t"
        );
    }
}
