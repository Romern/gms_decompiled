package p000;

/* renamed from: fkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class fkj extends fki {

    /* renamed from: a */
    private boolean f16780a;

    protected fkj(fkm fkm) {
        super(fkm);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10890a();

    /* renamed from: s */
    public final boolean mo10953s() {
        return this.f16780a;
    }

    /* renamed from: t */
    public final void mo10954t() {
        if (!mo10953s()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: u */
    public final void mo10955u() {
        mo10890a();
        this.f16780a = true;
    }
}
