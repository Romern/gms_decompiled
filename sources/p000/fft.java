package p000;

/* renamed from: fft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fft implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f16474a;

    /* renamed from: b */
    final /* synthetic */ ffv f16475b;

    public fft(ffv ffv, int i) {
        this.f16475b = ffv;
        this.f16474a = i;
    }

    public final void run() {
        this.f16475b.mo10786a(this.f16474a, ((Integer) ffv.f16478a.get(0)).intValue(), ((Integer) ffv.f16478a.get(1)).intValue());
        this.f16475b.f16480c.remove(this);
    }
}
