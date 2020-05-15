package p000;

/* renamed from: dwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dwx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f14319a;

    /* renamed from: b */
    final /* synthetic */ dxa f14320b;

    public dwx(dxa dxa, long j) {
        this.f14320b = dxa;
        this.f14319a = j;
    }

    public final void run() {
        while (!this.f14320b.f14335a.isEmpty()) {
            ((dwz) this.f14320b.f14335a.poll()).mo9822a(this.f14319a);
        }
        this.f14320b.mo9825a();
    }
}
