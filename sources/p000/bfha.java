package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: bfha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfha implements SensorEventListener {

    /* renamed from: a */
    public boolean f113857a = false;

    /* renamed from: b */
    final /* synthetic */ bfhb f113858b;

    /* renamed from: c */
    private int f113859c = 0;

    /* renamed from: d */
    private int f113860d = 0;

    /* renamed from: e */
    private double f113861e = 0.0d;

    public bfha(bfhb bfhb) {
        this.f113858b = bfhb;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        long a = this.f113858b.f113864c.mo62774a();
        int i = this.f113859c;
        if (i < 10) {
            this.f113859c = i + 1;
        } else if (this.f113860d < 30) {
            long j = sensorEvent.timestamp;
            double d = this.f113861e;
            double d2 = (double) (j - a);
            Double.isNaN(d2);
            this.f113861e = d + (d2 / 30.0d);
            int i2 = this.f113860d + 1;
            this.f113860d = i2;
            if (i2 == 30) {
                synchronized (this.f113858b.f113865d) {
                    if (!this.f113857a) {
                        this.f113858b.mo61685a(true, (long) this.f113861e);
                        long j2 = this.f113858b.f113869h;
                        StringBuilder sb = new StringBuilder(72);
                        sb.append("Calibration done. mSensorTimeElapsedTimeOffsetNanos=");
                        sb.append(j2);
                        sb.toString();
                    }
                }
            }
        }
    }
}
