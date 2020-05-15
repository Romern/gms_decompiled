package p000;

/* renamed from: bgqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgqq {

    /* renamed from: a */
    public buou f117300a;

    /* renamed from: b */
    public long f117301b;

    /* renamed from: c */
    private final bmzi f117302c;

    /* renamed from: d */
    private final bmzi f117303d;

    static {
        srn.m36126a("QuakeTime", sgj.LOCATION);
    }

    public bgqq(bmzi bmzi, bmzi bmzi2) {
        this.f117302c = bmzi;
        this.f117303d = bmzi2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo63104a() {
        return ((Long) this.f117302c.mo6606a()).longValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final bgqp mo63107b() {
        return mo63108b(mo63104a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo63105a(long j) {
        return (j / 1000000) + (((Long) this.f117303d.mo6606a()).longValue() - ((Long) this.f117302c.mo6606a()).longValue());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final bgqp mo63108b(long j) {
        return this.f117300a != null ? new bgqo(this, j) : bgqn.f117297a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo63106a(int i, buow buow) {
        long a = mo63104a();
        bxvd da = buou.f154588c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buou buou = (buou) da.f164949b;
        buou.f154591b = i;
        buow.getClass();
        buou.f154590a = buow;
        buou buou2 = (buou) da.mo74062i();
        buou buou3 = this.f117300a;
        if (buou3 != null) {
            buow buow2 = buou3.f154590a;
            if (buow2 == null) {
                buow2 = buow.f154597c;
            }
            long quakeTimeExpireAgeMs = buow2.f154599a + cezv.f183536a.mo6606a().quakeTimeExpireAgeMs();
            buow buow3 = buou2.f154590a;
            if (buow3 == null) {
                buow3 = buow.f154597c;
            }
            if (quakeTimeExpireAgeMs > buow3.f154599a && this.f117300a.f154591b < buou2.f154591b) {
                return;
            }
        }
        this.f117300a = buou2;
        this.f117301b = a;
    }
}
