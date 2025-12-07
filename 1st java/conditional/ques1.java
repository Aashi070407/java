
import java.util.Scanner;



public class ques1 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("your choice   // Area Of Circle Java Program\r\n" + //
        //                 "// 1Area Of Triangle\r\n" + //
        //                 "// 2Area Of Rectangle Program\r\n" + //
        //                 "// 3Area Of Isosceles Triangle\r\n" + //
        //                 "// 4Area Of Parallelogram\r\n" + //
        //                 "// 5Area Of Rhombus\r\n" + //
        //                 "// 6Area Of Equilateral Triangle\r\n" + //
        //                 "// 7Perimeter Of Circle\r\n" + //
        //                 "// 8Perimeter Of Equilateral Triangle\r\n" + //
        //                 "// 9Perimeter Of Parallelogram\r\n" + //
        //                 "// 10Perimeter Of Rectangle\r\n" + //
        //                 "// 11Perimeter Of Square\r\n" + //
        //                 "// P12erimeter Of Rhombus\r\n" + //
        //                 "// 13Volume Of Cone Java Program\r\n" + //
        //                 "// 14Volume Of Prism\r\n" + //
        //                 "// 15Volume Of Cylinder\r\n" + //
        //                 "// 16Volume Of Sphere\r\n" + //
        //                 "// 17Vo1lume Of Pyramid\r\n" + //
        //                 "// 18Curved Surface Area Of Cylinder\r\n" + //
        //                 "// 19Total Surface Area Of Cube\r\n" );

                Scanner sc = new Scanner(System.in);
        System.out.print("""
your choice   // Area Of Circle Java Program
// 1Area Of Triangle
// 2Area Of Rectangle Program
// 3Area Of Isosceles Triangle
// 4Area Of Parallelogram
// 5Area Of Rhombus
// 6Area Of Equilateral Triangle
// 7Perimeter Of Circle
// 8Perimeter Of Equilateral Triangle
// 9Perimeter Of Parallelogram
// 10Perimeter Of Rectangle
// 11Perimeter Of Square
// P12erimeter Of Rhombus
// 13Volume Of Cone Java Program
// 14Volume Of Prism
// 15Volume Of Cylinder
// 16Volume Of Sphere
// 17Vo1lume Of Pyramid
// 18Curved Surface Area Of Cylinder
// 19Total Surface Area Of Cube
""");
        int choice = sc.nextInt();

//         if (choice == 1) {
//             System.out.print("Enter first number: ");
//             int r = sc.nextInt();
            
//             int areaCircle = (int)(Math.PI * r * r);
//             System.out.println("Area of Circle: " + areaCircle);
//         } else if (choice == 2) {
//             System.out.print("Enter base: ");
//             int b = sc.nextInt();
//             System.out.print("Enter height: ");
//             int h = sc.nextInt();
            
//             int areaTriangle = (b * h) / 2;
//             System.out.println("Area of Triangle: " + areaTriangle);
//         } else if (choice == 3) {
//             System.out.print("Enter length: ");
//             int l = sc.nextInt();
//             System.out.print("Enter width: ");
//             int w = sc.nextInt();
            
//             int areaRectangle = l * w;
//             System.out.println("Area of Rectangle: " + areaRectangle);
//         } else if (choice == 4) {
//             System.out.print("Enter base: ");
//             int base = sc.nextInt();
//             System.out.print("Enter height: ");
//             int height = sc.nextInt();
            
//             int areaIsoscelesTriangle = (base * height) / 2;
//             System.out.println("Area of Isosceles Triangle: " + areaIsoscelesTriangle);
//         } else if (choice == 5) {
//             System.out.print("Enter base: ");
//             int base = sc.nextInt();
//             System.out.print("Enter height: ");
//             int height = sc.nextInt();
            
//             int areaParallelogram = base * height;
//             System.out.println("Area of Parallelogram: " + areaParallelogram);
//         } else if (choice == 6) {
//             System.out.print("Enter diagonal 1: ");
//             int d1 = sc.nextInt();
//             System.out.print("Enter diagonal 2: ");
//             int d2 = sc.nextInt();
            
//             int areaRhombus = (d1 * d2) / 2;
//             System.out.println("Area of Rhombus: " + areaRhombus);
//         } else if (choice == 7) {
//             System.out.print("Enter side: ");
//             int side = sc.nextInt();
            
//             double areaEquilateralTriangle = (Math.sqrt(3) / 4) * side * side;
//             System.out.println("Area of Equilateral Triangle: " + areaEquilateralTriangle);
//         }else if (choice == 8) {
//             System.out.print("Enter radius: ");
//             int radius = sc.nextInt();
            
//             double perimeterCircle = 2 * Math.PI * radius;
//             System.out.println("Perimeter of Circle: " + perimeterCircle);
//         } else if(choice==9){
//             System.out.print("Enter side: ");
//             int side = sc.nextInt();
            
//             int perimeterEquilateralTriangle = 3 * side;
//             System.out.println("Perimeter of Equilateral Triangle: " + perimeterEquilateralTriangle);
//         } else if(choice==10){
//             System.out.print("Enter base: ");
//             int base = sc.nextInt();
//             System.out.print("Enter side length: ");
//             int sideLength = sc.nextInt();
            
//             int perimeterParallelogram = 2 * (base + sideLength);
//             System.out.println("Perimeter of Parallelogram: " + perimeterParallelogram);
//         } else if(choice==11){
//             System.out.print("Enter length: ");
//             int length = sc.nextInt();
//             System.out.print("Enter width: ");
//             int width = sc.nextInt();
            
//             int perimeterRectangle = 2 * (length + width);
//             System.out.println("Perimeter of Rectangle: " + perimeterRectangle);
//         } else if(choice==12){
//             System.out.print("Enter side: ");
//             int side = sc.nextInt();
            
//             int perimeterSquare = 4 * side;
//             System.out.println("Perimeter of Square: " + perimeterSquare);
//         } else if(choice==13){
//             System.out.print("Enter side: ");
//             int side = sc.nextInt();
            
//             int perimeterRhombus = 4 * side;
//             System.out.println("Perimeter of Rhombus: " + perimeterRhombus);
//           } else if (choice == 14) {
//             System.out.print("Enter radius: ");
//             int radius = sc.nextInt();
//             System.out.print("Enter height: ");
//             int height = sc.nextInt();
            
//             double volumeCone = (1.0/3) * Math.PI * radius * radius * height;
//             System.out.println("Volume of Cone: " + volumeCone);
//         } else if (choice == 15) {
//             System.out.print("Enter base area: ");
//             int baseArea = sc.nextInt();
//             System.out.print("Enter height: ");
//             int height = sc.nextInt();
            
//             int volumePrism = baseArea * height;
//             System.out.println("Volume of Prism: " + volumePrism);

//     }else if(choice==16){
//         System.out.print("Enter radius: ");
//         int radius = sc.nextInt();
//         System.out.print("Enter height: ");
//         int height = sc.nextInt();
        
//         double volumeCylinder = Math.PI * radius * radius * height;
//         System.out.println("Volume of Cylinder: " + volumeCylinder);
//     } else if (choice == 17) {
//         System.out.print("Enter radius: ");
//         int radius = sc.nextInt();
        
//         double volumeSphere = (4.0/3) * Math.PI * radius * radius * radius;
//         System.out.println("Volume of Sphere: " + volumeSphere);
//     } else if (choice == 18) {
//         System.out.print("Enter base area: ");
//         int baseArea = sc.nextInt();
//         System.out.print("Enter height: ");
//         int height = sc.nextInt();
        
//         double volumePyramid = (1.0/3) * baseArea * height;
//         System.out.println("Volume of Pyramid: " + volumePyramid);
//  }else if (choice == 19) {
//         System.out.print("Enter radius: ");
//         int radius = sc.nextInt();
//         System.out.print("Enter height: ");
//         int height = sc.nextInt();
        
//         double curvedSurfaceAreaCylinder = 2 * Math.PI * radius * height;
//         System.out.println("Curved Surface Area of Cylinder: " + curvedSurfaceAreaCylinder);
//     } else if (choice == 20) {
//         System.out.print("Enter side: ");
//         int side = sc.nextInt();
        
//         int totalSurfaceAreaCube = 6 * side * side;
//         System.out.println("Total Surface Area of Cube: " + totalSurfaceAreaCube);
//     } else {
//             System.out.println("Invalid choice!");
//         }
//         sc.close();


        switch (choice) {
    case 1 -> {
        System.out.print("Enter first number: ");
        int r = sc.nextInt();
        int areaCircle = (int)(Math.PI * r * r);
        System.out.println("Area of Circle: " + areaCircle);
    }
    case 2 -> {
        System.out.print("Enter base: ");
        int b = sc.nextInt();
        System.out.print("Enter height: ");
        int h = sc.nextInt();
        int areaTriangle = (b * h) / 2;
        System.out.println("Area of Triangle: " + areaTriangle);
    }
    case 3 -> {
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter width: ");
        int w = sc.nextInt();
        int areaRectangle = l * w;
        System.out.println("Area of Rectangle: " + areaRectangle);
    }
    case 4 -> {
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();
        int areaIsoscelesTriangle = (base * height) / 2;
        System.out.println("Area of Isosceles Triangle: " + areaIsoscelesTriangle);
    }
    case 5 -> {
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();
        int areaParallelogram = base * height;
        System.out.println("Area of Parallelogram: " + areaParallelogram);
    }
    case 6 -> {
        System.out.print("Enter diagonal 1: ");
        int d1 = sc.nextInt();
        System.out.print("Enter diagonal 2: ");
        int d2 = sc.nextInt();
        int areaRhombus = (d1 * d2) / 2;
        System.out.println("Area of Rhombus: " + areaRhombus);
    }
    case 7 -> {
        System.out.print("Enter side: ");
        int side = sc.nextInt();
        double areaEquilateralTriangle = (Math.sqrt(3) / 4) * side * side;
        System.out.println("Area of Equilateral Triangle: " + areaEquilateralTriangle);
    }
    case 8 -> {
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        double perimeterCircle = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle: " + perimeterCircle);
    }
    case 9 -> {
        System.out.print("Enter side: ");
        int side = sc.nextInt();
        int perimeterEquilateralTriangle = 3 * side;
        System.out.println("Perimeter of Equilateral Triangle: " + perimeterEquilateralTriangle);
    }
    case 10 -> {
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter side length: ");
        int sideLength = sc.nextInt();
        int perimeterParallelogram = 2 * (base + sideLength);
        System.out.println("Perimeter of Parallelogram: " + perimeterParallelogram);
    }
    case 11 -> {
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter width: ");
        int width = sc.nextInt();
        int perimeterRectangle = 2 * (length + width);
        System.out.println("Perimeter of Rectangle: " + perimeterRectangle);
    }
    case 12 -> {
        System.out.print("Enter side: ");
        int side = sc.nextInt();
        int perimeterSquare = 4 * side;
        System.out.println("Perimeter of Square: " + perimeterSquare);
    }
    case 13 -> {
        System.out.print("Enter side: ");
        int side = sc.nextInt();
        int perimeterRhombus = 4 * side;
        System.out.println("Perimeter of Rhombus: " + perimeterRhombus);
    }
    case 14 -> {
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();
        double volumeCone = (1.0/3) * Math.PI * radius * radius * height;
        System.out.println("Volume of Cone: " + volumeCone);
    }
    case 15 -> {
        System.out.print("Enter base area: ");
        int baseArea = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();
        int volumePrism = baseArea * height;
        System.out.println("Volume of Prism: " + volumePrism);
    }
    case 16 -> {
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();
        double volumeCylinder = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder: " + volumeCylinder);
    }
    case 17 -> {
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        double volumeSphere = (4.0/3) * Math.PI * radius * radius * radius;
        System.out.println("Volume of Sphere: " + volumeSphere);
    }
    case 18 -> {
        System.out.print("Enter base area: ");
        int baseArea = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();
        double volumePyramid = (1.0/3) * baseArea * height;
        System.out.println("Volume of Pyramid: " + volumePyramid);
    }
    case 19 -> {
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();
        double curvedSurfaceAreaCylinder = 2 * Math.PI * radius * height;
        System.out.println("Curved Surface Area of Cylinder: " + curvedSurfaceAreaCylinder);
    }
    case 20 -> {
        System.out.print("Enter side: ");
        int side = sc.nextInt();
        int totalSurfaceAreaCube = 6 * side * side;
        System.out.println("Total Surface Area of Cube: " + totalSurfaceAreaCube);
    }
    default -> System.out.println("Invalid choice!");
}
        sc.close();



//         switch (choice) {
//     case 1: {
//         System.out.print("Enter first number: ");
//         int r = sc.nextInt();
//         int areaCircle = (int)(Math.PI * r * r);
//         System.out.println("Area of Circle: " + areaCircle);
//         break;
//     }
//     case 2: {
//         System.out.print("Enter base: ");
//         int b = sc.nextInt();
//         System.out.print("Enter height: ");
//         int h = sc.nextInt();
//         int areaTriangle = (b * h) / 2;
//         System.out.println("Area of Triangle: " + areaTriangle);
//         break;
//     }
//     case 3: {
//         System.out.print("Enter length: ");
//         int l = sc.nextInt();
//         System.out.print("Enter width: ");
//         int w = sc.nextInt();
//         int areaRectangle = l * w;
//         System.out.println("Area of Rectangle: " + areaRectangle);
//         break;
//     }
//     case 4: {
//         System.out.print("Enter base: ");
//         int base = sc.nextInt();
//         System.out.print("Enter height: ");
//         int height = sc.nextInt();
//         int areaIsoscelesTriangle = (base * height) / 2;
//         System.out.println("Area of Isosceles Triangle: " + areaIsoscelesTriangle);
//         break;
//     }
//     case 5: {
//         System.out.print("Enter base: ");
//         int base = sc.nextInt();
//         System.out.print("Enter height: ");
//         int height = sc.nextInt();
//         int areaParallelogram = base * height;
//         System.out.println("Area of Parallelogram: " + areaParallelogram);
//         break;
//     }
//     case 6: {
//         System.out.print("Enter diagonal 1: ");
//         int d1 = sc.nextInt();
//         System.out.print("Enter diagonal 2: ");
//         int d2 = sc.nextInt();
//         int areaRhombus = (d1 * d2) / 2;
//         System.out.println("Area of Rhombus: " + areaRhombus);
//         break;
//     }
//     case 7: {
//         System.out.print("Enter side: ");
//         int side = sc.nextInt();
//         double areaEquilateralTriangle = (Math.sqrt(3) / 4) * side * side;
//         System.out.println("Area of Equilateral Triangle: " + areaEquilateralTriangle);
//         break;
//     }
//     case 8: {
//         System.out.print("Enter radius: ");
//         int radius = sc.nextInt();
//         double perimeterCircle = 2 * Math.PI * radius;
//         System.out.println("Perimeter of Circle: " + perimeterCircle);
//         break;
//     }
//     case 9: {
//         System.out.print("Enter side: ");
//         int side = sc.nextInt();
//         int perimeterEquilateralTriangle = 3 * side;
//         System.out.println("Perimeter of Equilateral Triangle: " + perimeterEquilateralTriangle);
//         break;
//     }
//     case 10: {
//         System.out.print("Enter base: ");
//         int base = sc.nextInt();
//         System.out.print("Enter side length: ");
//         int sideLength = sc.nextInt();
//         int perimeterParallelogram = 2 * (base + sideLength);
//         System.out.println("Perimeter of Parallelogram: " + perimeterParallelogram);
//         break;
//     }
//     case 11: {
//         System.out.print("Enter length: ");
//         int length = sc.nextInt();
//         System.out.print("Enter width: ");
//         int width = sc.nextInt();
//         int perimeterRectangle = 2 * (length + width);
//         System.out.println("Perimeter of Rectangle: " + perimeterRectangle);
//         break;
//     }
//     case 12: {
//         System.out.print("Enter side: ");
//         int side = sc.nextInt();
//         int perimeterSquare = 4 * side;
//         System.out.println("Perimeter of Square: " + perimeterSquare);
//         break;
//     }
//     case 13: {
//         System.out.print("Enter side: ");
//         int side = sc.nextInt();
//         int perimeterRhombus = 4 * side;
//         System.out.println("Perimeter of Rhombus: " + perimeterRhombus);
//         break;
//     }
//     case 14: {
//         System.out.print("Enter radius: ");
//         int radius = sc.nextInt();
//         System.out.print("Enter height: ");
//         int height = sc.nextInt();
//         double volumeCone = (1.0/3) * Math.PI * radius * radius * height;
//         System.out.println("Volume of Cone: " + volumeCone);
//         break;
//     }
//     case 15: {
//         System.out.print("Enter base area: ");
//         int baseArea = sc.nextInt();
//         System.out.print("Enter height: ");
//         int height = sc.nextInt();
//         int volumePrism = baseArea * height;
//         System.out.println("Volume of Prism: " + volumePrism);
//         break;
//     }
//     case 16: {
//         System.out.print("Enter radius: ");
//         int radius = sc.nextInt();
//         System.out.print("Enter height: ");
//         int height = sc.nextInt();
//         double volumeCylinder = Math.PI * radius * radius * height;
//         System.out.println("Volume of Cylinder: " + volumeCylinder);
//         break;
//     }
//     case 17: {
//         System.out.print("Enter radius: ");
//         int radius = sc.nextInt();
//         double volumeSphere = (4.0/3) * Math.PI * radius * radius * radius;
//         System.out.println("Volume of Sphere: " + volumeSphere);
//         break;
//     }
//     case 18: {
//         System.out.print("Enter base area: ");
//         int baseArea = sc.nextInt();
//         System.out.print("Enter height: ");
//         int height = sc.nextInt();
//         double volumePyramid = (1.0/3) * baseArea * height;
//         System.out.println("Volume of Pyramid: " + volumePyramid);
//         break;
//     }
//     case 19: {
//         System.out.print("Enter radius: ");
//         int radius = sc.nextInt();
//         System.out.print("Enter height: ");
//         int height = sc.nextInt();
//         double curvedSurfaceAreaCylinder = 2 * Math.PI * radius * height;
//         System.out.println("Curved Surface Area of Cylinder: " + curvedSurfaceAreaCylinder);
//         break;
//     }
//     case 20: {
//         System.out.print("Enter side: ");
//         int side = sc.nextInt();
//         int totalSurfaceAreaCube = 6 * side * side;
//         System.out.println("Total Surface Area of Cube: " + totalSurfaceAreaCube);
//         break;
//     }
//     default:
//         System.out.println("Invalid choice!");
// }
//         sc.close();
  }
}