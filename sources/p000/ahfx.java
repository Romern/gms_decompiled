package p000;

/* renamed from: ahfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahfx {

    /* renamed from: a */
    public final qws f67129a;

    /* renamed from: b */
    public final qxq f67130b;

    /* renamed from: c */
    public ahtf f67131c;

    /* renamed from: d */
    private final ahfw f67132d;

    /* renamed from: e */
    private final int f67133e;

    public ahfx(int i, ahfw ahfw) {
        this(i, ahfw, null);
    }

    /* renamed from: b */
    private final qwo m55673b(String str, bxxc bxxc) {
        int i;
        bxvd da = bvez.f155827h.mo74144da();
        int i2 = this.f67133e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvez bvez = (bvez) da.f164949b;
        int i3 = i2 - 1;
        if (i2 != 0) {
            bvez.f155832d = i3;
            bvez.f155829a |= 4;
            ahtf ahtf = this.f67131c;
            if (ahtf == null || !ahtf.f67982a.mo73038b()) {
                i = ahfz.m55679a();
            } else {
                i = 6;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvez bvez2 = (bvez) da.f164949b;
            bvez2.f155831c = i - 1;
            int i4 = bvez2.f155829a | 2;
            bvez2.f155829a = i4;
            if (str == null) {
                str = "NULL";
            }
            str.getClass();
            bvez2.f155829a = i4 | 1;
            bvez2.f155830b = str;
            this.f67132d.mo36411a(da, bxxc);
            return this.f67129a.mo24335a(((bvez) da.mo74062i()).mo73642k());
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo36412a(bxxc bxxc, int i, int i2) {
        qwo b = m55673b(null, bxxc);
        b.mo24328b(i);
        b.mo24323a((long) i2);
        b.mo24327b();
    }

    public ahfx(int i, ahfw ahfw, String str) {
        this.f67133e = i;
        this.f67132d = ahfw;
        this.f67129a = new qws(rpr.m34216b(), "NEARBY", str);
        qxq qxq = new qxq(this.f67129a, "NEARBY_COUNTERS", 1024);
        this.f67130b = qxq;
        qxq.mo24374a();
    }

    /* renamed from: a */
    public final void mo36413a(String str, bxxc bxxc) {
        m55673b(str, bxxc).mo24327b();
    }
}
