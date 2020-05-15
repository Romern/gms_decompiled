package p000;

/* renamed from: chyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chyj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cida f189514a;

    public chyj(cida cida) {
        this.f189514a = cida;
    }

    public final void run() {
        cicf cicf = (cicf) this.f189514a;
        bmxy.m108601b(cicf.f189762a.f189850y.get(), "Channel must have been shut down");
        cicf.f189762a.f189803A = true;
        cicf.f189762a.mo85955a(false);
        cicf.f189762a.mo85957h();
        cicf.f189762a.mo85964o();
    }
}
