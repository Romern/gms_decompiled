package p000;

/* renamed from: dwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dwg {

    /* renamed from: a */
    public final doh f14262a;

    /* renamed from: b */
    public final int f14263b;

    /* renamed from: c */
    public boolean f14264c;

    /* renamed from: d */
    public int f14265d;

    /* renamed from: e */
    public int f14266e;

    /* renamed from: f */
    public int f14267f;

    /* renamed from: g */
    private long f14268g;

    public dwg(doh doh, int i, int i2) {
        sdo.m34974b(i2 != 1);
        this.f14262a = doh;
        this.f14263b = i;
        this.f14264c = true;
        this.f14265d = i2;
        this.f14268g = 0;
        this.f14266e = 1;
        this.f14267f = 1;
    }

    /* renamed from: a */
    public final boolean mo9770a(int i) {
        if (i == 0) {
            return this.f14265d != 2 ? dwq.m9665i().mo20505a() - this.f14268g > cdgp.m133211t() && this.f14266e == 1 && this.f14267f != 3 : this.f14266e == 1 && this.f14267f != 2;
        }
        if (this.f14265d == 2) {
            int i2 = this.f14266e;
            return i2 == 1 ? this.f14267f != 2 : i2 == 3;
        }
        int i3 = this.f14266e;
        return i3 == 1 ? this.f14267f != 3 : i3 == 2;
    }

    /* renamed from: b */
    public final void mo9771b(int i) {
        boolean z = true;
        if (i == 1) {
            z = false;
        }
        sdo.m34974b(z);
        this.f14265d = i;
        this.f14268g = dwq.m9665i().mo20505a();
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("isSync", Boolean.valueOf(this.f14264c));
        int i = this.f14265d;
        int i2 = i - 1;
        if (i != 0) {
            a.mo25396a("client", Integer.valueOf(i2));
            a.mo25396a("time", Long.valueOf(this.f14268g));
            int i3 = this.f14266e;
            int i4 = i3 - 1;
            if (i3 != 0) {
                a.mo25396a("inProgServ", Integer.valueOf(i4));
                int i5 = this.f14267f;
                int i6 = i5 - 1;
                if (i5 != 0) {
                    a.mo25396a("confServ", Integer.valueOf(i6));
                    return a.toString();
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
