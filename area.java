
class Area {

    int area(int side) {
        return side * side;
    }

    int area(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        Area obj = new Area();

        System.out.println("Area of square: " + obj.area(4));
        System.out.println("Area of rectangle: " + obj.area(3, 4));
    }
}
