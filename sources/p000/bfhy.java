package p000;

/* renamed from: bfhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfhy extends bfhv {

    /* renamed from: a */
    private final float[] f113980a;

    /* renamed from: b */
    private final long f113981b;

    /* renamed from: c */
    private final int f113982c;

    public bfhy(float[] fArr, long j, int i) {
        this.f113980a = fArr;
        this.f113981b = j;
        this.f113982c = i;
    }

    /* renamed from: a */
    public final void mo61707a(bfev bfev) {
        bfev.post(new bfes(bfev, this.f113980a, this.f113981b, this.f113982c));
    }
}
