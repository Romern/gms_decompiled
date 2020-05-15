package p000;

/* renamed from: buke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buke extends buat {

    /* renamed from: a */
    final /* synthetic */ bukf f154068a;

    /* renamed from: b */
    private byte[] f154069b;

    /* renamed from: c */
    private short[] f154070c;

    /* renamed from: d */
    private short[] f154071d;

    /* renamed from: e */
    private long[] f154072e;

    /* renamed from: f */
    private long[] f154073f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buke(bukf bukf) {
        super(null);
        this.f154068a = bukf;
    }

    /* renamed from: a */
    public final void mo61442a() {
        bukf bukf = this.f154068a;
        this.f154069b = bukf.f154075a;
        this.f154070c = bukf.f154076b;
        this.f154071d = bukf.f154077e;
        this.f154072e = bukf.f154078f;
        this.f154073f = bukf.f154079g;
    }

    /* renamed from: b */
    public final void mo61445b() {
        this.f154069b = null;
        this.f154070c = null;
        this.f154071d = null;
        this.f154072e = null;
        this.f154073f = null;
    }

    /* renamed from: b */
    public final void mo61446b(int i) {
    }

    /* renamed from: a */
    public final void mo61443a(int i) {
        bukf bukf = this.f154068a;
        bukf.f154075a = new byte[(i * 3)];
        bukf.f154076b = new short[i];
        bukf.f154077e = new short[i];
        bukf.f154078f = new long[i];
        bukf.f154079g = new long[i];
    }

    /* renamed from: a */
    public final void mo61444a(int i, int i2) {
        System.arraycopy(this.f154069b, i * 3, this.f154068a.f154075a, i2 * 3, 3);
        bukf bukf = this.f154068a;
        bukf.f154076b[i2] = this.f154070c[i];
        bukf.f154077e[i2] = this.f154071d[i];
        bukf.f154078f[i2] = this.f154072e[i];
        bukf.f154079g[i2] = this.f154073f[i];
    }
}
