package p000;

/* renamed from: bfyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bfyv {

    /* renamed from: a */
    private final int f115737a;

    /* renamed from: b */
    private volatile boolean f115738b;

    /* renamed from: c */
    private volatile Object f115739c;

    /* renamed from: d */
    public final Object f115740d;

    protected bfyv(int i) {
        this(i, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo62422a();

    /* renamed from: a */
    public final void mo62448a(bgan bgan) {
        bgan.mo62545b(this.f115737a, this);
    }

    /* renamed from: b */
    public final Object mo62450b() {
        rzz.m34730a(this.f115738b, "getResultWhenAvailable called before result is set.");
        return this.f115739c;
    }

    protected bfyv(int i, Object obj) {
        this.f115738b = false;
        this.f115737a = i;
        this.f115740d = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62449a(Object obj) {
        this.f115739c = obj;
        this.f115738b = true;
        mo62422a();
    }
}
