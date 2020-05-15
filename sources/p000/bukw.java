package p000;

/* renamed from: bukw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bukw extends buat {

    /* renamed from: a */
    final /* synthetic */ bukx f154106a;

    /* renamed from: b */
    private short[] f154107b;

    /* renamed from: c */
    private long[] f154108c;

    /* renamed from: d */
    private int[] f154109d;

    /* renamed from: e */
    private long[] f154110e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bukw(bukx bukx) {
        super(null);
        this.f154106a = bukx;
    }

    /* renamed from: a */
    public final void mo61442a() {
        bukx bukx = this.f154106a;
        this.f154107b = bukx.f154112b;
        this.f154108c = bukx.f154113e;
        this.f154109d = bukx.f154114f;
        this.f154110e = bukx.f154115g;
    }

    /* renamed from: b */
    public final void mo61445b() {
        this.f154107b = null;
        this.f154108c = null;
        this.f154109d = null;
        this.f154110e = null;
    }

    /* renamed from: b */
    public final void mo61446b(int i) {
    }

    /* renamed from: a */
    public final void mo61443a(int i) {
        bukx bukx = this.f154106a;
        bukx.f154112b = new short[i];
        bukx.f154113e = new long[i];
        bukx.f154114f = new int[i];
        bukx.f154115g = new long[i];
    }

    /* renamed from: a */
    public final void mo61444a(int i, int i2) {
        bukx bukx = this.f154106a;
        bukx.f154112b[i2] = this.f154107b[i];
        bukx.f154113e[i2] = this.f154108c[i];
        bukx.f154114f[i2] = this.f154109d[i];
        bukx.f154115g[i2] = this.f154110e[i];
    }
}
