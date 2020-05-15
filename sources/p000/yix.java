package p000;

import java.util.Map;
import java.util.logging.Level;

/* renamed from: yix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yix {

    /* renamed from: a */
    public static final Integer f53892a = 7;

    /* renamed from: b */
    public final float f53893b;

    /* renamed from: c */
    public final float f53894c;

    /* renamed from: d */
    private final bnhe f53895d;

    public yix(Map map, float f, float f2) {
        this.f53895d = bnhe.m109413a(map);
        this.f53893b = f;
        this.f53894c = f2;
    }

    /* renamed from: a */
    public static final boolean m44207a(int i) {
        return (yiv.f53885a.get(i) || yiv.f53886b.get(i)) && !yhi.m44106a(i) && !yhi.f53823a.get(i);
    }

    /* renamed from: a */
    public final float mo30550a(int i, float f) {
        return mo30551a(i, f, 1.7f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        if (r6 > r0) goto L_0x004c;
     */
    /* renamed from: a */
    public final float mo30551a(int i, float f, float f2) {
        int i2;
        if (m44207a(i)) {
            if (yiv.f53885a.get(i)) {
                i2 = 8;
            } else if (!yiv.f53886b.get(i)) {
                ypq.m44538a("Gait", Level.WARNING, "Unknown gait for Activity: %s", bzzh.m126348a(i));
                i2 = 4;
            } else {
                i2 = 7;
            }
            yiw yiw = (yiw) this.f53895d.get(Integer.valueOf(i2));
            if (yiw != null) {
                float f3 = yiw.f53890d;
                if (f >= f3) {
                    f3 = yiw.f53891e;
                }
                f = f3;
                if (f2 < 0.3f) {
                    f2 = 0.3f;
                } else if (f2 > 2.46f) {
                    f2 = 2.46f;
                }
                float f4 = (yiw.f53887a * f2 * f) + (yiw.f53888b * f2) + yiw.f53889c;
                if (f4 > 2.0f) {
                    return 2.0f;
                }
                if (f4 >= 0.4f) {
                    return f4;
                }
                return 0.4f;
            }
        }
        return 0.4f;
    }
}
