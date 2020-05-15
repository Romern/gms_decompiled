package p000;

/* renamed from: berr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class berr {

    /* renamed from: a */
    public bgmj f112231a;

    /* renamed from: b */
    public bgmj f112232b;

    /* renamed from: c */
    public bgmj f112233c;

    /* renamed from: d */
    public long f112234d = Long.MAX_VALUE;

    /* renamed from: e */
    public long f112235e = Long.MAX_VALUE;

    public berr(bgns bgns) {
        this.f112231a = bgns.mo62912a();
        this.f112232b = bgns.mo62912a();
        this.f112233c = bgns.mo62912a();
    }

    /* renamed from: a */
    public final void mo61064a(bgns bgns) {
        double d = (double) this.f112235e;
        double d2 = (double) this.f112234d;
        Double.isNaN(d);
        if (d * 1.5d >= d2) {
            Double.isNaN(d2);
            if (d2 * 1.5d >= d) {
                bgmj a = bgns.mo62912a();
                this.f112233c = a;
                a.mo63004a(this.f112231a);
                this.f112233c.mo63004a(this.f112232b);
                return;
            }
            this.f112233c = this.f112231a;
            return;
        }
        this.f112233c = this.f112232b;
    }
}
