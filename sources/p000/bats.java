package p000;

/* renamed from: bats */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bats {

    /* renamed from: a */
    private final bnsn f101727a;

    /* renamed from: b */
    private final bnsn f101728b;

    /* renamed from: c */
    private final batu f101729c;

    /* renamed from: d */
    private final bmzi f101730d;

    /* renamed from: e */
    private final bmzi f101731e;

    public bats(bnsn bnsn, bnsn bnsn2, batu batu, bmzi bmzi, bmzi bmzi2, batt batt) {
        batt.m87535a(batt);
        this.f101727a = bnsn;
        this.f101728b = bnsn2;
        this.f101729c = batu;
        this.f101730d = bmzi;
        this.f101731e = bmzi2;
    }

    /* renamed from: a */
    private final bnsn m87530a(long j) {
        return !this.f101729c.mo35048a(j) ? this.f101727a : this.f101728b;
    }

    /* renamed from: b */
    public final bnsi mo55956b() {
        return m87530a(((Long) this.f101730d.mo6606a()).longValue()).mo68388c();
    }

    /* renamed from: c */
    public final bnsi mo55957c() {
        return m87530a(((Long) this.f101731e.mo6606a()).longValue()).mo68387b();
    }

    /* renamed from: a */
    public final bnsi mo55954a() {
        return this.f101727a.mo68390d();
    }

    /* renamed from: a */
    public final bnsi mo55955a(int i) {
        if (i != 5) {
            return mo55957c();
        }
        return mo55956b();
    }
}
