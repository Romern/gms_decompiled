package p000;

/* renamed from: chzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chzj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f189581a;

    /* renamed from: b */
    final /* synthetic */ chzk f189582b;

    public chzj(chzk chzk, boolean z) {
        this.f189582b = chzk;
        this.f189581a = z;
    }

    public final void run() {
        if (this.f189581a) {
            chzn chzn = this.f189582b.f189583a;
            chzn.f189606p = true;
            if (chzn.f189603m > 0) {
                bmza bmza = chzn.f189605o;
                bmza.mo66929c();
                bmza.mo66930d();
            }
        }
        this.f189582b.f189583a.f189608r = false;
    }
}
