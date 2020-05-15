package p000;

/* renamed from: poq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class poq {

    /* renamed from: a */
    public final boolean f39933a;

    /* renamed from: b */
    public final boolean f39934b;

    /* renamed from: c */
    private final String f39935c;

    /* renamed from: d */
    private final pnl f39936d;

    /* renamed from: e */
    private final plx f39937e;

    public poq(pnl pnl, plx plx, boolean z, boolean z2, String str) {
        this.f39936d = pnl;
        this.f39937e = plx;
        this.f39935c = str;
        this.f39933a = z;
        this.f39934b = z2;
    }

    /* renamed from: a */
    public final void mo23522a() {
        synchronized (this.f39936d) {
            mo23518a(this.f39936d);
            if (this.f39933a) {
                pes.m30266a().execute(new plw(this.f39937e, this.f39935c, this.f39934b));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo23518a(pnl pnl);
}
