package p000;

/* renamed from: egu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class egu {

    /* renamed from: a */
    public final String f14881a;

    /* renamed from: b */
    public int[] f14882b;

    /* renamed from: c */
    private final long[] f14883c = new long[2];

    /* renamed from: d */
    private final long[] f14884d = new long[2];

    /* renamed from: e */
    private final long[] f14885e = new long[2];

    /* renamed from: f */
    private final long[] f14886f = new long[2];

    public egu(String str) {
        sdo.m34977c(str);
        this.f14881a = str;
        this.f14882b = new int[16];
        for (int i = 0; i < 2; i++) {
            this.f14883c[i] = 0;
            this.f14884d[i] = 0;
            this.f14885e[i] = Long.MAX_VALUE;
            this.f14886f[i] = 0;
        }
    }

    /* renamed from: a */
    public final long mo10110a(int i) {
        int i2 = this.f14882b[0];
        if (i2 == 0) {
            return 0;
        }
        double d = (double) this.f14883c[i];
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        return Math.round(d / d2);
    }

    /* renamed from: b */
    public final long mo10112b(int i) {
        if (this.f14882b[0] == 0) {
            return 0;
        }
        long a = mo10110a(i);
        double d = (double) this.f14884d[i];
        double d2 = (double) this.f14882b[0];
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) (a * a);
        Double.isNaN(d4);
        return Math.round(Math.sqrt(d3 - d4));
    }

    /* renamed from: c */
    public final long mo10113c(int i) {
        if (this.f14882b[0] != 0) {
            return this.f14885e[i];
        }
        return -1;
    }

    /* renamed from: d */
    public final long mo10114d(int i) {
        if (this.f14882b[0] != 0) {
            return this.f14886f[i];
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo10111a(long j, int i) {
        long[] jArr = this.f14883c;
        jArr[i] = jArr[i] + j;
        long[] jArr2 = this.f14884d;
        jArr2[i] = jArr2[i] + (j * j);
        long[] jArr3 = this.f14885e;
        jArr3[i] = Math.min(jArr3[i], j);
        long[] jArr4 = this.f14886f;
        jArr4[i] = Math.max(jArr4[i], j);
    }
}
