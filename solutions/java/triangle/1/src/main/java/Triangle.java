class Triangle {
    double side1, side2, side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        if (!validateTriangle(side1, side2, side3)) {
            throw new TriangleException();
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    boolean validateTriangle(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 &&
               (a + b > c) && (b + c > a) && (c + a > b);
    }

    boolean isEquilateral() {
        return side1 == side2 && side2 == side3;
    }

    boolean isIsosceles() {
        return side1 == side2 || side2 == side3 || side1 == side3;
    }

    boolean isScalene() {
        return side1 != side2 && side2 != side3 && side1 != side3;
    }
}