package p000;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: bem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bem {

    /* renamed from: a */
    private static final PointF f3095a = new PointF();

    /* renamed from: a */
    public static double m2818a(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    /* renamed from: a */
    public static float m2819a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    public static int m2822a(int i, int i2, float f) {
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    /* renamed from: b */
    public static float m2826b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: c */
    public static boolean m2827c(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    /* renamed from: a */
    static int m2820a(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if ((i ^ i2) < 0 && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    /* renamed from: a */
    public static int m2821a(int i) {
        return Math.max(0, Math.min(255, i));
    }

    /* renamed from: a */
    public static PointF m2823a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: a */
    public static void m2824a(bau bau, int i, List list, bau bau2, azo azo) {
        if (bau.mo2965c(azo.mo2930b(), i)) {
            list.add(bau2.mo2962a(azo.mo2930b()).mo2961a(azo));
        }
    }

    /* renamed from: a */
    public static void m2825a(bbx bbx, Path path) {
        path.reset();
        PointF pointF = bbx.f2900b;
        path.moveTo(pointF.x, pointF.y);
        f3095a.set(pointF.x, pointF.y);
        for (int i = 0; i < bbx.f2899a.size(); i++) {
            baq baq = (baq) bbx.f2899a.get(i);
            PointF pointF2 = baq.f2792a;
            PointF pointF3 = baq.f2793b;
            PointF pointF4 = baq.f2794c;
            if (!pointF2.equals(f3095a) || !pointF3.equals(pointF4)) {
                path.cubicTo(pointF2.x, pointF2.y, pointF3.x, pointF3.y, pointF4.x, pointF4.y);
            } else {
                path.lineTo(pointF4.x, pointF4.y);
            }
            f3095a.set(pointF4.x, pointF4.y);
        }
        if (bbx.f2901c) {
            path.close();
        }
    }
}
