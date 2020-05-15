package p000;

/* renamed from: brys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brys extends chuy {

    /* renamed from: a */
    private final Object f143685a = new Object();

    /* renamed from: b */
    private boolean f143686b;

    /* renamed from: c */
    private long f143687c;

    /* renamed from: d */
    private long f143688d;

    /* renamed from: e */
    private final bryr f143689e;

    /* renamed from: a */
    public final void mo70087a() {
        boolean z;
        boolean z2;
        boolean z3;
        synchronized (this.f143685a) {
            if (!this.f143686b) {
                bryr bryr = this.f143689e;
                long j = this.f143687c;
                boolean z4 = false;
                if (j >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                bmxy.m108589a(z, "Cannot record negative request bytes.");
                if (bryr.f143681j.getAndSet(j) == -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bmxy.m108601b(z2, "Already recorded request bytes.");
                bryr bryr2 = this.f143689e;
                long j2 = this.f143688d;
                if (j2 >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                bmxy.m108589a(z3, "Cannot record negative response bytes.");
                if (bryr2.f143682k.getAndSet(j2) == -1) {
                    z4 = true;
                }
                bmxy.m108601b(z4, "Already recorded response bytes.");
                this.f143686b = true;
            }
        }
    }

    /* renamed from: b */
    public final void mo70089b(long j) {
        synchronized (this.f143685a) {
            this.f143688d += j;
        }
    }

    public brys(bryr bryr) {
        this.f143689e = bryr;
    }

    /* renamed from: a */
    public final void mo70088a(long j) {
        synchronized (this.f143685a) {
            this.f143687c += j;
        }
    }
}
