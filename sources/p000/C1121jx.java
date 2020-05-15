package p000;

/* renamed from: jx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1121jx implements C1186mf {

    /* renamed from: a */
    final /* synthetic */ C1187mg f23436a;

    /* renamed from: b */
    final /* synthetic */ C1125ka f23437b;

    /* renamed from: c */
    final /* synthetic */ C1123jz f23438c;

    public C1121jx(C1125ka kaVar, C1123jz jzVar, C1187mg mgVar) {
        this.f23437b = kaVar;
        this.f23438c = jzVar;
        this.f23436a = mgVar;
    }

    /* renamed from: a */
    public final void mo2389a() {
        synchronized (this.f23437b.f23597a) {
            this.f23437b.f23597a.remove(this.f23438c);
            this.f23437b.f23598b.remove(this.f23438c.f23557a);
            this.f23436a.mo15461b();
        }
    }
}
