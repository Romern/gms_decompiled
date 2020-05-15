package p000;

/* renamed from: zio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zio implements zis {

    /* renamed from: a */
    private boolean f55150a = false;

    /* renamed from: a */
    public final synchronized void mo31156a() {
        this.f55150a = false;
    }

    /* renamed from: b */
    public final synchronized boolean mo31158b() {
        return this.f55150a;
    }

    /* renamed from: a */
    public final synchronized void mo31157a(zir zir) {
        zir.mo31154a(true);
        this.f55150a = true;
    }
}
