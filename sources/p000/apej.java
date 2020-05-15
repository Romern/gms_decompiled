package p000;

import java.util.ArrayList;

/* renamed from: apej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apej {

    /* renamed from: a */
    public final String f84229a;

    /* renamed from: b */
    public final Long f84230b;

    /* renamed from: c */
    public final long f84231c;

    /* renamed from: d */
    public final int f84232d;

    /* renamed from: e */
    public final int f84233e;

    /* renamed from: f */
    public final int f84234f;

    /* renamed from: g */
    public final int f84235g;

    /* renamed from: h */
    public final int f84236h;

    /* renamed from: i */
    public final ArrayList f84237i;

    /* renamed from: j */
    public final ArrayList f84238j;

    /* renamed from: k */
    public String f84239k;

    /* renamed from: l */
    public final ltn f84240l;

    /* renamed from: m */
    public long f84241m;

    public apej(apei apei) {
        this.f84229a = apei.f84218a;
        this.f84239k = apei.f84220c;
        this.f84231c = apei.f84221d;
        this.f84241m = apei.f84222e;
        int i = apei.f84223f;
        this.f84234f = i;
        int i2 = apei.f84224g;
        this.f84235g = i2;
        int i3 = apei.f84225h;
        this.f84236h = i3;
        this.f84237i = apei.f84226i;
        this.f84238j = apei.f84227j;
        this.f84232d = i + i2 + i3;
        this.f84233e = i2 + i3;
        this.f84240l = apei.f84228k;
        this.f84230b = apei.f84219b;
    }

    /* renamed from: a */
    public static boolean m70093a(ltn ltn) {
        if (!(ltn == null || (ltn.f32962a & 1024) == 0)) {
            int a = ltm.m24380a(ltn.f32967f);
            if (a != 0 && a == 3) {
                return true;
            }
            int a2 = ltm.m24380a(ltn.f32967f);
            return a2 != 0 && a2 == 4;
        }
    }

    /* renamed from: a */
    public final boolean mo47137a() {
        return this.f84240l != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo47138b() {
        return m70093a(this.f84240l);
    }
}
