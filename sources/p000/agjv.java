package p000;

/* renamed from: agjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class agjv extends agju {

    /* renamed from: a */
    private boolean f65757a;

    public agjv(agje agje) {
        super(agje);
        this.f65756y.f65706v++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo35464G() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo35371a();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo35543g() {
        return this.f65757a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo35544k() {
        if (!mo35543g()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: l */
    public final void mo35545l() {
        if (this.f65757a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo35371a()) {
            this.f65756y.mo35517u();
            this.f65757a = true;
        }
    }

    /* renamed from: m */
    public final void mo35546m() {
        if (!this.f65757a) {
            mo35464G();
            this.f65756y.mo35517u();
            this.f65757a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
