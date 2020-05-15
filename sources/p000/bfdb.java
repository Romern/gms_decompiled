package p000;

/* renamed from: bfdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfdb extends buat {

    /* renamed from: a */
    final /* synthetic */ bfdd f113459a;

    /* renamed from: b */
    private int[] f113460b;

    /* renamed from: c */
    private long[] f113461c;

    /* renamed from: d */
    private long[] f113462d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected bfdb(bfdd bfdd) {
        super(null);
        this.f113459a = bfdd;
    }

    /* renamed from: a */
    public final void mo61442a() {
        bfdd bfdd = this.f113459a;
        this.f113460b = bfdd.f113466b;
        this.f113461c = bfdd.f113467c;
        this.f113462d = bfdd.f113468d;
    }

    /* renamed from: b */
    public final void mo61445b() {
        this.f113460b = null;
        this.f113461c = null;
        this.f113462d = null;
    }

    /* renamed from: b */
    public final void mo61446b(int i) {
    }

    /* renamed from: a */
    public final void mo61443a(int i) {
        bfdd bfdd = this.f113459a;
        bfdd.f113466b = new int[i];
        bfdd.f113467c = new long[i];
        bfdd.f113468d = new long[i];
    }

    /* renamed from: a */
    public final void mo61444a(int i, int i2) {
        long[] jArr;
        long[] jArr2;
        int[] iArr = this.f113460b;
        if (iArr != null && (jArr = this.f113461c) != null && (jArr2 = this.f113462d) != null) {
            bfdd bfdd = this.f113459a;
            bfdd.f113466b[i2] = iArr[i];
            bfdd.f113467c[i2] = jArr[i];
            bfdd.f113468d[i2] = jArr2[i];
        }
    }
}
