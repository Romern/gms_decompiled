package p000;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;

/* renamed from: oam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oam {
    static {
        odk.m28481a("CAR.VIDEO");
    }

    /* renamed from: a */
    public static float m28292a(Context context, float f, int i, int i2) {
        float f2;
        double d = (double) f;
        if (d == 1.0d) {
            return f;
        }
        Point point = new Point();
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        bmxy.m108581a(displayManager);
        displayManager.getDisplay(0).getSize(point);
        if (d != 1.0d) {
            float o = (float) ccuf.f179931a.mo6606a().mo76804o();
            if (1.0f / o <= f && f <= o) {
                f = 1.0f;
            }
        }
        double d2 = (double) f;
        if (d2 == 1.0d) {
            return f;
        }
        if (i < i2) {
            f2 = d2 >= 1.0d ? ((float) Math.min(point.x, point.y)) / ((float) i) : ((float) Math.max(point.x, point.y)) / ((float) i2);
        } else {
            f2 = d2 >= 1.0d ? ((float) Math.max(point.x, point.y)) / ((float) i) : ((float) Math.min(point.x, point.y)) / ((float) i2);
        }
        float n = (float) ccuf.f179931a.mo6606a().mo76803n();
        if (f >= 1.0f) {
            return Math.min(f, Math.min(n, f2));
        }
        return 1.0f / Math.min(1.0f / f, Math.min(n, f2));
    }

    /* renamed from: a */
    public static Size m28293a(float f, int i, int i2) {
        double d = (double) f;
        if (d < 1.0d) {
            i2 = Math.round(((float) i2) / f);
        } else if (d > 1.0d) {
            i = Math.round(((float) i) * f);
        }
        return new Size(i, i2);
    }
}
