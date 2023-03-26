package space;

public class PID {
    //מבנה קוד בקרה לPID
    private final double p0;
    private final double i0;
    private final double d0;
    private double integral;
    private double last_error;

    public PID(double p, double i, double d) {
        this.p0 = p;
        this.i0 = i;
        this.d0 = d;
        this.last_error = 0;
        this.integral = 0;
    }

    public double update(double error, double dt) {
        integral += error * dt;
        double I = integral;

        double D = (error - last_error) / dt;

        last_error = error;

        return error * p0 + I * i0 + D * d0;
    }
}