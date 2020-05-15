package p000;

/* renamed from: bj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0051bj implements C0038ax {

    /* renamed from: a */
    boolean f3357a = true;

    /* renamed from: b */
    final /* synthetic */ C0036av f3358b;

    public C0051bj(C0036av avVar) {
        this.f3358b = avVar;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        Object b = this.f3358b.mo2448b();
        if (this.f3357a || ((b == null && obj != null) || (b != null && !b.equals(obj)))) {
            this.f3357a = false;
            this.f3358b.mo2450b(obj);
        }
    }
}
