package p000;

/* renamed from: agmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class agmg extends agmf {

    /* renamed from: a */
    private boolean f65931a;

    public agmg(agmn agmn) {
        super(agmn);
        this.f65930j.f65957k++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo35305a();

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final boolean mo35658p() {
        return this.f65931a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo35659q() {
        if (!mo35658p()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: r */
    public final void mo35660r() {
        if (this.f65931a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo35305a()) {
            this.f65930j.f65958l++;
            this.f65931a = true;
        }
    }
}
