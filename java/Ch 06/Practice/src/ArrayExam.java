public class ArrayExam {
    // Q. 아래 char[ ] 배열에 APPLE이라는 문자가 저장되어 있다. 대문자로 된 APPLE을 소문자apple로 출력하세요
    public static void main(String[] args) {
        char[] c = {'A', 'P', 'P', 'L', 'E'};

        System.out.println("Before");
        for(int i = 0; i < c.length; i++){
            System.out.println("c = " + c[i]);
        }

        System.out.println("After");
        for(int i = 0; i < c.length; i++){
            c[i] += 32;
        }
        for(int i = 0; i < c.length; i++){
            System.out.println("c = " + c[i]);
        }
    }
}
