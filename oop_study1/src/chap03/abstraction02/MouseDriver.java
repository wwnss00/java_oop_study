package chap03.abstraction02;

public class MouseDriver {
    public static void main(String[] args) {
        //클래스명.countOfTail
        Mouse.countOfTail = 1;

        Mouse mikey = new Mouse();
        Mouse jerry = new Mouse();
        Mouse mightyMouse = new Mouse();

        //객체명.countOfTail
        System.out.println(mikey.countOfTail);
        System.out.println(jerry.countOfTail);
        System.out.println(mightyMouse.countOfTail);

        //클래스명.cuntOfTail
        System.out.println(Mouse.countOfTail);

    }
}
