package p000;

/* renamed from: vfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class vfe extends vfb {

    /* renamed from: a */
    private txg f49165a = null;

    /* renamed from: b */
    private txg f49166b = txi.f46909a;

    protected vfe() {
    }

    /* renamed from: b */
    private final txg mo28360b() {
        txg txg = this.f49165a;
        return txg == null ? this.f49166b : txg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28358a(txg txg);

    /* renamed from: c */
    public final synchronized void mo28374c(txg txg) {
        this.f49165a = txg;
        mo28358a(mo28360b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final synchronized void mo28381d(txg txg) {
        sdo.m34959a(txg);
        this.f49166b = txg;
        if (this.f49165a == null) {
            mo28358a(mo28360b());
        }
    }
}
