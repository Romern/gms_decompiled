package p000;

import android.util.Log;

/* renamed from: aanu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aanu {

    /* renamed from: a */
    public final int f28654a = ((int) cecw.f182273a.mo6606a().mo78776f());

    /* renamed from: b */
    public final int f28655b = ((int) cecw.m136030c());

    /* renamed from: c */
    public final int f28656c = ((int) cecw.m136031d());

    /* renamed from: d */
    public final int f28657d = ((int) cecw.m136029b());

    /* renamed from: e */
    public final double f28658e;

    /* renamed from: f */
    public final int f28659f;

    /* renamed from: g */
    public final int f28660g;

    /* renamed from: h */
    public final int f28661h;

    /* renamed from: i */
    public final int f28662i;

    /* renamed from: j */
    public final int f28663j;

    public aanu() {
        if (cecw.m136030c() > cecw.m136029b() || cecw.m136029b() > cecw.m136031d()) {
            long c = cecw.m136030c();
            long d = cecw.m136031d();
            long b = cecw.m136029b();
            StringBuilder sb = new StringBuilder(160);
            sb.append("Invalid upward triggers: fast_upward_trigger: ");
            sb.append(c);
            sb.append(", slow_upward_trigger: ");
            sb.append(d);
            sb.append(", after_ratio_upward_trigger: ");
            sb.append(b);
            sb.append(".");
            Log.w("GCM", sb.toString());
        }
        this.f28662i = (int) cecw.f182273a.mo6606a().mo78777g();
        this.f28659f = (int) cecw.f182273a.mo6606a().mo78773c();
        this.f28660g = (int) cecw.f182273a.mo6606a().mo78779i();
        int h = (int) cecw.f182273a.mo6606a().mo78778h();
        int i = this.f28660g;
        int i2 = this.f28662i;
        if (h >= i) {
            int i3 = (h - i) % i2;
            if (i3 != 0) {
                Log.w("GCM", "Longest interval is not at step boundary. Rounding it down to step boundary.");
                h -= i3;
            }
        } else {
            Log.w("GCM", "Longest interval is shorter than shortest interval. Replacing longest with shortest.");
            h = i;
        }
        this.f28661h = h;
        int e = (int) cecw.f182273a.mo6606a().mo78775e();
        int i4 = this.f28660g;
        int i5 = this.f28661h;
        if (e < i4 || e > i5) {
            Log.w("GCM", "Initial interval is not between the shortest and longest interval. Using the average of shortest and longest interval as the initial interval.");
            e = (i4 + i5) / 2;
        }
        this.f28663j = e;
        this.f28658e = cecw.f182273a.mo6606a().mo78772b();
    }
}
