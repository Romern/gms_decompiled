package p000;

import java.util.Collection;

/* renamed from: yre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yre {

    /* renamed from: a */
    public final bngx f54481a;

    /* renamed from: b */
    public final bngx f54482b;

    /* renamed from: c */
    public final bngx f54483c;

    /* renamed from: d */
    public final bngx f54484d;

    /* renamed from: e */
    public final bngx f54485e;

    /* renamed from: f */
    public final String f54486f;

    /* renamed from: g */
    private final boolean f54487g;

    public yre(yrd yrd) {
        this.f54481a = bngx.m109368a((Collection) yrd.f54474a);
        this.f54482b = bngx.m109368a((Collection) yrd.f54475b);
        this.f54483c = bngx.m109368a((Collection) yrd.f54476c);
        this.f54484d = bngx.m109368a((Collection) yrd.f54478e);
        this.f54485e = bngx.m109368a((Collection) yrd.f54477d);
        this.f54486f = yrd.f54479f;
        this.f54487g = yrd.f54480g;
    }

    /* renamed from: b */
    public static yrd m44651b() {
        return new yrd();
    }

    /* renamed from: a */
    public final boolean mo30686a() {
        return !this.f54487g && (!this.f54481a.isEmpty() || !this.f54482b.isEmpty() || !this.f54484d.isEmpty()) && !this.f54486f.isEmpty();
    }
}
