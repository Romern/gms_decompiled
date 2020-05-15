package p000;

/* renamed from: besx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class besx {

    /* renamed from: a */
    public int f112332a = 0;

    /* renamed from: b */
    public int f112333b = 0;

    /* renamed from: c */
    public long f112334c = -1;

    /* renamed from: d */
    public long f112335d = -1;

    /* renamed from: e */
    public long f112336e = -1;

    /* renamed from: a */
    public final void mo61112a(long j) {
        if (this.f112332a > 0 && j - this.f112335d > 250000) {
            this.f112334c = -1;
            this.f112335d = -1;
            this.f112332a = 0;
            this.f112333b = 0;
        }
        if (this.f112333b > 0 && j - this.f112336e > 1000000) {
            this.f112333b = 0;
        }
    }
}
