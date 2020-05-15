package p000;

/* renamed from: aydy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aydy implements aydu {

    /* renamed from: a */
    private final long f97265a;

    /* renamed from: b */
    private final long f97266b;

    /* renamed from: c */
    private final aydx[] f97267c = new aydx[50];

    /* renamed from: d */
    private int f97268d;

    public aydy(Long l) {
        this.f97265a = l.longValue();
        this.f97266b = l.longValue() / 50;
        this.f97268d = 0;
    }

    /* renamed from: a */
    private final aydx m83870a() {
        aydx aydx = this.f97267c[this.f97268d];
        if (aydx != null) {
            return aydx;
        }
        aydx aydx2 = new aydx();
        this.f97267c[this.f97268d] = aydx2;
        return aydx2;
    }

    /* renamed from: b */
    private final long m83871b(long j) {
        long j2 = this.f97266b;
        return ((j / j2) * j2) + j2;
    }

    /* renamed from: a */
    public final long mo53973a(long j) {
        aydx aydx;
        long b = m83871b(j) - this.f97265a;
        int i = this.f97268d;
        long j2 = 0;
        for (int i2 = 0; i2 < 50 && (aydx = this.f97267c[i]) != null && aydx.f97264b > b; i2++) {
            j2 += aydx.f97263a;
            if (i == 0) {
                i = 50;
            }
            i--;
        }
        return j2;
    }

    /* renamed from: a */
    public final void mo53974a(long j, long j2) {
        aydx a = m83870a();
        if (j > a.f97264b) {
            int i = this.f97268d + 1;
            this.f97268d = i;
            if (i == 50) {
                this.f97268d = 0;
            }
            a = m83870a();
            a.f97263a = 0;
            a.f97264b = m83871b(j);
        }
        a.f97263a += j2;
    }
}
