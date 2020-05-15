package p000;

/* renamed from: is */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1089is implements C0038ax {

    /* renamed from: a */
    public final C1140ko f21605a;

    /* renamed from: b */
    public final C1085ip f21606b;

    /* renamed from: c */
    public boolean f21607c = false;

    public C1089is(C1140ko koVar, C1085ip ipVar) {
        this.f21605a = koVar;
        this.f21606b = ipVar;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        if (C1092iv.m16194c(2)) {
            "  onLoadFinished in " + this.f21605a + ": " + this.f21605a.dataToString(obj);
        }
        this.f21607c = true;
        this.f21606b.mo8608a(this.f21605a, obj);
    }

    public final String toString() {
        return this.f21606b.toString();
    }
}
