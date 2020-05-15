package p000;

/* renamed from: ciwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciwb implements ciwa {

    /* renamed from: a */
    public final int f191547a;

    /* renamed from: b */
    public final int f191548b;

    /* renamed from: c */
    public final cixh f191549c;

    /* renamed from: d */
    public final int f191550d;

    /* renamed from: e */
    public final cive f191551e;

    /* renamed from: f */
    public final ciwc f191552f;

    /* renamed from: g */
    public final civs f191553g;

    /* renamed from: h */
    private final byte[] f191554h;

    public ciwb(int i, int i2, cixh cixh, int i3, civs civs, cive cive, ciwc ciwc) {
        this.f191547a = i;
        this.f191548b = i2;
        this.f191549c = cixh;
        this.f191550d = i3;
        this.f191553g = civs;
        this.f191551e = cive;
        this.f191552f = ciwc;
        bxvd da = ciwd.f191560h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ciwd ciwd = (ciwd) da.f164949b;
        ciwd.f191562a |= 4;
        ciwd.f191565d = i3;
        bxtx a = bxtx.m123261a(civs.mo86595a());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ciwd ciwd2 = (ciwd) da.f164949b;
        a.getClass();
        ciwd2.f191562a |= 8;
        ciwd2.f191566e = a;
        bxtx a2 = bxtx.m123261a(cive.mo86588a());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ciwd ciwd3 = (ciwd) da.f164949b;
        a2.getClass();
        ciwd3.f191562a |= 16;
        ciwd3.f191567f = a2;
        bxtx a3 = bxtx.m123261a(ciwc.f191558d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ciwd ciwd4 = (ciwd) da.f164949b;
        a3.getClass();
        int i4 = ciwd4.f191562a | 32;
        ciwd4.f191562a = i4;
        ciwd4.f191568g = a3;
        ciwd4.f191562a = i4 | 1;
        ciwd4.f191563b = i2;
        if (cixh.mo86624a()) {
            int intValue = ((Integer) cixh.mo86625b()).intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ciwd ciwd5 = (ciwd) da.f164949b;
            ciwd5.f191562a |= 2;
            ciwd5.f191564c = intValue;
        }
        this.f191554h = cixd.m151108a(new byte[]{cixd.m151106a(this.f191547a)}, ((ciwd) da.mo74062i()).mo73642k());
    }

    /* renamed from: a */
    public final byte[] mo86602a() {
        return this.f191554h;
    }

    /* renamed from: b */
    public final int mo86603b() {
        return 3;
    }

    public ciwb(byte[] bArr) {
        cixh cixh;
        try {
            int a = cixd.m151107a(bArr[0]);
            this.f191547a = a;
            if (a > 3) {
                StringBuilder sb = new StringBuilder(28);
                sb.append("Unknown version: ");
                sb.append(a);
                throw new civj(sb.toString());
            } else if (a >= 3) {
                int i = -1;
                ciwd ciwd = (ciwd) bxvk.m124007a(ciwd.f191560h, bxtx.m123262a(bArr, 1, bArr.length - 1));
                int i2 = ciwd.f191562a;
                if ((i2 & 4) == 0 || (i2 & 8) == 0 || (i2 & 16) == 0 || (i2 & 32) == 0) {
                    throw new civi("Incomplete message.");
                }
                this.f191554h = bArr;
                this.f191548b = ciwd.f191563b;
                if ((i2 & 2) != 0) {
                    cixh = cixh.m151114a(Integer.valueOf(ciwd.f191564c));
                } else {
                    cixh = cixg.f191671a;
                }
                this.f191549c = cixh;
                this.f191550d = (ciwd.f191562a & 4) != 0 ? ciwd.f191565d : i;
                this.f191553g = civq.m151054b(ciwd.f191566e.mo73780k());
                this.f191551e = new cive(civq.m151054b(ciwd.f191567f.mo73780k()));
                this.f191552f = new ciwc(ciwd.f191568g.mo73780k());
            } else {
                StringBuilder sb2 = new StringBuilder(27);
                sb2.append("Legacy version: ");
                sb2.append(a);
                throw new civk(sb2.toString());
            }
        } catch (bxwf | civg | civk e) {
            throw new civi(e);
        }
    }
}
