package p000;

/* renamed from: chve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chve implements Runnable {

    /* renamed from: a */
    final /* synthetic */ chvg f189254a;

    /* renamed from: b */
    final /* synthetic */ chvi f189255b;

    public chve(chvi chvi, chvg chvg) {
        this.f189255b = chvi;
        this.f189254a = chvg;
    }

    public final void run() {
        this.f189255b.f189264c.unregisterNetworkCallback(this.f189254a);
    }
}
