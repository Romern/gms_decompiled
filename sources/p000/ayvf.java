package p000;

import java.lang.reflect.Array;

/* renamed from: ayvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayvf {

    /* renamed from: a */
    public final byte[][] f98538a = ((byte[][]) Array.newInstance(byte.class, 4, 3));

    /* renamed from: b */
    private double[][] f98539b = ((double[][]) Array.newInstance(double.class, 4, 3));

    /* renamed from: c */
    private double[][] f98540c = null;

    public ayvf() {
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                this.f98538a[i2][i] = (byte) i;
            }
        }
    }

    /* renamed from: b */
    private final double m84929b(int i) {
        double d = 0.0d;
        for (int i2 = 0; i2 < 4; i2++) {
            d += this.f98540c[i2][i];
        }
        return d;
    }

    /* renamed from: a */
    public final ayve mo54445a(int i) {
        double[][] dArr = this.f98540c;
        if (dArr == null) {
            this.f98540c = this.f98539b;
            this.f98539b = null;
            for (int i2 = 0; i2 < 3; i2++) {
                for (int i3 = 0; i3 < 4; i3++) {
                    byte b = this.f98538a[i3][i2];
                    if (b != i2) {
                        double b2 = this.f98540c[i3][b] / m84929b(b);
                        this.f98540c[i3][i2] = 0.0d;
                        this.f98540c[i3][i2] = ((-b2) * m84929b(i2)) / (b2 - 4.0d);
                    }
                }
            }
            for (int i4 = 0; i4 < 3; i4++) {
                double b3 = m84929b(i4);
                int i5 = 0;
                while (i5 < 4) {
                    double[] dArr2 = this.f98540c[i5];
                    double d = dArr2[i4];
                    if (d != 0.0d) {
                        dArr2[i4] = Math.log10(d / b3);
                        i5++;
                    } else {
                        throw new IllegalArgumentException(String.format("All state/observation combinations must have a frequency > 0, state=%s, obs=%s", Integer.valueOf(i4), Integer.valueOf(i5)));
                    }
                }
            }
            dArr = this.f98540c;
        }
        return new ayve(dArr[i], i);
    }

    /* renamed from: a */
    public final void mo54446a(int i, int i2, double d) {
        this.f98539b[i2][i] = d;
    }
}
