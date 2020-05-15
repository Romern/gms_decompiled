package p000;

/* renamed from: agcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class agcu extends agct {

    /* renamed from: a */
    public boolean f65233a;

    public agcu(agje agje) {
        super(agje);
        this.f65756y.f65706v++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo35244k() {
        return this.f65233a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo35245l() {
        if (!mo35244k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: m */
    public final void mo35246m() {
        if (this.f65233a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo35247n()) {
            this.f65756y.mo35517u();
            this.f65233a = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract boolean mo35247n();
}
