package p000;

import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: bexe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bexe {

    /* renamed from: a */
    private static final int f112884a = bexk.f112907a.length;

    /* renamed from: b */
    private final bexf f112885b = new bexf(f112884a);

    /* renamed from: c */
    private final bexf f112886c = new bexf(f112884a);

    /* renamed from: d */
    private final bexf f112887d = new bexf(f112884a);

    /* renamed from: e */
    private final float f112888e;

    /* renamed from: f */
    private int f112889f = 0;

    /* renamed from: g */
    private float f112890g = -1.0f;

    public bexe(String str) {
        this.f112888e = bexg.f112895a.containsKey(str) ? ((Float) bexg.f112895a.get(str)).floatValue() : 1.0f;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* renamed from: a */
    public final synchronized bexk mo61218a(bgmg bgmg) {
        bexk bexk;
        int i;
        boolean z;
        float f;
        bexk = new bexk();
        int i2 = (int) (bgmg.f116818f / 1000);
        int i3 = this.f112889f;
        int i4 = i2 - i3;
        if (i3 != 0) {
            i = ((i4 + 60) / 360) - 1;
        } else {
            i = f112884a;
        }
        if (i3 == 0 || i4 >= 330) {
            z = true;
        } else {
            z = false;
        }
        for (int i5 = 0; i5 < i; i5++) {
            this.f112886c.mo61221a(0.002f);
        }
        this.f112886c.mo61221a(bgmg.f116815c);
        bexk.f112924f = this.f112886c.mo61219a(2);
        bexk.f112925g = this.f112886c.mo61219a(1);
        bexk.f112926h = this.f112886c.mo61219a(0);
        int i6 = 0;
        while (true) {
            f = 0.0f;
            if (i6 >= i) {
                break;
            }
            this.f112885b.mo61221a(0.0f);
            i6++;
        }
        float min = Math.min(1000.0f, this.f112888e * bgmg.f116813a);
        bexk.f112920b = min;
        float f2 = this.f112890g;
        if (f2 != -1.0f) {
            f = min - f2;
        }
        this.f112885b.mo61221a(f);
        bexk.f112921c = this.f112885b.mo61219a(2);
        bexk.f112922d = this.f112885b.mo61219a(1);
        bexk.f112923e = this.f112885b.mo61219a(0);
        this.f112890g = min;
        for (int i7 = 0; i7 < i; i7++) {
            this.f112887d.mo61221a(2.0f);
        }
        this.f112887d.mo61221a(bgmg.f116817e);
        bexk.f112915H = this.f112887d.mo61219a(2);
        bexk.f112916I = this.f112887d.mo61219a(1);
        bexk.f112917J = this.f112887d.mo61219a(0);
        bexk.f112919L = (float) bgmg.f116819g;
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone(TimeZone.getDefault().getID()));
        instance.setTimeInMillis(((long) i2) * 1000);
        bexk.f112918K = (float) instance.get(11);
        if (z) {
            this.f112889f = i2;
        }
        return bexk;
    }
}
