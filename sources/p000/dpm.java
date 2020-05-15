package p000;

/* renamed from: dpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dpm {

    /* renamed from: a */
    public final int f13759a;

    /* renamed from: b */
    public int f13760b;

    /* renamed from: c */
    public int f13761c;

    /* renamed from: d */
    public int f13762d;

    /* renamed from: e */
    public int f13763e;

    /* renamed from: f */
    public long f13764f;

    public dpm(int i) {
        this.f13759a = i;
        mo9395a();
    }

    /* renamed from: a */
    public final void mo9395a() {
        this.f13760b = 0;
        this.f13761c = 0;
        this.f13762d = 0;
        this.f13763e = 0;
        this.f13764f = -1;
    }

    /* renamed from: a */
    public final void mo9396a(int i) {
        if (i != -1) {
            long j = this.f13764f;
            this.f13764f = j != -1 ? j + ((long) i) : (long) i;
        }
    }

    /* renamed from: a */
    public final boolean mo9397a(int i, int i2) {
        if (i != 0) {
            if (i == 3) {
                this.f13760b++;
                mo9396a(i2);
            } else if (i == 4) {
                this.f13761c++;
                mo9396a(i2);
            } else if (i != 5) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("dpm", "a", 80, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68409a("[FenceTriggerStatsImpl] Incorrect operation code %d", i);
                return false;
            }
            return true;
        } else if (this.f13759a == 1) {
            this.f13762d++;
            return true;
        }
        this.f13763e++;
        return true;
    }
}
