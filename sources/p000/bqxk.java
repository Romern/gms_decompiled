package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bqxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqxk {
    /* renamed from: a */
    public static void m113669a(boat boat, int i, bqxj bqxj) {
        if (i < 0) {
            boat.write(0);
        } else if (bqxj != bqxj.UTF8) {
            if (i > 32767) {
                int i2 = (i >> 16) | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                boat.write(i2 & 255);
                boat.write(i2 >> 8);
            }
            boat.write(i & 255);
            boat.write((i >> 8) & 255);
        } else {
            if (i > 127) {
                boat.write(((i & 32512) >> 8) | 128);
            }
            boat.write(i & 255);
        }
    }
}
