public class MemberTest {
    public static void main(String[] args) {
        Member m = new Member();
        m.name = "홍길동";
        m.age = 30;
        m.phonNumber = "010-1111-1111";
        m.emailAddress = "fc@naver.com";
        m.address = "서울";
        m.weight = 57.6f;

        System.out.println(m);
    }
}
