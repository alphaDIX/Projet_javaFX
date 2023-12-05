public class Camera {
    protected int X;
    protected int Y;

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public Camera(int x,int y) {
        X = x;
        Y = y;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "X=" + X +
                ", Y=" + Y +
                '}';
    }

    public void update(long time) {
    }
}
