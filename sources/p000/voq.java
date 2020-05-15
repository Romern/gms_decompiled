package p000;

/* renamed from: voq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class voq implements vpo {

    /* renamed from: a */
    private final int f49681a;

    /* renamed from: b */
    private final long f49682b;

    /* renamed from: c */
    private long f49683c;

    /* renamed from: d */
    private int f49684d;

    public voq(sqv sqv, bdyx bdyx, bdyx bdyx2, int i, long j) {
        sdo.m34959a(sqv);
        this.f49681a = ((Integer) bdyx.mo58455c()).intValue();
        this.f49682b = ((Long) bdyx2.mo58455c()).longValue();
        this.f49684d = i;
        this.f49683c = j;
    }

    /* renamed from: a */
    private final synchronized void m40940a(long j) {
        long j2 = j - this.f49683c;
        long j3 = this.f49682b;
        long j4 = -j3;
        int i = this.f49681a;
        long j5 = (long) i;
        if (j2 < j4 * j5) {
            this.f49683c = (j5 * j3) + j;
            j2 = j4;
        }
        if (j2 >= j3) {
            int i2 = (int) (((long) this.f49684d) + (j2 / j3));
            this.f49684d = i2;
            this.f49683c = j - (j2 % j3);
            this.f49684d = Math.min(i2, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized long mo28700a() {
        return this.f49683c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized int mo28701b() {
        return this.f49684d;
    }

    /* renamed from: c */
    public final synchronized boolean mo28702c() {
        m40940a(System.currentTimeMillis());
        return this.f49684d > 0;
    }

    /* renamed from: d */
    public final synchronized boolean mo28703d() {
        boolean c;
        c = mo28702c();
        if (c) {
            this.f49684d--;
        }
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized long mo28704e() {
        long currentTimeMillis = System.currentTimeMillis();
        m40940a(currentTimeMillis);
        int i = this.f49684d;
        if (i <= 0) {
            long j = this.f49683c + this.f49682b;
            this.f49683c = j;
            return j - currentTimeMillis;
        }
        this.f49684d = i - 1;
        return 0;
    }

    /* renamed from: f */
    public final synchronized void mo28705f() {
        long e = mo28704e();
        if (e > 0) {
            try {
                Thread.sleep(e);
            } catch (InterruptedException e2) {
                this.f49683c -= this.f49682b;
                throw e2;
            }
        }
    }

    /* renamed from: g */
    public final void mo28706g() {
    }
}
