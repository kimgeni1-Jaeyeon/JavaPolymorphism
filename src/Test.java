// Shape 추상 클래스
abstract class Shape {
    // 추상 메서드: 각 도형에서 면적을 계산할 수 있도록 정의
    abstract double calculateArea();

    // toString 메서드 재정의: "도형이 뭔지 몰라요" 반환
    @Override
    public String toString() {
        return "도형이 뭔지 몰라요";
    }
}

// Rectangle 클래스 (Shape 상속)
class Rectangle extends Shape {
    private double width;  // 너비
    private double height; // 높이

    // 생성자
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 면적 계산
    @Override
    double calculateArea() {
        return width * height;
    }

    // toString 메서드 재정의
    @Override
    public String toString() {
        return "Rectangle: 면적 = " + calculateArea();
    }
}

class Circle extends Shape {
    private double radius;  // 너비


    // 생성자
    public Circle(double radius) {
        this.radius = radius;
    }

    // 면적 계산
    @Override
    double calculateArea() {
        return 3.14*radius*radius;
    }

    // toString 메서드 재정의
    @Override
    public String toString() {
        return "Circle: 면적 = " + calculateArea();
    }
}

// Triangle 클래스 (Shape 상속)
class Triangle extends Shape {
    private double base;   // 밑변
    private double height; // 높이

    // 생성자
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // 면적 계산
    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

    // toString 메서드 재정의
    @Override
    public String toString() {
        return "Triangle: 면적 = " + calculateArea();
    }
}

// Test 클래스
public class Test {
    // printArea 메서드: Shape 타입의 객체를 받아 toString 호출
    public static void printArea(Shape s) {
        System.out.println(s);//toString 자동호출
        //다형성 예시
    }

    // main 메서드
    public static void main(String[] args) {
        // Shape 배열 생성 (크기 3)
        Shape[] shapes = new Shape[3];

        // 배열에 도형 객체 추가
        shapes[0] = new Rectangle(1, 2); // 첫 번째는 사각형(너비 1, 높이 2)
        shapes[1] = new Triangle(2, 3);  // 두 번째는 삼각형(밑변 2, 높이 3)
        shapes[2] = new Circle(3); // 세 번째는 사각형(너비 3, 높이 4)

        // for-each 구문을 사용하여 배열의 각 도형에 대해 printArea 호출
        for (Shape shape : shapes) {
            printArea(shape);  // 내부적으로 toString()이 호출됨
        }
    }
}
