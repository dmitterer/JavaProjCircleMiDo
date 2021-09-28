/**
 * @Author(s): Dominik Mitterer
 * @Title: Circles
 * @Date of creation: 2021-04-21
 * @Date of completion: 2021-04-21
 * @Description: This program outputs the coordinates of two different circles. This Class is here for the circles.
 */
public class Circles {

    private Coordinates middle;
    private int radius;

    public Circles(int radius){
        middle  = new Coordinates();
        this.radius = radius;
    }

    public void setPosition (Coordinates middle){
        this.middle = middle;
    }

    @Override
    public String toString() {
        return "Circle " +
                "" + middle +
                ", radius=" + radius +
                '}';
    }

}
