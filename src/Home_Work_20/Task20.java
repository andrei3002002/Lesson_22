package Home_Work_20;

public class Task20 {

  public static void main(String[] args) {
    Home_Work_20[] circles = new Home_Work_20[10];
    circles[0] = new Home_Work_20(5.0, 1.0, 2.0);
    circles[1] = new Home_Work_20(4.0, 2.0, -3.0);
    circles[2] = new Home_Work_20(7.5, -5.0, 8.0);
    circles[3] = new Home_Work_20(1.5, 5.0, -9.0);
    circles[4] = new Home_Work_20(2.0, 3.5, 5.5);
    circles[5] = new Home_Work_20(9.0, -9.0, 10.0);
    circles[6] = new Home_Work_20(1.0, 10.0, 15.0);
    circles[7] = new Home_Work_20(10.0, 3.0, 9.0);
    circles[8] = new Home_Work_20(6.0, -5.0, -5.0);
    circles[9] = new Home_Work_20(8.0, -8.0, -12.0);


    Home_Work_20 min_radius_circle = get_min_radius_circle(circles);

    System.out.println("Координаты центра круга с минимальным радиусом: (" +
        min_radius_circle.getCenter_x() + ", " + min_radius_circle.getCenter_y() + ")");

  }


  public static Home_Work_20 get_min_radius_circle(Home_Work_20[] circles) {
    if (circles == null || circles.length == 0) {
      return null;
    }
    double min_radius = circles[0].getRadius();
    int minIndex = 0;
    for (int i = 1; i < circles.length; i++) {
      if (circles[i].getRadius() < min_radius){
        min_radius = circles[i].getRadius();
        minIndex =i;
      }

    }
return circles[minIndex];


  }


}
