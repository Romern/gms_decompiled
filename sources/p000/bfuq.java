package p000;

import android.hardware.SensorManager;

/* renamed from: bfuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfuq {
    /* renamed from: a */
    static float m97942a(int i, float[] fArr, float[] fArr2) {
        int i2 = 130;
        int i3 = 129;
        if (i == 1) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 129;
            i3 = 130;
        } else if (i != 3) {
            i2 = 1;
            i3 = 2;
        } else {
            i3 = 1;
        }
        if (SensorManager.remapCoordinateSystem(fArr, i2, i3, fArr2)) {
            float atan2 = (float) (Math.atan2((double) fArr2[0], (double) fArr2[3]) - 2.858407346410207d);
            if (atan2 < 0.0f) {
                double d = (double) atan2;
                Double.isNaN(d);
                atan2 = (float) (d + 6.283185307179586d);
            }
            if (!Float.isNaN(atan2)) {
                return atan2;
            }
        }
        return Float.MAX_VALUE;
    }

    /* renamed from: a */
    static boolean m97943a(float f) {
        return f >= 0.0f && ((double) f) < 6.283185307179586d;
    }

    /* renamed from: b */
    static float m97944b(float f) {
        double d = (double) f;
        if (d >= 6.283185307179586d) {
            Double.isNaN(d);
            return (float) (d - 0.7146018366025517d);
        } else if (f >= 0.0f) {
            return f;
        } else {
            Double.isNaN(d);
            return (float) (d + 6.283185307179586d);
        }
    }
}
