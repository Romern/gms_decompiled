package p000;

/* renamed from: ciwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciwq {

    /* renamed from: a */
    public cixb f191608a;

    public ciwq() {
        this.f191608a = (cixb) ((ciww) cixb.f191646m.mo74144da()).mo74062i();
    }

    /* renamed from: a */
    public final cixf mo86609a(civs civs) {
        bxwc bxwc = this.f191608a.f191655h;
        int size = bxwc.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            ciwz ciwz = (ciwz) bxwc.get(i);
            try {
                if (civq.m151054b(ciwz.f191636b.mo73780k()).equals(civs)) {
                    return new cixf(ciwz, Integer.valueOf(i2));
                }
                i2++;
                i++;
            } catch (civg e) {
                civz.m151064a(e);
            }
        }
        return null;
    }

    /* renamed from: b */
    public final int mo86613b() {
        int i = this.f191608a.f191649b;
        if (i == 0) {
            return 2;
        }
        return i;
    }

    /* renamed from: c */
    public final cive mo86614c() {
        try {
            cixb cixb = this.f191608a;
            if ((cixb.f191648a & 4) != 0) {
                return new cive(cixb.f191651d.mo73780k());
            }
            return null;
        } catch (civg e) {
            civz.m151064a(e);
            return null;
        }
    }

    /* renamed from: d */
    public final cive mo86615d() {
        try {
            return new cive(this.f191608a.f191650c.mo73780k());
        } catch (civg e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public final ciwh mo86616e() {
        ciwz ciwz = this.f191608a.f191654g;
        if (ciwz == null) {
            ciwz = ciwz.f191633f;
        }
        ciwx ciwx = ciwz.f191638d;
        if (ciwx == null) {
            ciwx = ciwx.f191621d;
        }
        return new ciwh(civw.m151056a(mo86613b()), ciwx.f191625c.mo73780k(), ciwx.f191624b);
    }

    /* renamed from: f */
    public final civs mo86617f() {
        try {
            ciwz ciwz = this.f191608a.f191654g;
            if (ciwz == null) {
                ciwz = ciwz.f191633f;
            }
            return civq.m151054b(ciwz.f191636b.mo73780k());
        } catch (civg e) {
            throw new AssertionError(e);
        }
    }

    public ciwq(ciwq ciwq) {
        cixb cixb = ciwq.f191608a;
        bxvd bxvd = (bxvd) cixb.mo74142c(5);
        bxvd.mo73625a((bxvk) cixb);
        this.f191608a = (cixb) ((ciww) bxvd).mo74062i();
    }

    public ciwq(cixb cixb) {
        this.f191608a = cixb;
    }

    /* renamed from: a */
    public final void mo86610a(civt civt, ciwh ciwh) {
        bxvd da = ciwx.f191621d.mo74144da();
        bxtx a = bxtx.m123261a(ciwh.f191590a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ciwx ciwx = (ciwx) da.f164949b;
        a.getClass();
        int i = ciwx.f191623a | 2;
        ciwx.f191623a = i;
        ciwx.f191625c = a;
        int i2 = ciwh.f191591b;
        ciwx.f191623a = i | 1;
        ciwx.f191624b = i2;
        ciwx ciwx2 = (ciwx) da.mo74062i();
        bxvd da2 = ciwz.f191633f.mo74144da();
        bxtx a2 = bxtx.m123261a(civt.f191540a.mo86595a());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ciwz ciwz = (ciwz) da2.f164949b;
        a2.getClass();
        ciwz.f191635a |= 1;
        ciwz.f191636b = a2;
        bxtx a3 = bxtx.m123261a(civt.f191541b.f191538a);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ciwz ciwz2 = (ciwz) da2.f164949b;
        a3.getClass();
        int i3 = ciwz2.f191635a | 2;
        ciwz2.f191635a = i3;
        ciwz2.f191637c = a3;
        ciwx2.getClass();
        ciwz2.f191638d = ciwx2;
        ciwz2.f191635a = i3 | 4;
        ciwz ciwz3 = (ciwz) da2.mo74062i();
        cixb cixb = this.f191608a;
        bxvd bxvd = (bxvd) cixb.mo74142c(5);
        bxvd.mo73625a((bxvk) cixb);
        ciww ciww = (ciww) bxvd;
        if (ciww.f164950c) {
            ciww.mo74035c();
            ciww.f164950c = false;
        }
        cixb cixb2 = (cixb) ciww.f164949b;
        cixb cixb3 = cixb.f191646m;
        ciwz3.getClass();
        cixb2.f191654g = ciwz3;
        cixb2.f191648a |= 32;
        this.f191608a = (cixb) ciww.mo74062i();
    }

    /* renamed from: a */
    public final void mo86611a(ciwk ciwk) {
        cixb cixb = this.f191608a;
        bxvd bxvd = (bxvd) cixb.mo74142c(5);
        bxvd.mo73625a((bxvk) cixb);
        ciww ciww = (ciww) bxvd;
        bxtx a = bxtx.m123261a(ciwk.f191599a);
        if (ciww.f164950c) {
            ciww.mo74035c();
            ciww.f164950c = false;
        }
        cixb cixb2 = (cixb) ciww.f164949b;
        cixb cixb3 = cixb.f191646m;
        a.getClass();
        cixb2.f191648a |= 8;
        cixb2.f191652e = a;
        this.f191608a = (cixb) ciww.mo74062i();
    }

    /* renamed from: a */
    public final byte[] mo86612a() {
        return this.f191608a.f191659l.mo73780k();
    }
}
