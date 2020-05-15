package p000;

/* renamed from: ffu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ffu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f16476a;

    /* renamed from: b */
    final /* synthetic */ ffv f16477b;

    public ffu(ffv ffv, int i) {
        this.f16477b = ffv;
        this.f16476a = i;
    }

    public final void run() {
        this.f16477b.mo10786a(this.f16476a, ((Integer) ffv.f16478a.get(1)).intValue(), -1);
        this.f16477b.f16480c.remove(this);
    }
}
