package p000;

/* renamed from: ucm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ucm extends uco {
    protected ucm(String str, ubk ubk, uto uto) {
        super(str, ubk, uto, 64);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo27236d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo27237e() {
        if (this.f47237a.mo27097f()) {
            mo27236d();
            return;
        }
        throw new aaaj(10, "App is not authorized to make this request.");
    }
}
