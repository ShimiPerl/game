import java.awt.*;

public class Head {
    private int x;
    private int y;
    private  int width;
    private  int height;

    public Head(int x, int y, int width , int height){
        this.x =x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void paint(Graphics graphics){
        graphics.setColor(Color.blue);
        graphics.fillOval(this.x,this.y,this.width,this.height);
    }//paint head

    public void jumpUp(){
        this.y = y -20;
    }//jump up dicrees y

    public void jumpDown() {
        this.y++;
    }//jump down increes y

    public void  down(){
        this.y = y +2;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
