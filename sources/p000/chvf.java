package p000;

/* renamed from: chvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chvf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ chvh f189256a;

    /* renamed from: b */
    final /* synthetic */ chvi f189257b;

    public chvf(chvi chvi, chvh chvh) {
        this.f189257b = chvi;
        this.f189256a = chvh;
    }

    public final void run() {
        this.f189257b.f189263b.unregisterReceiver(this.f189256a);
    }
}
