package p000;

/* renamed from: bulb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bulb extends buat {

    /* renamed from: a */
    final /* synthetic */ bulc f154119a;

    /* renamed from: b */
    private short[] f154120b;

    /* renamed from: c */
    private long[] f154121c;

    /* renamed from: d */
    private int[] f154122d;

    /* renamed from: e */
    private int[] f154123e;

    /* renamed from: f */
    private long[] f154124f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bulb(bulc bulc) {
        super(null);
        this.f154119a = bulc;
    }

    /* renamed from: a */
    public final void mo61442a() {
        bulc bulc = this.f154119a;
        this.f154120b = bulc.f154126b;
        this.f154121c = bulc.f154127e;
        this.f154122d = bulc.f154128f;
        this.f154123e = bulc.f154129g;
        this.f154124f = bulc.f154130h;
    }

    /* renamed from: b */
    public final void mo61445b() {
        this.f154120b = null;
        this.f154121c = null;
        this.f154122d = null;
        this.f154123e = null;
        this.f154124f = null;
    }

    /* renamed from: b */
    public final void mo61446b(int i) {
    }

    /* renamed from: a */
    public final void mo61443a(int i) {
        bulc bulc = this.f154119a;
        bulc.f154126b = new short[i];
        bulc.f154127e = new long[i];
        bulc.f154128f = new int[i];
        bulc.f154129g = new int[i];
        bulc.f154130h = new long[i];
    }

    /* renamed from: a */
    public final void mo61444a(int i, int i2) {
        bulc bulc = this.f154119a;
        bulc.f154126b[i2] = this.f154120b[i];
        bulc.f154127e[i2] = this.f154121c[i];
        bulc.f154128f[i2] = this.f154122d[i];
        bulc.f154129g[i2] = this.f154123e[i];
        bulc.f154130h[i2] = this.f154124f[i];
    }
}
