package ch13.sec01;

public class GenericExample {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.content = "안녕하세요?";
        String str = box.content;
        System.out.println(str);

        Box<Integer> box1 = new Box<>();
        box1.content = 100;
        int int1 = box1.content;
        System.out.println(int1);
    }
}
