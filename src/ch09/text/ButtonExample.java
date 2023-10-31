package ch09.text;

import javax.swing.*; // 스윙 패키지 임포트
import java.awt.*; // AWT 패키지 임포트

public class ButtonExample extends JFrame { // JFrame 클래스를 상속받는 ButtonExample 클래스 정의
    public ButtonExample() { // 생성자 정의
        super("버튼 예제"); // 부모 클래스의 생성자 호출
        setSize(300, 200); // 프레임의 크기 설정
        setDefaultCloseOperation(EXIT_ON_CLOSE); // 프레임을 닫으면 프로그램 종료

        JButton button = new JButton("클릭하세요"); // JButton 객체 생성
        button.addActionListener(e -> { // 버튼에 액션 리스너 추가
            JOptionPane.showMessageDialog(this, "버튼이 클릭되었습니다."); // 다이얼로그 창 띄우기
        });

        add(button); // 프레임에 버튼 추가
        setVisible(true); // 프레임을 화면에 보이게 함
    }

    public static void main(String[] args) { // 메인 메소드 정의
        new ButtonExample(); // ButtonExample 객체 생성
    }
}
