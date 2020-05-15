package p000;

/* renamed from: bzsk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bzsk implements bzrx {

    /* renamed from: a */
    private final bzrx f171260a;

    /* renamed from: b */
    private final long f171261b;

    /* renamed from: c */
    private final long f171262c;

    /* renamed from: d */
    private long f171263d;

    /* renamed from: e */
    private long f171264e;

    public bzsk(bzrx bzrx, int i) {
        boolean z;
        boolean z2;
        bzrx bzrx2 = bzrx;
        int i2 = i;
        boolean z3 = true;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Chunk granularity must be greater than 0.");
        long j = (long) i2;
        if (j < bzrx.mo20324e()) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108589a(z2, "Chunk granularity must be smaller than the read ahead limit.");
        long d = bzrx.mo20323d();
        long g = bzrx.mo20326g();
        if (g < 0) {
            while (bzrx.mo20327h() && bzrx.mo20323d() - bzrx.mo20321c() < bzrx.mo20324e()) {
                bzrx2.mo20317a(bzrx.mo20324e());
            }
            g = bzrx.mo20323d();
            bzrx.mo20325f();
            bzrx2.mo20317a(d - bzrx.mo20321c());
        } else {
            long c = bzrx.mo20321c() + bzrx.mo20324e();
            if (c > 0 && c < g) {
                g = c;
            }
        }
        long j2 = ((g - d) / j) * j;
        if (bzrx.mo20324e() < Long.MAX_VALUE) {
            bmxy.m108588a(j2 > bzrx.mo20324e() - (bzrx.mo20323d() - bzrx.mo20321c()) ? false : z3);
        }
        this.f171260a = bzrx2;
        this.f171261b = bzrx.mo20323d();
        this.f171262c = j2;
    }

    /* renamed from: a */
    public final synchronized int mo20316a(byte[] bArr, int i, int i2) {
        boolean z;
        int a;
        if (bArr.length - i >= i2) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Cannot read into a buffer smaller than given length");
        int min = (int) Math.min((long) i2, this.f171262c - this.f171263d);
        if (this.f171261b + this.f171263d != this.f171260a.mo20323d()) {
            this.f171260a.mo20325f();
            long c = (this.f171261b - this.f171260a.mo20321c()) + this.f171263d;
            while (c > 0) {
                c -= this.f171260a.mo20317a(c);
            }
        }
        a = this.f171260a.mo20316a(bArr, i, min);
        this.f171263d += (long) a;
        return a;
    }

    /* renamed from: b */
    public final synchronized void mo20320b() {
        this.f171264e = this.f171263d;
    }

    /* renamed from: c */
    public final synchronized long mo20321c() {
        return this.f171264e;
    }

    public final synchronized void close() {
        this.f171260a.close();
    }

    /* renamed from: d */
    public final synchronized long mo20323d() {
        return this.f171263d;
    }

    /* renamed from: e */
    public final synchronized long mo20324e() {
        return Long.MAX_VALUE;
    }

    /* renamed from: f */
    public final synchronized void mo20325f() {
        this.f171263d = this.f171264e;
    }

    /* renamed from: g */
    public final synchronized long mo20326g() {
        return this.f171262c;
    }

    /* renamed from: h */
    public final synchronized boolean mo20327h() {
        return this.f171263d < this.f171262c;
    }

    /* renamed from: a */
    public final synchronized long mo20317a(long j) {
        long a;
        long min = Math.min(j, this.f171262c - this.f171263d);
        if (this.f171261b + this.f171263d != this.f171260a.mo20323d()) {
            this.f171260a.mo20325f();
            long c = (this.f171261b - this.f171260a.mo20321c()) + this.f171263d;
            while (c > 0) {
                c -= this.f171260a.mo20317a(c);
            }
        }
        a = this.f171260a.mo20317a(min);
        this.f171263d += a;
        return a;
    }
}
