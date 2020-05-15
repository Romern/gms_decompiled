package p000;

import java.io.DataInputStream;

/* renamed from: bukl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bukl {

    /* renamed from: a */
    static final double f154096a = Math.pow(Math.pow(2.0d, 15.0d), 4.0d);

    /* renamed from: b */
    private final bukk[] f154097b;

    private bukl(int i) {
        this.f154097b = new bukk[i];
    }

    /* renamed from: a */
    static float m119736a(short s) {
        double d = (double) s;
        return (float) ((Math.pow(Math.abs(d), 4.0d) / f154096a) * 6.2d * Math.signum(d));
    }

    /* renamed from: a */
    public static bukl m119737a(DataInputStream dataInputStream) {
        short readShort = dataInputStream.readShort();
        bukl bukl = new bukl(readShort);
        for (int i = 0; i < readShort; i++) {
            short readShort2 = dataInputStream.readShort();
            short readShort3 = dataInputStream.readShort();
            bukk bukk = new bukk(readShort2, readShort3);
            for (int i2 = 0; i2 < readShort2; i2++) {
                for (int i3 = 0; i3 < readShort3; i3++) {
                    bukk.f154093a[i2][i3] = m119736a(dataInputStream.readShort());
                }
            }
            for (int i4 = 0; i4 < readShort3; i4++) {
                bukk.f154094b[i4] = m119736a(dataInputStream.readShort());
            }
            bukl.f154097b[i] = bukk;
        }
        return bukl;
    }

    /* renamed from: a */
    public final float[] mo72778a(float[] fArr) {
        float[] fArr2 = null;
        int i = 0;
        while (true) {
            bukk[] bukkArr = this.f154097b;
            int length = bukkArr.length;
            if (i >= length) {
                return fArr2;
            }
            int i2 = length - 1;
            bukk bukk = bukkArr[i];
            float[][] fArr3 = bukk.f154093a;
            float[] fArr4 = bukk.f154094b;
            fArr2 = bukk.f154095c;
            int length2 = fArr3.length;
            int length3 = fArr4.length;
            for (int i3 = 0; i3 < length3; i3++) {
                fArr2[i3] = fArr4[i3];
            }
            for (int i4 = 0; i4 < length2; i4++) {
                float f = fArr[i4];
                float[] fArr5 = fArr3[i4];
                for (int i5 = 0; i5 < length3; i5++) {
                    fArr2[i5] = fArr2[i5] + (fArr5[i5] * f);
                }
            }
            if (i != i2) {
                for (int i6 = 0; i6 < length3; i6++) {
                    float f2 = fArr2[i6];
                    if (f2 < 0.0f) {
                        f2 = ((float) Double.longBitsToDouble(((long) ((f2 * 1512775.0f) + 1.07263245E9f)) << 32)) - 4.0f;
                    }
                    fArr2[i6] = f2;
                }
            }
            i++;
            fArr = fArr2;
        }
    }
}
