package p000;

/* renamed from: abwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abwo {

    /* renamed from: a */
    public final abwl f58635a;

    /* renamed from: b */
    public final abwq f58636b;

    /* renamed from: c */
    public final int f58637c;

    /* renamed from: d */
    public final abwp f58638d;

    /* renamed from: e */
    private final bqbd f58639e;

    public abwo(bqbd bqbd, abwl abwl, boolean z, int i, abwp abwp) {
        this.f58639e = bqbd;
        this.f58635a = abwl;
        this.f58636b = z ? new abwq() : null;
        this.f58637c = i;
        this.f58638d = abwp;
    }

    /* renamed from: a */
    public final acpn mo32386a(int i) {
        return new abwm(this, this.f58639e, i, this.f58638d.f58640a);
    }

    /* renamed from: a */
    public final boolean mo32387a() {
        return this.f58636b != null;
    }

    /* renamed from: b */
    public final acpn mo32388b() {
        return mo32386a(3);
    }
}
