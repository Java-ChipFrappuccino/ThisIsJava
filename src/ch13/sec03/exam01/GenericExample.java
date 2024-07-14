package ch13.sec03.exam01;

public class GenericExample {
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);
        box1.set(600);
        int ints = box1.get();
        System.out.println(ints);

        Box<String> box2 = boxing("홍길동");
        String strValue = box2.get();
        System.out.println(strValue);
        box2.set("테스트");
        String str = box2.get();
        System.out.println(str);
    }
}
