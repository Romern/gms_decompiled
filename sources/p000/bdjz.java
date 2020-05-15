package p000;

/* renamed from: bdjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdjz {

    /* renamed from: a */
    public final cimv f105772a;

    /* renamed from: b */
    public final Long f105773b;

    /* renamed from: c */
    public final Long f105774c;

    /* renamed from: d */
    public final Long f105775d;

    /* renamed from: e */
    public final Long f105776e;

    /* renamed from: f */
    public final cimj f105777f;

    /* renamed from: g */
    public final String f105778g;

    /* renamed from: h */
    public final Boolean f105779h;

    /* renamed from: i */
    public final cimz f105780i;

    public bdjz(cimv cimv, Long l, Long l2, Long l3, Long l4, cimj cimj, String str, Boolean bool, cimz cimz) {
        this.f105772a = cimv;
        this.f105773b = l;
        this.f105774c = l2;
        this.f105775d = l3;
        this.f105776e = l4;
        this.f105777f = cimj;
        this.f105778g = str;
        this.f105779h = bool;
        this.f105780i = cimz;
    }

    public final String toString() {
        return String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", this.f105773b, this.f105774c, this.f105775d, this.f105776e, this.f105778g);
    }
}
