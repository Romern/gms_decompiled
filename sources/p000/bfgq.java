package p000;

/* renamed from: bfgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bfgq {

    /* renamed from: h */
    protected final bfew f113796h;

    /* renamed from: i */
    protected final bhdb f113797i;

    /* renamed from: j */
    protected volatile boolean f113798j = false;

    /* renamed from: k */
    protected final bfhd f113799k;

    /* renamed from: l */
    protected int f113800l;

    public bfgq(bfew bfew, bhdb bhdb, bfhd bfhd) {
        this.f113796h = bfew;
        this.f113797i = bfib.m96837a(bhdb);
        this.f113799k = bfhd;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo61567a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo61568a(bsax bsax, bsax bsax2);

    /* renamed from: b */
    public final synchronized boolean mo61668b(bsax bsax, bsax bsax2) {
        boolean z;
        if (!this.f113798j) {
            int i = this.f113800l + 1;
            this.f113800l = i;
            bfhd bfhd = this.f113799k;
            if (bfhd != null) {
                bfhd.mo61689a(i);
                this.f113799k.mo61690a(bsax);
            }
            z = mo61568a(bsax, bsax2);
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public final synchronized void mo61669c() {
        this.f113798j = true;
        mo61567a();
    }
}
