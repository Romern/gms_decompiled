package p000;

import android.hardware.SensorEvent;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: bfhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfhc extends bfdl {

    /* renamed from: d */
    private final bfgy f113872d;

    /* renamed from: e */
    private long f113873e = 0;

    /* renamed from: f */
    private final long[] f113874f = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: g */
    private final double[] f113875g = new double[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: h */
    private final double[] f113876h = new double[3];

    /* renamed from: i */
    private int f113877i = 0;

    public bfhc(bfgs bfgs, bfev bfev, bfgy bfgy) {
        super(bfgs, bfev);
        this.f113872d = bfgy;
    }

    /* renamed from: a */
    public final void mo61464a() {
    }

    /* renamed from: b */
    public final void mo61466b() {
    }

    /* renamed from: a */
    public final void mo61465a(bfgt bfgt, long j, SensorEvent sensorEvent) {
        double d;
        int i;
        long j2 = j;
        SensorEvent sensorEvent2 = sensorEvent;
        if (sensorEvent2 != null && sensorEvent2.sensor.getType() == 1) {
            double d2 = 0.0d;
            double d3 = 0.0d;
            for (int i2 = 0; i2 < 3; i2++) {
                double[] dArr = this.f113876h;
                double d4 = (double) sensorEvent2.values[i2];
                Double.isNaN(d4);
                dArr[i2] = (dArr[i2] * 0.9d) + (d4 * 0.09999999999999998d);
                double d5 = (double) sensorEvent2.values[i2];
                double d6 = this.f113876h[i2];
                Double.isNaN(d5);
                double d7 = d5 - d6;
                d3 += d7 * d7;
            }
            double sqrt = Math.sqrt(d3);
            long[] jArr = this.f113874f;
            int i3 = this.f113877i;
            jArr[i3] = j2;
            double[] dArr2 = this.f113875g;
            int i4 = i3 + 1;
            this.f113877i = i4;
            dArr2[i3] = sqrt;
            if (i4 >= 256 || (i4 != 0 && j2 - jArr[0] > 300)) {
                if (i4 != 0) {
                    double d8 = 0.0d;
                    int i5 = 0;
                    while (true) {
                        i = this.f113877i;
                        if (i5 >= i) {
                            break;
                        }
                        double d9 = this.f113875g[i5];
                        d8 += d9;
                        d2 += d9 * d9;
                        i5++;
                    }
                    double d10 = (double) i;
                    Double.isNaN(d10);
                    Double.isNaN(d10);
                    d = (d2 - (d8 * (d8 / d10))) / d10;
                } else {
                    d = Double.NaN;
                }
                if (d > 0.05d) {
                    this.f113873e = j2;
                }
                long j3 = this.f113873e;
                if (j3 != 0 && j2 - j3 > this.f113872d.f113855e) {
                    this.f113491c.postAtFrontOfQueue(this.f113489a);
                }
                this.f113877i = 0;
            }
        }
    }
}
