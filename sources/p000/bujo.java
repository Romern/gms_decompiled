package p000;

/* renamed from: bujo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bujo extends buat {

    /* renamed from: a */
    final /* synthetic */ bujp f154034a;

    /* renamed from: b */
    private int[] f154035b;

    /* renamed from: c */
    private byte[] f154036c;

    /* renamed from: d */
    private byte[] f154037d;

    /* renamed from: e */
    private short[] f154038e;

    /* renamed from: f */
    private short[] f154039f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bujo(bujp bujp) {
        super(null);
        this.f154034a = bujp;
    }

    /* renamed from: a */
    public final void mo61442a() {
        bujp bujp = this.f154034a;
        this.f154035b = bujp.f154040a;
        this.f154036c = bujp.f154041b;
        this.f154037d = bujp.f154042e;
        this.f154038e = bujp.f154043f;
        this.f154039f = bujp.f154044g;
    }

    /* renamed from: b */
    public final void mo61445b() {
        this.f154035b = null;
        this.f154036c = null;
        this.f154037d = null;
        this.f154038e = null;
        this.f154039f = null;
    }

    /* renamed from: b */
    public final void mo61446b(int i) {
    }

    /* renamed from: a */
    public final void mo61443a(int i) {
        bujp bujp = this.f154034a;
        bujp.f154040a = new int[i];
        bujp.f154041b = new byte[i];
        bujp.f154042e = new byte[i];
        bujp.f154043f = new short[i];
        bujp.f154044g = new short[i];
    }

    /* renamed from: a */
    public final void mo61444a(int i, int i2) {
        bujp bujp = this.f154034a;
        bujp.f154040a[i2] = this.f154035b[i];
        bujp.f154041b[i2] = this.f154036c[i];
        bujp.f154042e[i2] = this.f154037d[i];
        bujp.f154043f[i2] = this.f154038e[i];
        bujp.f154044g[i2] = this.f154039f[i];
    }
}
