package p000;

/* renamed from: advh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class advh {

    /* renamed from: a */
    public final int f62802a;

    /* renamed from: b */
    public final float f62803b;

    /* renamed from: c */
    private final String f62804c;

    /* renamed from: d */
    private final advx f62805d;

    public advh(String str, int i, float f, advx advx) {
        this.f62804c = str;
        this.f62802a = i;
        this.f62803b = f;
        this.f62805d = advx;
    }

    /* renamed from: a */
    public final float mo33852a() {
        return this.f62805d.mo33857a(this.f62802a);
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("sourceId", this.f62804c);
        a.mo66883a("interactions", this.f62802a);
        a.mo66885a("weight", String.valueOf(this.f62803b));
        a.mo66885a("confidenceFn", this.f62805d);
        return a.toString();
    }
}
