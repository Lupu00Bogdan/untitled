import java.util.Scanner;

public class Shape3D {
    abstract class Shape {
        final float PI = 3.14f;
        Scanner s = new Scanner(System.in);

        abstract void area();

        abstract void volume();
    }

    class Cylinder extends Shape {
        float a, r, h, v;

        void accept() {
            System.out.println("Enter the radius and Height ");
            r = s.nextFloat();
            h = s.nextFloat();
        }

        void area() {
            a = (2 * PI * r * h) + (2 * PI * r * r);
            System.out.println("Area of Cylinder is :" + a);
        }

        void volume() {
            v = PI * r * r * h;
            System.out.println("Volume of Cylinder is :" + v);
        }
    }

    class Cone extends Shape {
        float a, r, h, v;

        void accept() {
            System.out.println("Enter the radius and Height ");
            r = s.nextFloat();
            h = s.nextFloat();
        }

        void area() {
            a = PI * r * (r + (float) Math.sqrt(h * h + r * r));
            System.out.println("Area of Cone is :" + a);
        }

        void volume() {
            v = PI * r * r * (h / 3);
            System.out.println("Volume of Cone is :" + v);
        }
    }
}


