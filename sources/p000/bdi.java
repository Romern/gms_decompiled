package p000;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdi {

    /* renamed from: a */
    private static final bed f3036a = bed.m2754a("x", "y");

    /* renamed from: a */
    static int m2727a(bef bef) {
        bef.mo3021a();
        int j = (int) (bef.mo3031j() * 255.0d);
        int j2 = (int) (bef.mo3031j() * 255.0d);
        int j3 = (int) (bef.mo3031j() * 255.0d);
        while (bef.mo3026e()) {
            bef.mo3033l();
        }
        bef.mo3023b();
        return Color.argb(255, j, j2, j3);
    }

    /* renamed from: b */
    static float m2729b(bef bef) {
        int n = bef.mo3035n();
        int i = n - 1;
        if (n == 0) {
            throw null;
        } else if (i == 0) {
            bef.mo3021a();
            float j = (float) bef.mo3031j();
            while (bef.mo3026e()) {
                bef.mo3033l();
            }
            bef.mo3023b();
            return j;
        } else if (i == 6) {
            return (float) bef.mo3031j();
        } else {
            throw new IllegalArgumentException("Unknown value for token of type " + ((Object) bee.m2755a(n)));
        }
    }

    /* renamed from: a */
    static List m2728a(bef bef, float f) {
        ArrayList arrayList = new ArrayList();
        bef.mo3021a();
        while (bef.mo3035n() == 1) {
            bef.mo3021a();
            arrayList.add(m2730b(bef, f));
            bef.mo3023b();
        }
        bef.mo3023b();
        return arrayList;
    }

    /* renamed from: b */
    static PointF m2730b(bef bef, float f) {
        int n = bef.mo3035n();
        int i = n - 1;
        if (n == 0) {
            throw null;
        } else if (i == 0) {
            bef.mo3021a();
            float j = (float) bef.mo3031j();
            float j2 = (float) bef.mo3031j();
            while (bef.mo3035n() != 2) {
                bef.mo3033l();
            }
            bef.mo3023b();
            return new PointF(j * f, j2 * f);
        } else if (i == 2) {
            bef.mo3024c();
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (bef.mo3026e()) {
                int a = bef.mo3019a(f3036a);
                if (a == 0) {
                    f2 = m2729b(bef);
                } else if (a != 1) {
                    bef.mo3028g();
                    bef.mo3033l();
                } else {
                    f3 = m2729b(bef);
                }
            }
            bef.mo3025d();
            return new PointF(f2 * f, f3 * f);
        } else if (i == 6) {
            float j3 = (float) bef.mo3031j();
            float j4 = (float) bef.mo3031j();
            while (bef.mo3026e()) {
                bef.mo3033l();
            }
            return new PointF(j3 * f, j4 * f);
        } else {
            throw new IllegalArgumentException("Unknown point starts with " + ((Object) bee.m2755a(bef.mo3035n())));
        }
    }
}
